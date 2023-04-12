package pack03_array2;

public class Ex03_Array {
public static void main(String[] args) {
	//2차원 배열을 두 가지 방법으로 두 개 만들어보기
	//정방형: 모든 1차원 배열의 크기가 같음
	int[][] array1 = new int[3][4];
	//비정방형: 1차원 배열의 크기가 다름
	int[] arr = new int[2];
	int[][] array2 = {
		arr,
		{1,2,3,4},
		{5,6,7},
		{8,9,10,11,12}
	};
	//3. 2차원 배열은 1차원 배열을 요소로 가진다.(== 1차원 배열을 여러 개 그룹화해 놓은 것)
	//1차원 배열의 개수만 정확하게 주어졌을 때 사용하는 방법.
	int[][] array3 = new int[5][];
	array3[0] = new int[3]; //int[] arr = {1,2}; <-중괄호 초기화식은 최초 한 번만 가능함.
	System.out.println(array3[1].length);
	
	
	
	
	
	
	
	
}
}
