package apck08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// ���ڿ� = "12" + 34 = �� 1234
		// String + int = �� String
		// Why? ���ڿ�+ � �� = ���ڿ� ��Ģ
		// ���ڿ� ������ ��Ģ 
		// "1"(String) =/= 1(����)
		String sum = "12" + 34;
		// � ���� String���� �ٲٴ� ���� ��û���� �����ϴ�.
		String sum2 = 1234 + ""  ;
		System.out.println(sum2);
		
		//"1234" + "1234" = 12341234
		//sum + sum2 = 12341234
		//���� 1234+1234=2468�� ����� ���� �Ѵ�.
		//String => int ?
		// int,  double ���� ��������� �۾� �ٲ�� �� => �⺻Ÿ��
		// �빮�ڷ� �����ϴ� �͵��� ��κ� ClassŸ��
		// �⺻ ������ Ÿ���� Wrapper class��� ���� ������ �ִ�.
		//int => Integer, double Double
		// String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
		// String�� �ִ� ""<=�� �����Ѵ�.
		int num = Integer.parseInt(sum)+1234;
		int num2 = Integer.parseInt(sum2);
		System.out.println(num);
		System.out.println(num+num2);
		String sAvg = "88.6";
		double dAvg = Double.parseDouble(sAvg)+10;
		System.out.println(dAvg);
		String str3 = "456";
		int num3 = Integer.parseInt(str3);
		System.out.println(num3);
		//WrapperClass.parseDataType(String);=> DataType
		String str = "123";
	    int i1 = Integer.parseInt(str);
		System.out.println(i1);
		//�ܼ�â�� Ȯ���ϱ� (������ �� == ����)
		
		
		//Float.parseFloat(sAvg);
		//Long.parseLong(sAvg);
		//Byte.parseByte(sAvg);
		
		
	}

}
