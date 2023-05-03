package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01_TryCatch {
public static void main(String[] args) {
	//try {
	//����(����)�� �߻��� ���ɼ��� �ִ� �ڵ�(�ڵ� ��ü�� ����);
	//a<-x(�ڵ尡 ������)
	//Integer.parseInt(sc.nextLine()); <-������� �Է��� ���ڷ� �ٲٴ� ���.
//}catch(Exception e) {
	//���ܰ� �߻��� �� ó���� �ڵ�(����ڵ�)
//}(����)finally {
	//������ �� �� ����Ǿ�� �ϴ� �ڵ尡 �ִٸ� �־���.
	//�����ͺ��̽��� ������ �����ϰų�, ������ ���´�.(ť��)
//}
	//�����ڵ������� �������� �� ������ �߻��ϰ� �ڵ��غ���.
	Scanner sc = new Scanner(System.in);
	try {
		double i=Double.parseDouble(sc.nextLine());
	System.out.println(i);
	}catch (Exception e) {
		System.out.println("������ �߻�");
	}
	System.out.println("����");
	
	//[������ ����]
	//���ϵ�������� ���� : ġ������ ���� �� ���α׷��� ������ �ȵ� (�׷���ī��, �޸� ����� ������)
	//�����Ʈ�������� ���� : ������ ���� �� ����(Exception)
	//		-Oracleȸ�翡���� ��� ���ܵ��� Ŭ������ ���� ������ �Ѵ�.
	//		-��) NullPointerException : null�� ���¿��� �ô� ���(����x)
	
	//[������ ����]
	//���Ȯ�� ����(���� ����)
	//		-���α׷��� ���� �غ��߸� ���ܰ� �߻��ϴ��� �� �� �ִ�.
	//		-���α׷����� �Ǽ�, ���迡 ���ؼ� �߻� : �����(���� ����) �۾��� ����.
	
	//��Ȯ�� ����(�Ϲ� ����)<<-����
	//		-���α׷� �ۼ� ��(�ڵ�)�� �ݵ�� ����ó���� ����߸� ����� ������ �͵��� ����(����o)
	//		-try {} catch {}���ָ� �ذ�� ��
	
	try {
		FileInputStream fis = new FileInputStream("abc.txt");
	} catch (FileNotFoundException e) {
		System.out.println("����");
		//e.printStackTrace();
	}
	
	
}
}