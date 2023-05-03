import java.util.Scanner;

public class GetterSetterMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GetterSetter gs = new GetterSetter();
		int num = Integer.parseInt(sc.nextLine());
		
		gs.method(num);
		
	}
}
