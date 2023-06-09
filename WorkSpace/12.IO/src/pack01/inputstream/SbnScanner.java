package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SbnScanner {
//  BufferReader를 사용해서 스캐너와 비슷한 구조를 만들어보기.
//	Scanner sc = new Scanner(System.in);
//	private InputStream in;
	private BufferedReader br;
	public SbnScanner(InputStream in) {
//		this.in = in;
		br = new BufferedReader(new InputStreamReader(in));
	}
	
	public String nextLine() {
		String inputData;
		try {
			inputData = br.readLine();
			return inputData; // 오류 없으면 입력된 것
		} catch (IOException e) {
			e.printStackTrace();
			return null; // 오류 발생 시 return
		}
	}
	public int nextInt() {
		int inputInt = -1;
		try {
			inputInt = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return inputInt;
	}
	
	
}
