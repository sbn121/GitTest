
public class EX07_Oper {
	public static void main(String[] args) {
		//=(����, �� �Ҵ�)
		// �� ������ (==, <, >, <=, >=)
		// �ʰ�, �̸� : 0<x<4 : 123
		// �̻�, ���� : 0<x<=4 : 1234
		int num = 10;
		String result = num ==10 ? "�´�" : "Ʋ����" ;
		//=�� ? ���� ������ ������ ���� Ʋ���� ������ ���
		
		int resultInt = num ==10 ? 1 : 2;
		System.out.println(result);
		System.out.println(resultInt);
		//String result01 = num<=9 ? "true" : "false" ;
		//System.out.println(result01);
		boolean result02 = num<=9 ? true : false;
		System.out.println(!result02);
	}
}
