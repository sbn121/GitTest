package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

public class Ex01_SystemIn {
	public static void main(String[] args) {//main�޼ҵ�==����Thread(�޸𸮸� �Ҵ�޾� ���α׷��� ���۵�)
		//Scanner �̿�� System.in
		try {
			int data = System.in.read();//�ַܼκ��� �Է¹��� �����͸� byteŸ������ �ް� ��
			System.out.println(data);
			InputStream is = System.in; //��� ��Ʈ�� : ���� ���� ����Ǵ� ��Ʈ��(static)
			
		} catch (IOException e) { //Input, Output : �����Ͱ� �����ų� ���� �� �߰��� ������ ����� �ݵ��, ����ó���� �������
			e.printStackTrace();
		}
		
	}
}