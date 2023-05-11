package pack03.mysqlplus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class SqlDAO {
	Connection conn; //sqlplus���� ������ ����ڸ�� ��й�ȣ�� �Է¹޾��� �� ������ �õ��ϴ� ���ᰴü
	PreparedStatement ps; //������ �����ϰ� �����ϴ� ��ü
	ResultSet rs; //����� �޾ƿ��� ���� ��ü
	
	
	public boolean checkConnection(String user, String password) {
		//���ο��� �Է��� ����ڸ�� ��й�ȣ�� ���� �޼ҵ���� ������ �;���.
		//SqlPlusMain���� checkConnection�޼ҵ带 ȣ���ϴµ� ����ڸ�� ��й�ȣ�� ��µ� �� �ְ� �غ���
		System.out.println("check : "+user +" "+ password);
		String url = "jdbc:oracle:thin:@127.0.01:1521:xe";
		//oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			
			if(!conn.isClosed()) {
				System.out.println(" ������ ���ӵ� "+conn.getMetaData().getDatabaseProductVersion());
			return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" ����Ŭ ����̹��� �غ� �� �Ǿ ����� �Ұ����� PC�Դϴ�. ");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(" �� �� ���� ���� �߻�! �����ڿ��� �����ϼ���. ");
		}
		
		return false;
		
	}

	public void sendSql(String sql) {
		try {
			ps = conn.prepareStatement(sql); //null(x), main���� ����ڰ� �Է��� sql������ sendSqlMethod�� ��������
			rs = ps.executeQuery();
			while(rs.next()) { //�����͸� ��ȸ�� �� �÷��� ��Ī�̳� �̸��� �𸣴� ���·� ��ȸ�� �ϸ�
							   //DTO�� ���� ���� ���� ������ �̷� ����� ����� �� �Ѵ�.
				for(int i=1; i<=rs.getMetaData().getColumnCount();i++) {
				System.out.print(rs.getString(i)); 
				}
				System.out.println();
				//�÷��� ���(��Ī)�� ���� �ݺ����� ���ؼ� �����ϰ� �� ������ �Ǽ���ŭ
				//�ݺ�ó���� �ʿ��ѵ� �ű������ �츮�� �۾��� �� �ʿ䰡 ����.
			}
		} catch (SQLException e) {
			System.out.println("sbnSqlplus Exception : "+e.getMessage());
		}
	}





}
