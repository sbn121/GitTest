package pack03_array2;

import java.util.Arrays;

public class TestLast {
public static void main(String[] args) {
	//2���� �迭�� ����
	//2���� �迭�� ũ��� Ÿ���� �����Ӱ� �ϱ�
	//2���� �迭�� ������ 2~9���� ���� �����ϰ� 2���� �迭�� ���� ��±��� �غ���
	int[][] array = new int[8][9];
	for(int i=2;i<10;i++) {
		for(int j=1;j<10;j++) {
			array[i-2][j-1] = i*j;
			System.out.print(i+"x"+j+"="+array[i-2][j-1]+" ");
		}
		System.out.println();
	}
	
	int[] arrA= {1,2,3,4};
	int[] arrB= {4,5,6,8};
	int[] arrC= arrA;
	arrA=arrB;
	arrB=arrC;
	System.out.println(Arrays.toString(arrA));
	System.out.println(Arrays.toString(arrB));
	
	
	int[] arr= {3,4,6,7,8,9,1,2,5};
	
	for(int i =0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int space = arr[i];
				arr[i] = arr[j];
				arr[j] = space; 
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	
	for(int i =0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int space = arr[i];
				arr[i] = arr[j];
				arr[j] = space;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	
	//--> 
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	
}
}