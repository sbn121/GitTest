package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex02_InputSingle {
	// -����ڰ� �����ڸ� �Է� ->Enter Key �Է�
	// -Enter�� �Է��ϴ� ���� ���α׷��� ����(Terminate : Ctrl+C)�� �ƴϴ�.
	// -CR(Carriage Return) : Ŀ���� ���� �� ������ �̵�(\r)
	// -LF(Line Feed) : Ŀ���� �� �� �Ʒ��� �̵�(\n) print, println
	public static void main(String[] args) {
		InputStream is = System.in;//�ܼ�â���κ��� �Է¹��� �� �ְ� �ʱ�ȭ�� �Ǿ�����(Console)
		System.out.print("������ 1���ڸ� �Է��ϼ��� : ");
		try {
			int data = is.read();
			System.out.println(data);//ASCII Code : A�� �Է��ϰ� Enter Key�� �Է�
			System.out.println((char)data); //A->65�� ����
			
			data = is.read();//���� �����Ͱ� ���� �ִ��� Ȯ�� -> 13
			System.out.println("���� ������ : "+data);//13(CR) Enter Key
			data = is.read();//���� �����Ͱ� ���� �ִ��� Ȯ�� -> 10
			System.out.println("���� ������ : "+data);//10(LF) Enter Key
			System.out.println("������\n\n");
			System.out.println("�ٹٲ�");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}	