package pack02_trycatch;

public class Ex04_TryNewCatch {
	public static void main(String[] args) {
		int sum = 0;
		//throw : ������ ���ܸ� �߻����� catch������ �����Ų��. (throw������,�ѱ��)
		try {
		
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(sum>=777) {
				throw new Exception("�������� 777�̻��� �Ǿ���"+sum);
			}
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sum);
		
		
		
		
		
	}
}