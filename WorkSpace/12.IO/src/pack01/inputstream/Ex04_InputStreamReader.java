package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {
	public static void main(String[] args) throws IOException {
		// InputStream�� ���������� byte������ �����͸� �ɰ��� ������.
		// ���ڸ� ������� �� ����� �߰��� �ڽİ�ü�� InputStreamReader
//		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("�ѱ� ���� ���ڸ� �Է��ϼ���.");
		int data; // for(��Ȯ�� �ݺ� Ƚ���� �� �� �� ȿ���� vs ��Ȯ�� �ݺ� Ƚ���� �𸦶� -> while)
		while((data = isr.read())!=-1) {
			System.out.println(data);
			if(data != 13 && data != 10) {
				System.out.println("�Է��Ͻ� ���ڴ� "+(char)data+"�Դϴ�." );
			}
		}
		System.out.println("����");
		
	}
}