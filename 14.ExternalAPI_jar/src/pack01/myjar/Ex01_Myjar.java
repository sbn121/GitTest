package pack01.myjar;

import java.util.ArrayList;
import java.util.List;

import pack.Phone3;
import pack.Phone3DAO;
import pack.Phone3DTO;
import pack01.list.BoardDAO;
import pack01.list.BoardDTO;

public class Ex01_Myjar {
	public static void main(String[] args) {
		//�ڹ�������Ʈ�� ����ؼ� ����� �ִµ� �ش��ϴ� ������Ʈ�� ����� ������,
		//�ϼ��� �Ǿ �ܺο��� ����� �Ǿ���� �� Ȯ���ڷ� ������ �� �� �ִ�.(export)
		//Scanner, Random ���� ��� �ڹ� ������Ʈ�� �̹� �������� ����Ǿ� �⺻ java��
		//���ԵǾ��ִ� ��ɵ��̴�.
//		BoardDAO dao = new BoardDAO();
//		List<BoardDTO> list = new ArrayList<BoardDTO>();
//		dao.getList();
		
		Phone3DAO dao = new Phone3DAO();
		
		Phone3DTO dto = new Phone3DTO("���", "����", "����", "��������");
		dao.callOn(dto);
		
		
		
		
		
		
		
		
	}
}
