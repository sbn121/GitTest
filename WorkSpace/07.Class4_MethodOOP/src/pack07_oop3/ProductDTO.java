package pack07_oop3;

public class ProductDTO {
	//���������� : private(�ܺηκ��� �ٷ� ������ �����Ѵ�.)
	//��������(information hiding), ĸ��ȭ(encapsulation)
	private int num;	//��ǰ ���� ��ȣ
	private String name;//��ǰ �̸�
	private int price;	//����
	private int cnt;	//���
	
	//���ݰ� ����� ���ǿ����� -�� �Ǹ� �� �ȴ�.
	
	//�⺻ ������ : JVM���� �����ϸ� class�� �̸��κ��� �⺻ ������ �޼ҵ��̴�.(new ClassName();)

	//�����ڸ� ���ؼ� �ʵ��� ���� �ʱ�ȭ�ؾ��� ��� , IDE����� �̿��ؼ� �ڵ����� �����.

	public ProductDTO(int num, String name, int price, int cnt) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
	
	
	
	
	
}