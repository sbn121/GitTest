package pack01_if;

public class Ex05_ifElseIf {
	public static void main(String[] args) {
		//if else�����δ� � ������ �� �� true�� ����  
		//false���� �� ���� ��츸 ���� ���� ����
		//ex)¦��? Y(TRUE) else N(FALSE)
		//if(���ǽ� A) {
			//���ǽ�A�� TRUE�϶� ������ �ڵ带 �־��� 
		//} else if(���ǽ� B) {
		//���ǽ� A�� TRUE�� �ƴϰ� ���ǽ� B�� �� ������ �ڵ带 �־���
		//}else if (���ǽ�C){
		//���ǽ�A��B�� TRUE�� �ƴϰ� ���ǽ�C�϶� ������ �ڵ带 �־���.
		//}else {
		//���ǽ� A�� TRUE�� �ƴ� �� ������ �ڵ带 �־���. 
		//(��Ģ:IF�� ��ŷ ���� �ٿ��� ���)}
		int score = 93;
		if(score>=90) {
			System.out.println("A");
		}
		if(score<90&&score>=80) {
			System.out.println("B");
		}
		if(score<80&&score>=70) {
			System.out.println("C");
		}
		if(score<70) {
			System.out.println("D");
		}
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
			
}


	}


