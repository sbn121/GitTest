package pack03_array2;

public class Ex03_Array {
public static void main(String[] args) {
	//2���� �迭�� �� ���� ������� �� �� ������
	//������: ��� 1���� �迭�� ũ�Ⱑ ����
	int[][] array1 = new int[3][4];
	//��������: 1���� �迭�� ũ�Ⱑ �ٸ�
	int[] arr = new int[2];
	int[][] array2 = {
		arr,
		{1,2,3,4},
		{5,6,7},
		{8,9,10,11,12}
	};
	//3. 2���� �迭�� 1���� �迭�� ��ҷ� ������.(== 1���� �迭�� ���� �� �׷�ȭ�� ���� ��)
	//1���� �迭�� ������ ��Ȯ�ϰ� �־����� �� ����ϴ� ���.
	int[][] array3 = new int[5][];
	array3[0] = new int[3]; //int[] arr = {1,2}; <-�߰�ȣ �ʱ�ȭ���� ���� �� ���� ������.
	System.out.println(array3[1].length);
	
	
	
	
	
	
	
	
}
}