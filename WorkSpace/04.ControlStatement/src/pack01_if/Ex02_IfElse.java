package pack01_if;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if��:�ܼ� if(���ǽ��� �ְ� �ش��ϴ� ���ǽ��� TRUE�� ����� ��ŷ
		//(����{})�� ���� �ڵ����)
		//if-else��:�ܼ� if���� ���ǽ��� TRUE�� ���� ������ �Ǵ� ���ŷ����� ����.
		//if�� ���ǽ��� TRUE�� �ƴ� FALSE��� else��� Ű���带 if�� �ڿ� �ٿ���
		//FALSE ����θ� ����� ��.
		int score = 85;
		
		if(score%2==0) {
			System.out.println("¦��");
		}else {           //if�� �ڿ� ���(Ȧ�� ��� �Ұ�)
			System.out.println("Ȧ��");
		}
		int num1 = 9, num2= 9;
		if(num1<num2) {
			System.out.println("num2 ŭ");
		}else {
			System.out.println("num1 ŭ");
		}
//		if(num1==num2) {
//			System.out.println("����");
//		}
//		if(score%2==1) {
//			System.out.println("Ȧ��");
//		}
	}//main
}//class
