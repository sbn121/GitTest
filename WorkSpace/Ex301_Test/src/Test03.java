import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		int random = new Random().nextInt(10);
//		int[] numbers = new int[random];
//		for(int i=0; i<numbers.length;i++) {
//			numbers[i] = new Random().nextInt(10);
//		}
//		System.out.println(numbers.length);
		
		
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		

		System.out.println(inputData +" -> "+inputData.replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("four", "4").replaceAll("five", "5")
				.replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8")
				.replaceAll("nine", "9"));
		
		
		
		
		
		
		
		
		
		
	}
}
