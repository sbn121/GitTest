package dao.dto.method;

public class HumanDAO {
	
	// ��� : DAO(�ν��Ͻ�ȭ 1)
		public void seeMovie(HumanDTO dto) {
			System.out.println(dto.eye + " ��" + dto.ear + "�� ��ȭ�� ���ϴ�.");
		}
		public void ask(HumanDTO dto) {
			System.out.println(dto.mouse + "���� ��ȭ��");
		}
		public void coding(HumanDTO dto) {
			System.out.println(dto.hand + "���� �ڵ���");
		}
}
