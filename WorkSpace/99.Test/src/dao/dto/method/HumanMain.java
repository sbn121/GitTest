package dao.dto.method;

public class HumanMain {
	public static void main(String[] args) {
		HumanDAO dao = new HumanDAO();
		
		HumanDTO human = new HumanDTO();
		System.out.println(human.eye);
		System.out.println(human.ear);
		dao.coding(human);
		
		HumanDTO[] humanArr = new HumanDTO[5]; // null, null, null, null, null
		for(int i=0;i<humanArr.length;i++) {
			humanArr[i] = new HumanDTO(); // Human Ŭ������ ���� ��� ����� �޸𸮿� �ö�(����, �޼ҵ�)
			dao.ask(humanArr[i]);
		}
		System.out.println(humanArr[0].ear);
	}
}