package pack07_oop3;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.print("번호 : "+dto.getNum());
		System.out.print(", 이름 : "+dto.getName());
		System.out.print(", 가격 : "+dto.getPrice()+"원");
		System.out.print(", 수량 : "+dto.getCnt()+"개");
		System.out.println();
	}
	
	public void display(ProductDTO[] dtoArr) {
		for(int i=0;i<dtoArr.length;i++) {
			System.out.println(dtoArr[i].getNum());
		}
	}
	
	
}
