package pack01_if;

import java.util.Scanner;

public class TestIF {
public static void main(String[] args) {
	int code = 5;
	if(code==1||code==3) {
		System.out.println("����");
	}else if(code==2||code==4) {
		System.out.println("����");
	}else{
		System.out.println("����");
	}
	int random = (int) (Math.random()*6)+1;
	if(random==1) {
		System.out.println("1�� ����� �Ǿ����ϴ�.");
	}else if(random==2) {
		System.out.println("2�� ����� �Ǿ����ϴ�.");
	}else if(random==3) {
		System.out.println("3�� ����� �Ǿ����ϴ�.");
	}else if(random==4) {
		System.out.println("4�� ����� �Ǿ����ϴ�.");
	}else if(random==5) {
		System.out.println("5�� ����� �Ǿ����ϴ�.");
	}else if(random==6) {
		System.out.println("6�� ����� �Ǿ����ϴ�.");
	}
	int random2 = (int) (Math.random()*6)+1;
	if(random>random2) {
		System.out.println("���� �̰���ϴ�");
	}else if(random<random2) {
		System.out.println("��ǻ�Ͱ� �̰���ϴ�");
	}else {
		System.out.println("����");
	}
}
}
