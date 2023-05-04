package pack02.outputstream;

import java.io.IOException;
import java.io.OutputStream;

public class Ex01_SystemOut {
	public static void main(String[] args) throws IOException {
		// 이클립스에서(자바) 노드 스트림 : System.in, System.out
		// 콘솔창을 통해서 어떤 걸 입력받기 위해서 가장 처음 초기화가 자동으로 되어있는 InputStream -> System.in
		// Scanner sc = new Scanner( 'System.in' );
		// 콘솔창에 출력을 위해서 가장 처음으로 초기화가 되어있는 OutputStream -> System.out
		//  'System.out' .println <- 
		System.out.write(65); // byte에 65라는 데이터가 들어감 [65]...[]...[]
		System.out.flush(); // 내부에 들어있는 데이터를 강제로 출력시킨다. ↑
		
		OutputStream os = System.out;
		os.write(65);
		os.write(65);
		os.flush();
	}
}
