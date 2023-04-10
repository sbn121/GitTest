package pack02_array;

public class Ex02_Array {
public static void main(String[] args) {
	int[] scoreArray = new int[10];
	int sum= 0;
	for(int i=0;i<10;i++) {
		scoreArray[i]=(i+1)*10;
		System.out.println("scoreArray["+i+"] : "+scoreArray[i]);
		sum+=scoreArray[i];
	}
	System.out.println("ÃÑÇÕ : "+sum);
	System.out.println("Æò±Õ : "+(double)(sum/10));
	int j=0;
	int sum1=0;
	while(j<10) {
		scoreArray[j]=(j+1)*10;
		System.out.println("scoreArray["+j+"] : "+scoreArray[j]);
		sum1+=scoreArray[j];
		j++;
	}
	System.out.println("ÃÑÇÕ : "+sum1);
	System.out.println("Æò±Õ : "+(double)(sum1/10));
	
	
	
	
	
	
	
}
}
