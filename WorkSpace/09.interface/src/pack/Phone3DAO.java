package pack;

public class Phone3DAO extends Phone2DAO {
	public void internetOn(Phone3DTO dto) {
		System.out.println("���ͳ� ����� �����մϴ�.");
		dto.setState("���ͳ� ����");
	}
	public void internetOff(Phone3DTO dto) {
		System.out.println("���ͳ� ����� �����մϴ�.");
		dto.setState("����");
	}
	public void webtoonOn(Phone3DTO dto) {
		System.out.println("���� ���� �����մϴ�.");
	}
	public void webtoonOff(Phone3DTO dto) {
		System.out.println("���� ���� �����մϴ�.");
	}
}