package pack03_oop1;

public class StudentDAO {
	
	void display(StudentDTO dto) {
		System.out.println(dto.getNum());
		System.out.println(dto.getName());
		System.out.println(dto.getKorSco());
		System.out.println(dto.getMatSco());
		System.out.println(dto.getEngSco());
		System.out.println(dto.getSum());
		System.out.println(dto.getAvg());
	}
}
