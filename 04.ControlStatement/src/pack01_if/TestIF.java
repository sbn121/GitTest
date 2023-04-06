package pack01_if;

import java.util.Scanner;

public class TestIF {
public static void main(String[] args) {
	int code = 5;
	if(code==1||code==3) {
		System.out.println("남자");
	}else if(code==2||code==4) {
		System.out.println("여자");
	}else{
		System.out.println("오류");
	}
	int random = (int) (Math.random()*6)+1;
	if(random==1) {
		System.out.println("1이 출력이 되었습니다.");
	}else if(random==2) {
		System.out.println("2가 출력이 되었습니다.");
	}else if(random==3) {
		System.out.println("3이 출력이 되었습니다.");
	}else if(random==4) {
		System.out.println("4가 출력이 되었습니다.");
	}else if(random==5) {
		System.out.println("5가 출력이 되었습니다.");
	}else if(random==6) {
		System.out.println("6이 출력이 되었습니다.");
	}
	int random2 = (int) (Math.random()*6)+1;
	if(random>random2) {
		System.out.println("내가 이겼습니다");
	}else if(random<random2) {
		System.out.println("컴퓨터가 이겼습니다");
	}else {
		System.out.println("동점");
	}
}
}
