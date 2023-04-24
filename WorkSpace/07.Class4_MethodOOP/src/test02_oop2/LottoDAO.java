package test02_oop2;

import java.util.Scanner;

import test01_oop1.JapangiDTO;

public class LottoDAO {
	JapangiDTO[] lottoArr;
	
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		try {
		int rtnInt = Integer.parseInt(sc.nextLine());
		return rtnInt;
		}catch (Exception e) {
			System.out.println("숫자 값만 입력해주세요.");
		}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
