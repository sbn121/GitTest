package pack07_oop3;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[] dtoArr = new ProductDTO[5];
		ProductDAO dao = new ProductDAO();
		//0Product dto, 1Product dto, ... , 4Product dto
		//1. ó�� ���� Ÿ���� �迭�� ���� �� ������� ������ �ش��ϴ� Ÿ���� ���� ��ü�� �����غ���
		//2. ������ ��ü�� �迭�� ������ ���ؽ��� �־��
		//3. ��ü ���� �� ����� ������ �Ǵ� ���� �迭�� �ε����� �ְ� ����
		//ProductDTO dto1 = new ProductDTO(1, "��ǻ��", 10000, 5);
		//dtoArr[0] = dto1;
		//dtoArr[0] = = new ProductDTO(1, "��ǻ��", 10000, 5);
		dtoArr[0] = new ProductDTO(1, "��ǻ��", 10000, 5);
		dtoArr[1] = new ProductDTO(2, "��Ʈ��", 20000, 4);
		dtoArr[2] = new ProductDTO(3, "�º���", 30000, 8);
		dtoArr[3] = new ProductDTO(4, "�ڵ���", 40000, 7);
		dtoArr[4] = new ProductDTO(5, "TV", 50000, 6);
		
		for(int i=0;i<dtoArr.length;i++) {
			System.out.println(dtoArr[i].getNum());
		}
		dao.display(dtoArr);
		
		
	
//		ProductDTO dto1 = new ProductDTO(1, "��ǻ��", 10000, 5);
//		ProductDTO dto2 = new ProductDTO(2, "��Ʈ��", 20000, 4);
//		ProductDTO dto3 = new ProductDTO(3, "�º���", 30000, 8);
//		ProductDTO dto4 = new ProductDTO(4, "�ڵ���", 40000, 7);
//		ProductDTO dto5 = new ProductDTO(5, "TV", 50000, 6);
//		System.out.println(dto.getCnt());//private ���������ڷ� ������ �ٷ� ������ ���Ƴ���
//		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);
		
		
		
		
	}
}