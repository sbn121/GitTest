package pack07_oop3;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[] dtoArr = new ProductDTO[5];
		ProductDAO dao = new ProductDAO();
		//0Product dto, 1Product dto, ... , 4Product dto
		//1. 처음 보는 타입을 배열로 묶을 때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해보기
		//2. 생성한 객체를 배열의 임의의 인텍스에 넣어보기
		//3. 객체 생성 시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수정
		//ProductDTO dto1 = new ProductDTO(1, "컴퓨터", 10000, 5);
		//dtoArr[0] = dto1;
		//dtoArr[0] = = new ProductDTO(1, "컴퓨터", 10000, 5);
		dtoArr[0] = new ProductDTO(1, "컴퓨터", 10000, 5);
		dtoArr[1] = new ProductDTO(2, "노트북", 20000, 4);
		dtoArr[2] = new ProductDTO(3, "태블릿", 30000, 8);
		dtoArr[3] = new ProductDTO(4, "핸드폰", 40000, 7);
		dtoArr[4] = new ProductDTO(5, "TV", 50000, 6);
		
		for(int i=0;i<dtoArr.length;i++) {
			System.out.println(dtoArr[i].getNum());
		}
		dao.display(dtoArr);
		
		
	
//		ProductDTO dto1 = new ProductDTO(1, "컴퓨터", 10000, 5);
//		ProductDTO dto2 = new ProductDTO(2, "노트북", 20000, 4);
//		ProductDTO dto3 = new ProductDTO(3, "태블릿", 30000, 8);
//		ProductDTO dto4 = new ProductDTO(4, "핸드폰", 40000, 7);
//		ProductDTO dto5 = new ProductDTO(5, "TV", 50000, 6);
//		System.out.println(dto.getCnt());//private 접근제한자로 변수의 바로 접근을 막아놓음
//		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);
		
		
		
		
	}
}
