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
		//자바프로젝트를 계속해서 만들고 있는데 해당하는 프로젝트가 기능을 가지고,
		//완성이 되어서 외부에서 사용이 되어야할 때 확장자로 추출이 될 수 있다.(export)
		//Scanner, Random 등은 사실 자바 프로젝트로 이미 만들어놓고 추출되어 기본 java언어에
		//포함되어있는 기능들이다.
//		BoardDAO dao = new BoardDAO();
//		List<BoardDTO> list = new ArrayList<BoardDTO>();
//		dao.getList();
		
		Phone3DAO dao = new Phone3DAO();
		
		Phone3DTO dto = new Phone3DTO("흰색", "애플", "켜짐", "정보없음");
		dao.callOn(dto);
		
		
		
		
		
		
		
		
	}
}
