
public class Ex08_Oper {
	public static void main(String[] args) {
		//�� ������ : ���ǹ��� ���� ����.
		//���� : � ���� ������ �Ǵ� ���������� �Ǵ��ϴ� ��
		//ID�� pw�� ���� �Է��� ���� DB�� �ִ� ����
		//��ġ�ϴ���? "�α���" : "���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���"
		//������ �ݵ�� true�� false�� ���� ���� �� �־�� �Ѵ�.
		int num1 = 10, num2 = 10;
		//���ǽ��� ����ϰ������� ����� �ݵ��true, false�� ���´�
		//==, !=, <=, >=, <, >
		boolean result1 = num1 == num2; //true
		boolean result2 = num1 != num2; //false
		boolean result3 = num1 <= num2; //true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);//t
		System.out.println(num1 < num2); //f
		System.out.println(num1 > num2); //f
		
		//���� ���� : ���� ������ (���� ���� ������ �Ǵ�)
		//�������� ��� true or false�� ����� ���´�.
		//���ǽ�A&&���ǽ�B : ���ǽ� A�� ��, ���ǽ� B�� ���� ��� >�ܿ��� FALSE
		//&&(AND, *, ������) : 1*1=1, 1*0=0;
		//���ǽ�A||���ǽ�B : ���ǽ� A, B�� �� �� ������ ��� ���� ��� ��
		//||(OR, +, ������):1+?=0, 0+0=0;
		System.out.println("����");
		System.out.println(10>5&&20>5);//t(t*t=t)
		System.out.println(10>5&&20<5);//f(t*f=f)
		System.out.println(5>10&&20>5);//f(f*t=f)
		System.out.println(5>10&&5>20);//f(f*f=f)
		
		System.out.println("����");
		System.out.println(10>5||20>5);//t(t+t=t)
		System.out.println(10>5||20<5);//t(t+f=t)
		System.out.println(5>10||20>5);//t(f+t=t)
		System.out.println(5>10||5>20);//f(f+f=f)
		//���ǽ� ������ &&, || �̿��ؼ� �� ���� ����
		System.out.println(10>5&&20>5||5>10);//t(t*t+f=t)
	}

}