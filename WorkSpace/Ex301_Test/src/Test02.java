import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("입력된 데이터 : "+num);
		if(num%2==1&&num>0&&num<5) {
			System.out.println("비교 후 데이터 : 남자입니다.");
		}else if(num%2==0&&num>0&&num<5) {
			System.out.println("비교 후 데이터 : 여자입니다.");
		}else {
			System.out.println("비교 후 데이터 : 입력 오류입니다.");
		}
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		System.out.println("로그인중입니다.");
		if(id.equals("admin")&&pw.equals("admin1234")) {
			System.out.println("관리자님 환영합니다. admin님 접속");
		}else {
			System.out.println("잘못된 접근입니다. 아이디 또는 비밀번호를 확인하세요");
		}
		
		int dataA = Integer.parseInt(sc.nextLine());
		int dataB = Integer.parseInt(sc.nextLine());
		System.out.println("입력된 데이터 : dataA: "+dataA+", dataB: "+dataB);
		System.out.println("비교 후 데이터 : "+(dataA==dataB ? "dataA("+dataA+") == dataB("+dataB+")" : dataA > dataB ? "dataA("+dataA+") > dataB("+dataB+")" : "dataA("+dataA+") < dataB("+dataB+")"));
		
		num = Integer.parseInt(sc.nextLine());
		for(int i=0; i<num ; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		dataA = Integer.parseInt(sc.nextLine());
		dataB = Integer.parseInt(sc.nextLine());
		System.out.println("입력된 데이터 : dataA: "+dataA+", dataB: "+dataB);
		int i, j;
		if(dataA>dataB) {
			i = dataA;
			j = dataB;
		}else {
			j = dataA;
			i = dataB;
		}	
		while(i>=j) {
			String sum = ""+sum+"+"+j;
		} 
		
		
		
		
		
		
		
		
		
		
		
	}
}
