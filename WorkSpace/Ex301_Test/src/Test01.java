import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int dataI = 1;
		double dataD = 1.5;
		char dataC = 'A';
		String dataS = "SBN";
		System.out.println("������ ������ : "+dataI);
		System.out.println("�Ǽ��� ������ : "+dataD);
		System.out.println("���� : "+dataC);
		System.out.println("���ڿ� : "+dataS);
		
		System.out.println("|\\_/|");
		System.out.println("|q p|\t/}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'\t|");
		System.out.println("||_/=\\\\__|");
		System.out.println("�츮�� \"������\" �Դϴ�");
		
		Scanner sc = new Scanner(System.in);
		int iData = Integer.parseInt(sc.nextLine());
		System.out.println("����ڰ� �Է��� �� : "+iData);
		System.out.println("iData�� ��� �� : iData ("+iData+")");
		Double dData = Double.parseDouble(sc.nextLine());
		System.out.println("����ڰ� �Է��� �� : "+dData);
		System.out.println("dData�� ��� �� : dData ("+dData+")");
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println(num1+"�� "+num2+"���� �۽��ϴ�. "+(num1<num2 ? "TRUE" : "FALSE"));
		System.out.println(num1+"�� "+num2+"���� Ů�ϴ�. "+(num1>num2 ? "TRUE" : "FALSE"));
		System.out.println(num1+"�� "+num2+"�� �����ϴ�. "+(num1==num2 ? "TRUE" : "FALSE"));
		
		System.out.println(Integer.parseInt(sc.nextLine())%2==0 ? "¦��" : "Ȧ��");
	}
	
}