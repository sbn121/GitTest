package pack05_etc;

public class Ex02_Continue {
public static void main(String[] args) {
	//continue;<=>break;
	//break:����� ��������
	//continue:�ݺ������� continue�� ������ �ؿ� �ڵ带 ����x,
	//�ݺ��� (���ǽ�)�κ����� �̵�
	//continue�� ���󵵳��� ������ �˱�
	int j = 0;
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			continue;
		}
		j+=i;
	}
	System.out.println(j);
	
	
	
	
}
}