package pack_fifa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIFASIGNUPDAO {
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

Scanner sc = new Scanner(System.in);	

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
	

	public void signup() {
		String id, password, name;
		int age;
		try {
		System.out.println("회원가입에 필요한 정보를 차례대로 입력해주세요.");
		while(true) {
		System.out.print("아이디 : ");
		id = sc.nextLine();
		conn = getConn(); 
		ps = conn.prepareStatement("SELECT * FROM FIFAMEMBER WHERE MEMBER_ID = '"+id+"'");
		rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("이미 존재하는 아이디입니다. 다른 아이디를 입력해주세요.");
		}else {
			System.out.println("사용가능한 아이디입니다.");
			break;
		}
		}
		System.out.print("비밀번호 : ");
		password = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = inputInt();
		conn = getConn(); 
		ps = conn.prepareStatement("INSERT INTO FIFAMEMBER (MEMBER_ID, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE) VALUES (?, ?, ?, ?)");
		ps.setString(1, id);
		ps.setString(2, password);
		ps.setString(3, name);
		ps.setInt(4, age);
		rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입을 실패하였습니다.");
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
