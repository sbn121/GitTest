package pack04_while;

import java.util.Scanner;

public class Test02_While {
public static void main(String[] args) {
	int i = 1;
	while(i<=5) {
		int j =1;
		while(j<=i) {
			System.out.print("��");
			j++;
		}
		System.out.println();
		i++;
	}
	
	int i4 = 5;
	while(i4>0) {
	int j = 1;
	while(j<=i4) {
		System.out.print("��");
		j++;
	}
	i4--;
	System.out.println();
	}
	
	Scanner sc = new Scanner(System.in);
	int i1 = Integer.parseInt(sc.nextLine());
	int i2 = 2;
	if(i1<2) {
		System.out.println("����");
	}else {
		while(i2<=i1) {
			int i3 =1;
			while(i3<=9) {
				System.out.print(i2+"x"+i3+"="+i2*i3+" ");
				i3++;
			}
			System.out.println();
			i2++;
		}
	}
	int j1=1; 
	while(j1<=5) {
		int j2=1; 
		while(j2<=j1){
			System.out.print("��");
			j2++;
		}
		System.out.println();
		j1++;
	}
	int j3=5;
	while(j3>=1) {
		int j4=1;
		while(j4<=j3) {
			System.out.print("��");
			j4++;
		}
		j3--;
		System.out.println();
	}
	while
	
	
	
	
	
	
}
}
