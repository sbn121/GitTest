package pack02.outputstream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex01_SystemOut {
	public static void main(String[] args) throws IOException {
		// ��Ŭ��������(�ڹ�) ��� ��Ʈ�� : System.in, System.out
		// �ܼ�â�� ���ؼ� � �� �Է¹ޱ� ���ؼ� ���� ó�� �ʱ�ȭ�� �ڵ����� �Ǿ��ִ� InputStream -> System.in
		// Scanner sc = new Scanner( 'System.in' );
		// �ܼ�â�� ����� ���ؼ� ���� ó������ �ʱ�ȭ�� �Ǿ��ִ� OutputStream -> System.out
		//  'System.out' .println <- 
		System.out.write(65); // byte�� 65��� �����Ͱ� �� [65]...[]...[]
		System.out.flush(); // ���ο� ����ִ� �����͸� ������ ��½�Ų��. ��
		
		OutputStream os = System.out;
		os.write(65);
		os.write(65);
		os.flush();
	}
}
