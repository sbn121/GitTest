package pack;

import java.util.Scanner;

public class Phone1DAO {
	
	public int inputNum() {
		while(true) {
		try {
			Scanner sc = new Scanner(System.in);
		int rtnNum = Integer.parseInt(sc.nextLine());
		return rtnNum;
		}catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
		}
		}
	}
	
	public void turnOn(Phone1DTO dto) {
		System.out.println("전원이 켜졌습니다.");
		dto.setState("켜짐");
	}
	public void turnOff(Phone1DTO dto) {
		System.out.println("전원이 꺼졌습니다.");
		dto.setState("꺼짐");
	}
	
	public void callOn(Phone1DTO dto) {
		System.out.println("전화를 받습니다.");
		dto.setState("전화중");
	}
	public void callOff(Phone1DTO dto) {
		System.out.println("전화를 끊습니다.");
		dto.setState("켜짐");
	}
	
	public void send(Phone1DTO dto) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextLine());
	}
	
	public void receive(Phone1DTO dto) {
		System.out.println("안녕");
	}
	
	
	
	
}
