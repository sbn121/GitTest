
public class Ex09_Oper {
	public static void main(String[] args) {
		//����Ÿ�� ������ = �� �񱳽� ? "��ȯ��1" : "��ȯ��2";
		//int result = num<10 ? 1: ��2 ? ��3 ... : ��� ���� ���� �ƴ� ��
		//score ��� ������ ����. �ش� ������ ���� 90���� ũ�ٸ�
		//A���. 80���� ũ�ٸ� B���...D���
		int score=41;
		//String grade = score > 90 ? "" : ""; < ���� ���
		String grade = score >90 ? "A" : score > 80 ? "B" : 
			score > 70 ? "C" : score > 60 ? "D" : "E";
		System.out.println(grade);
	}

}