package pack02_array;

public class Ex01_Array {
public static void main(String[] args) {
	//�迭 : �ڷ��� ������ �����ϰ� ����� �� �ַ� ����
	//��Ģ : "������" ������ Ÿ���� ��� ����ϰ� �ϸ� ������ ����ŭ ���� ó���ϴ� 
	//"��ü"-> �� �� ���� ũ��� �ٽ� �ٲٴ� �� �����ϴ�.
	//���� : dataType[] name = new dataType[size];
	//       ������Ÿ��[] �迭�̸� = new ������Ÿ��[ũ��];
	
	//���� ��ĳ�ʳ� ������ ó���� ������ �Է����� ���� ���� 5���� �غ���
	int score1 = 0, score2=0, score3=0, score4=0, score5=0;
	//score1~5�� : score1+2+...+5 = ��
	int[] scoreArray = new int[5];// 0[0] 1[0] 2[0] 3[0] 4[0] : 
	//�迭�� �ε��� ��Ģ : n�� ũ�Ⱑ �־��� �迭�� 0���� n-1������ �ּҸ� ������.
	System.out.println("scoreArray[0] �� : "+scoreArray[0]);
	System.out.println(scoreArray);//[I@5e91993f->�� ������ �޸� �ּ�(��x)
	scoreArray[0] = 10;//�迭�� ������ Ÿ���� �־������� �ش��ϴ� Ÿ���� ������� ����
	System.out.println("scoreArray[0] �� : "+scoreArray[0]);
	scoreArray[1] = 20;
	scoreArray[2] = 30;
	scoreArray[3] = 40;
	scoreArray[4] = 50;
	System.out.println("scoreArray[0] �� : "+scoreArray[0]);
	System.out.println("scoreArray[1] �� : "+scoreArray[1]);
	System.out.println("scoreArray[2] �� : "+scoreArray[2]);
	System.out.println("scoreArray[3] �� : "+scoreArray[3]);
	System.out.println("scoreArray[4] �� : "+scoreArray[4]);
	//�迭�� ũ�Ⱑ 100�̾��ٸ� ->�ݺ���
	
	for(int i=0;i<5;i++) {
		System.out.println("scoreArray["+i+"] �� : "+scoreArray[i]);
	}
	
	
	
}
}