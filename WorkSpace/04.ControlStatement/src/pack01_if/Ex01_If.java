package pack01_if;

public class Ex01_If {
	public static void main(String[] args) {//< ���α׷��� ������  
		//if��:��� �߿� ���ǹ��̴�.
		//� ������ �ְ� �ش� ������ TRUE�� ���� ����(��ŷ{})�� �����
		//�� ������ �ڵ带 �����Ѵ�.
		//���׿����ںκ��� ���� ����� ��밡��=>if���� ������ �ڵ��� ����ν� 
		//����� �����ϴ�.
		//if(���ǽġ�TRUE�� FALSE�� ����� ���� �� �ִ� �͡�) {
		     //���ǽ��� TRUE�� �� �����ϴ� �κ�.
		//}
		int score = 99;//������ �Է¹޾ƿ� ID�� PW�� ���� �� �����.
		if(score > 90) {
			//���ǽ��� TRUE�� ���� ������ �����ϴ�.
			System.out.println("������ 90���� ũ��.");
			System.out.println("����� A��� �Դϴ�.");
		}
		System.out.println("�Դ�");
		
		if(score%2==1) {
			System.out.println("score�� Ȧ��");
		}
		if(score%2==0) {
			System.out.println("score�� ¦��");
		}
		
	}//���α׷��� ����
}
