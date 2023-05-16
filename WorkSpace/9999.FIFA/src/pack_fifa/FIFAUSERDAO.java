package pack_fifa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class FIFAUSERDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	

	public Connection getConn() {
		String url = "jdbc:oracle:thin:@211.223.59.99:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			System.out.println(" 알 수 없는 오류 발생! 개발자에게 문의하세요. ");
		}
		return conn;
	}

	public void dbClose() {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

String id;
Scanner sc = new Scanner(System.in);	

	public boolean login() {
		
		int count = 0;
		while(count<3) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("select * from FIFAMEMBER "
							+ "where MEMBER_ID = '"+id+"' "
							+ "AND MEMBER_PASSWORD = '"+pw+"'");
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println("로그인 성공");
				return true;
			}else {
				System.out.println("로그인 실패 아이디 또는 비밀번호를 확인해주세요.");
			}
		} catch (SQLException e) {
			System.out.println("sbnSqlplus Exception : "+e.getMessage());
		}
		count++;
		}
		System.out.println("시도 횟수 3회 초과");
		return false;
	}
	

	
	
	public int inputInt() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int rtnInt = Integer.parseInt(sc.nextLine());
				return rtnInt;
			}catch (Exception e) {
				System.out.println("숫자 값만 입력해주세요.");
			}
		}
	}
	
	public void displayInfo() {
		try {
			System.out.print(rs.getInt("player_num")+" ");
		System.out.print(rs.getString("player_name")+" ");
		System.out.print(rs.getInt("player_age")+" ");
		System.out.print(rs.getString("height")+" ");
		System.out.print(rs.getString("main_foot")+" ");
		System.out.print(rs.getString("position")+" ");
		System.out.println(rs.getInt("price"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void searchMyPlayer() {
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("SELECT m.PLAYER_NUM, k.player_name, k.player_age, k.height, k.main_foot, k.position, k.price  from FIFAMYMEMBER m , korea k WHERE k.player_num = m.player_num and MEMBER_ID = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				displayInfo();
			}
			if(!rs.next()) {
				System.out.println("보유하고 있는 선수가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void formation() {
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("SELECT FORMATION from FIFAMEMBER WHERE MEMBER_ID = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
		System.out.println("현재 내 포메이션 : "+rs.getString("FORMATION"));
			}
		System.out.println("포메이션을 선택해주세요");
		System.out.println("1번 4-2-3-1\t2번 4-2-2-1-1\t3번 4-2-2-2\t4번 5-2-3");
		System.out.println("     ★    \t      ★    \t   ★   ★  \t★   ★   ★");
		System.out.println("  ★  ★  ★ \t      ★    \t ★       ★\t  ★   ★  ");
		System.out.println("   ★   ★  \t  ★       ★\t   ★   ★  \t★ ★ ★ ★ ★");
		System.out.println(" ★  ★ ★  ★\t    ★   ★  \t ★  ★ ★  ★\t    ☆    ");
		System.out.println("     ☆    \t  ★  ★ ★  ★\t     ☆    ");
		System.out.println("          \t      ☆    ");
		String[] formation = {"4-2-3-1", "4-2-2-1-1", "4-2-2-2", "5-2-3"};
		while(true) {
			int num = inputInt();
			if(num==1||num==2||num==3||num==4) {
				System.out.println(num+"번 포메이션이 선택되었습니다.");
				conn = getConn(); 
				ps = conn.prepareStatement("UPDATE FIFAMEMBER SET FORMATION = ? WHERE MEMBER_ID = ?");
				ps.setString(1, formation[num-1]);
				ps.setString(2, id);
				rs = ps.executeQuery();
				break;
			}else {
				System.out.println("입력오류 1~4사이의 수를 입력하세요.");
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void candidate() {
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("SELECT PLAYER_NUM FROM FIFAMYMEMBER WHERE MEMBER_ID = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
			conn = getConn(); 
			ps = conn.prepareStatement("SELECT m.PLAYER_NUM, k.player_name, k.player_age, k.height, k.main_foot, k.position, k.price  from FIFAMYMEMBER m , korea k WHERE k.player_num = m.player_num and MEMBER_ID = ? AND m.main = 'MAIN' ORDER BY PLAYER_NUM");
			ps.setString(1, id);
			rs = ps.executeQuery();
			System.out.println("=====주전 선수=====");
			while(rs.next()) {
				displayInfo();
			}
			conn = getConn();
			ps = conn.prepareStatement("select count(*) AS CNT\r\n"
					+ "from    fifamymember\r\n"
					+ "where   member_id = '1'\r\n"
					+ "and     main = 'MAIN'");
			rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getInt("CNT")<11) {
					conn = getConn(); 
					ps = conn.prepareStatement("SELECT m.PLAYER_NUM, k.player_name, k.player_age, k.height, k.main_foot, k.position, k.price  from FIFAMYMEMBER m , korea k WHERE k.player_num = m.player_num and MEMBER_ID = ? AND m.main = 'SERVE' ORDER BY PLAYER_NUM");
					ps.setString(1, id);
					rs = ps.executeQuery();
					System.out.println("=====후보 선수=====");
					while(rs.next()) {
						displayInfo();
					}
					System.out.println("주전으로 추가할 선수의 번호를 입력해주세요");
					while(true) {
					int num = inputInt();
					conn = getConn(); 
					ps = conn.prepareStatement("SELECT PLAYER_NUM FROM FIFAMYMEMBER WHERE PLAYER_NUM = ? AND MAIN = 'SERVE'");
					ps.setInt(1, num);
					rs = ps.executeQuery();
					if(rs.next()) {
						System.out.println("추가가 완료되었습니다.");
						conn = getConn(); 
						ps = conn.prepareStatement("UPDATE FIFAMYMEMBER SET MAIN = 'MAIN' WHERE PLAYER_NUM = ?");
						ps.setInt(1, num);
						rs = ps.executeQuery();
						conn = getConn(); 
						ps = conn.prepareStatement("SELECT m.PLAYER_NUM, k.player_name, k.player_age, k.height, k.main_foot, k.position, k.price  from FIFAMYMEMBER m , korea k WHERE k.player_num = m.player_num and MEMBER_ID = ? AND m.main = 'MAIN' ORDER BY PLAYER_NUM");
						ps.setString(1, id);
						rs = ps.executeQuery();
						System.out.println("=====주전 선수=====");
						while(rs.next()) {
							displayInfo();
						}
						break;
					}else {
						System.out.println("입력 오류 현재 소유하고 있는 후보 선수의 번호를 입력해주세요.");
					}
					}
				}else {
					
				}
			}
			}else {
				System.out.println("현재 소유하고 있는 선수가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public List<FIFADTO> displayList() {
		List<FIFADTO> list = new ArrayList<>();
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("SELECT * from korea order by 1");
			rs = ps.executeQuery();
			while(rs.next()) {
				FIFADTO dto = new FIFADTO(rs.getInt("PLAYER_NUM"), rs.getString("PLAYER_NAME"), rs.getInt("PLAYER_AGE"), rs.getString("HEIGHT"), rs.getString("MAIN_FOOT"), rs.getString("POSITION"), rs.getInt("PRICE"));
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("sbnSqlplus Exception : "+e.getMessage());
		}
		for(FIFADTO dto1 : list) {
			System.out.print(dto1.getPlayer_num()+"\t");
			System.out.print(dto1.getPlayer_name()+"\t");
			System.out.print(dto1.getPlayer_age()+"\t");
			System.out.print(dto1.getHeight()+"\t");
			System.out.print(dto1.getMain_foot()+"\t");
			System.out.print(dto1.getPosition()+"\t");
			System.out.println(dto1.getPrice());
		}
		return list;
	}
	
	public void buyPlayer() {
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("select player_num from korea where player_num = ?");
			ps.setString(1, id);
			rs = ps.executeQuery();
		displayList();
		System.out.println("현재 소지 Bp : ");
		System.out.println("구매하실 선수의 번호를 입력해주세요.");
		while(true) {
		int num = inputInt();
			conn = getConn(); 
			ps = conn.prepareStatement("select player_num from korea where player_num = ?");
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				break;
			}else {
				System.out.println("입력하신 번호에 해당하는 선수가 없습니다. 다시 입력해주세요.");
			}
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void sellPlayer() {
		
	}
	
	public int chargeBp() {
		System.out.println("충전할 금액을 선택해주세요.");
		System.out.println("1. 1억bp(1,000원) 2. 5억bp(5,000원) 3. 10억bp(10,000원) 4. 100억bp(100,000원)");
		int bp = inputInt();
		while(true) {
			if(bp==1||bp==2||bp==3||bp==4) {
				System.out.println();
			}
		}
		
	}
	
	public void state() {
		
	}
	
	public void signout() {
		System.out.println("비밀번호 : ");
		
		try {
			conn = getConn(); 
			ps = conn.prepareStatement("select * from FIFAMEMBER where MEMBER_ID = '"+id+"' "
							+ "AND MEMBER_PASSWORD = '"+sc.nextLine()+"'");
			rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("회원 탈퇴가 완료되었습니다.");
			conn = getConn(); 
			ps = conn.prepareStatement("DELETE FROM FIFAMEMBER WHERE MEMBER_ID = '"+id+"'");
			rs = ps.executeQuery();
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
