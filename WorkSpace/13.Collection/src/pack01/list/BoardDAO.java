package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	
	
	//dao.getList()�޼ҵ�� : BoardDAO�� �ν��Ͻ�ȭ ������ ���� dao��� �̸��� ��ü�� �ǰ� dao.������ ����(�ν��Ͻ� ���) 
	//BoardDTO�� 3�� ���� - 3�� add��Ű�� ��
	//List�� return�ϴ� �޼ҵ��� - List<BoardDTO>�� �����������
	public List<BoardDTO> getList() {
		List<BoardDTO> list = new ArrayList<>();
//		BoardDTO dto1 = new BoardDTO(1, "����1", "����1")
		list.add(new BoardDTO(1, "����1", "����1"));
		list.add(new BoardDTO(2, "����2", "����2"));
		list.add(new BoardDTO(3, "����3", "����3"));
		return list;
		
	}
	void getDisplay(List<BoardDTO> list) {
		for(BoardDTO dto : list) {
			System.out.print(dto.getBoardNum());
			System.out.print(dto.getBoardTitle());
			System.out.println(dto.getBoardContent());
		}
		
	}
}