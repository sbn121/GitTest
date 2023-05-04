package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
		// Ű���忡�� ���� ���ڸ� �Է¹޾Ƽ� �� ������ �۾� : Scanner���� ���� ���ؿ��� ���� Ǯ �� Buffer����� ������
		// InputStream -> InputStreamReader -> BufferedReader
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String inputData = br.readLine();
		System.out.println("�Է��Ͻ� ���ڴ� "+inputData+"�Դϴ�.");
		br.close(); // ��� �� �ݾ��ش�.(���� off)
		
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
	}
}
