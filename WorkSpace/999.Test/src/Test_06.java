
public class Test_06 {
	public static void main(String[] args) {
		//���� ��Ģ(���ַ̹�) : Class(.java)������ �빮�ڷ� �����ϱ�.
		//������ �ҹ��ڷ� �����ϴµ� �ǹ��ִ� �ܾ �����ؼ� ������.
		int subKor, subMat, subEng, subSci, subPhy;
		subKor = 10;
		subMat = 11;
		subEng = 12;
		subSci = 13;
		subPhy = 14;
		System.out.println(subKor);
		System.out.println(subMat);
		System.out.println(subEng);
		System.out.println(subSci);
		System.out.println(subPhy);
		
		// ����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		// ex) int <-> double, String <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5;//�ڵ� ����ȯ
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���.
		//�����ڰ� � Ÿ������ �ٲ� ���� ���ø� ���༭ ������ �ٲ�.
		iValue = (int) dValue;//���� ����ȯ > �Ҽ��� ����
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		
		String str = "1234" + 12 ;// 123412
		//���ڿ��� � ���� ���ϴ� �� > ��x, ����(������ ��ħ)
		int iData = 1234 + 12;//1246
		//������ �������� ���� > ���� ��ħ
		System.out.println(str);
		System.out.println(iData);
		
		int i1 = Integer.parseInt(str)+1;
		System.out.println(i1);
		
		// boolean(�ο���) true �Ǵ� false�� ������ ������.
		
		String sum1 = ""+123+456+"�����ٶ�";
				
		
	}

}