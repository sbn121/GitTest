package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex05_Throws {
	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("a");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	//�޼ҵ��� ����� ���� �Լ��� �ִµ� ������ �߻����� �� ���� try{} catch{}�� ó���ϴ� �� �ƴ϶�
	//���� �������� ó���ϰ� ���ѱ�
	public static void errorMethod() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("a");
	}
	
}
