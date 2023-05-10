package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Ex01_Jdbc {
	public static void main(String[] args) {
		//JDBC : Java DataBaseConnectivity (API)
		//Connection : ���ᰴü (SqlDeveloper���� ���������� �ְ� ������ �ϴ� â)
		//Statement : ���۰�ü (Sql���� �ۼ��ϰ� �������� �� ����Ǵ� ������ â)
		//ResultSet : �����ü (select���� ��� ����� ǥ ������� �ؿ� ���� => ǥ)
//		OracleDriver : �ش� Ŭ������ �ʿ��ϴ�. (����Ŭ�� �����ϱ� ���ؼ���)
		Ex01_Jdbc ej = new Ex01_Jdbc();
		ej.connTest();
	}
	
	//�ڹ��ڵ带 ���ؼ� �����ͺ��̽��� ������ �������� Ȯ���ϴ� �޼ҵ�
	public void connTest() { //localhost == 127.0.0.1(oracle local)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";	//java���� oracle������ �� �տ� ������ �� 
		String user = "hr";
		String password = "0000";
		
		//Ŭ���� �����ε� (Ŭ������ �츮�� �ν��Ͻ�ȭ �ϴ� �� �ƴ϶� �ڹ� static���� �ڹٿ��� ����� �� �ְ� ����)
		//����Ŭ ������ ���� �� (����Ŭ���� �̷��� �϶�� ���� API)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//OracleDriver�� ���ٸ� ������ �߻��ϰ� �ִٸ� ���� �ڵ�����
			Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = conn.prepareStatement("select 100 data1 from dual"); // ;����, ������ ������ �ʱ�ȭ
			ResultSet rs = ps.executeQuery();	// ���� ����, ���� �� ��� rs�� ����
			//rs�� �ε����� ������ ���� ����.
			while(rs.next()) {
				System.out.println(rs.getInt("data1")); //getInt�� ������ ����� �������� �� ���� �޼ҵ�
														//�޼ҵ尡 int���� String���� ���� �� �ְ� �����ε� �Ǿ��ִµ�
														//String�� ����� => �÷��� �̸����� �����͸� �������� �� ��Ȯ�ϴ�.
			}
			if(conn.isClosed()) {
				System.out.println("����");
			}else {
				System.out.println("����");
			}
		} catch (Exception e) {//catch����ŷ�� ���� �� �����ϸ� ������ ������ ���� ó���� �����ѵ�, �װ� �����ٸ� �ϳ���
								//ExceptionŬ������ ó���Ѵ�.
			e.printStackTrace();
		}
		
	}
	
}