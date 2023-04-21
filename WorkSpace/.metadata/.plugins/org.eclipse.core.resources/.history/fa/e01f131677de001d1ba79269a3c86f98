package pack03_oop1;

//Student Class : 학생의 성적정보를 관리할 수 있게 만든 설계도
public class Student {
	//멤버(필드) : 학생의 번호, 이름, 국어성적, 수학성적, 영어성적, 총점, 평균
	
	int num;
	String name;
	int korSco ,matSco ,engSco ,sum;
	double avg;
	
	public Student(int num, String name, int korSco, int matSco, int engSco) {
		this.num = num;
		this.name = name;
		this.korSco = korSco;
		this.matSco = matSco;
		this.engSco = engSco;
		this.sum = korSco+matSco+engSco;
		this.avg = (double)(korSco+matSco+engSco)/3;
	}

	void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(korSco);
		System.out.println(matSco);
		System.out.println(engSco);
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
