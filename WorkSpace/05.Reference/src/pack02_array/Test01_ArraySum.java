package pack02_array;

public class Test01_ArraySum {
public static void main(String[] args) {
	//10개의 크기를 가진 String형 배열 sArr이 있다.
		//sArr내부에는 문자열 1부터 각각의 인덱스에는 10까지가 할당이 되어있다.
		//sArr내부에 들어있는 문자열을 숫자로바꿔서 누적합을 구하고 출력해보기. 
	String[] sArr = {"1","2","3","4","5","6","7","8","9","10"};	
	int sum = 0;
		for(int i=0;i<10;i++) {
		sum += Integer.parseInt(sArr[i]);
	}
		System.out.println(sum);
	
	
	
	
}
}
