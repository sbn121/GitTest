package pack02.outputstream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex02_OutputStream {
	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("이것은 문자열의 데이터입니다. \n 줄바꿈");
		bw.newLine();
		bw.flush();
	}
}
