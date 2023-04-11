package pack03_array2;

public class Ex01_Array {
	//1���� �迭(Array) : ������ �ϳ��� ������ ���� �� ����. (ex String str = "a")
	//������ �ִ� ���� ������ Ÿ���� �ϳ��� ������� �׷��̶�� �����ϸ� ��
	//1���� �迭�� �����ϴ� ��� ->������(�����͵�)
	
	//2���� �迭 : 1���� �迭�� x��(����), y��(����) �������� �� �Ǵ� ���� �ִ� ����.
	//2���� �迭�� 1���� �迭�� ��ҷ� ������ ������ x��� y���� ���ÿ� ������ �ִ� �࿭����
	//[  [1] [2] [3]
	//   [4] [5] [6]
	//]
	
	//��Ģ : ���� �� == for�� ���� �����ָ� ��� index(�ּ�)�� ������ �����ϴ�.
public static void main(String[] args) {
	int[] array = new int[3];
	System.out.println("array�� ��� ù ��°(����) : "+array[0]);
	int[][] array2 = new int[2][3]; //2�� 3���� ������ �迭�� �ʱ�ȭ��Ŵ.
	
	//�迭�� ũ�� ��ȸ
	System.out.println("�迭�� ũ�� ��ȸ : "+array.length);
	System.out.println("2���� �迭 ���� 1���� ũ�� : "+array2[0].length);
	System.out.println("2���� �迭�� ũ�� ��ȸ : "+array2.length);
	//���� �ְ� ����غ���(�Ҵ�)
	//2���� �迭�� ������ �ִ� ù��° 1���� �迭�� ����
	//2�� 3���� ���� 2���� �迭�� �� 2x3�� 6���� �����͸� ǥ���� �� ����
	array2[0][0]=1;	//
	array2[0][1]=2;	//
	array2[0][2]=3;	//
	array2[1][0]=4;	//
	array2[1][1]=5;	//
	array2[1][2]=6;	//
	System.out.println("����� ����Ʈ");
	
	//�迭�� ũ��� ���������� �ٲ� ���� ����(2���� �迭����)
	//1���� �迭�� ��� ���� ũ�⸦ ������ �� �ƴ�.
	int count = 0;
	for(int i =0; i<array2.length;i++) {
		for(int j=0;j<array2[i].length;j++) {
			count++;
			array2[i][j] = count;
			System.out.println("array2["+i+"]["+j+"]="+array2[i][j]);
		}
	}
	int count1=0;
	int i=0; 
	while(i<array2.length) {
		int j=0;
		while(j<array2[i].length) {
			count1++;
			array2[i][j] = count1;
			System.out.println("array2["+i+"]["+j+"]="+array2[i][j]);
			j++;
		}
		i++;
	}
	
	
	
	
}
}