import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("�Էµ� ������ : "+num);
		if(num%2==1&&num>0&&num<5) {
			System.out.println("�� �� ������ : �����Դϴ�.");
		}else if(num%2==0&&num>0&&num<5) {
			System.out.println("�� �� ������ : �����Դϴ�.");
		}else {
			System.out.println("�� �� ������ : �Է� �����Դϴ�.");
		}
		
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.nextLine();
		System.out.println("�α������Դϴ�.");
		if(id.equals("admin")&&pw.equals("admin1234")) {
			System.out.println("�����ڴ� ȯ���մϴ�. admin�� ����");
		}else {
			System.out.println("�߸��� �����Դϴ�. ���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���");
		}
		
		int dataA = Integer.parseInt(sc.nextLine());
		int dataB = Integer.parseInt(sc.nextLine());
		System.out.println("�Էµ� ������ : dataA: "+dataA+", dataB: "+dataB);
		System.out.println("�� �� ������ : "+(dataA==dataB ? "dataA("+dataA+") == dataB("+dataB+")" : dataA > dataB ? "dataA("+dataA+") > dataB("+dataB+")" : "dataA("+dataA+") < dataB("+dataB+")"));
		
		num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num ; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		
		dataA = Integer.parseInt(sc.nextLine());
		dataB = Integer.parseInt(sc.nextLine());
		System.out.println("�Էµ� ������ : dataA: "+dataA+", dataB: "+dataB);
		int i = 0, j=0;
		int sum = 0;
		if(dataA>dataB) {
			i = dataA;
			j = dataB;
		}else {
			j = dataA;
			i = dataB;
		}
		String sSum = "��� ������ : ";
		while(i>=j) {
			sum +=j;
			if(sum==j) {
				sSum += j;
			}else {
				sSum += " + "+j;
			}
			j++;
		}
		System.out.println(sSum+" = "+sum);
		
		
		
		
		
		
		
		
		
		
	}
}