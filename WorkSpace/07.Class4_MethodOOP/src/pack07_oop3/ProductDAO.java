package pack07_oop3;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.print("��ȣ : "+dto.getNum());
		System.out.print(", �̸� : "+dto.getName());
		System.out.print(", ���� : "+dto.getPrice()+"��");
		System.out.print(", ���� : "+dto.getCnt()+"��");
		System.out.println();
	}
	
	public void display(ProductDTO[] dtoArr) {
		for(int i=0;i<dtoArr.length;i++) {
			System.out.println(dtoArr[i].getNum());
		}
	}
	
	
}
