package pack01.inputstream;

import java.io.IOException;

public class ScannerMain {
	public static void main(String[] args) {
		SbnScanner ss = new SbnScanner(System.in);
		String inputData = ss.nextLine();
		System.out.println(inputData);
		int inputInt = ss.nextInt();
		System.out.println(inputInt);
	}
}
