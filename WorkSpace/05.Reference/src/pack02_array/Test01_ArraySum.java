package pack02_array;

public class Test01_ArraySum {
public static void main(String[] args) {
	//10���� ũ�⸦ ���� String�� �迭 sArr�� �ִ�.
		//sArr���ο��� ���ڿ� 1���� ������ �ε������� 10������ �Ҵ��� �Ǿ��ִ�.
		//sArr���ο� ����ִ� ���ڿ��� ���ڷιٲ㼭 �������� ���ϰ� ����غ���. 
	String[] sArr = {"1","2","3","4","5","6","7","8","9","10"};	
	int sum = 0;
		for(int i=0;i<10;i++) {
		sum += Integer.parseInt(sArr[i]);
	}
		System.out.println(sum);
	
	
	
	
}
}