package pack03_constructor;

public class BagMain {
	public static void main(String[] args) {
		Bag b = new Bag("면",2);
		b.지퍼 = true;
		b.주머니개수 = 5;
		System.out.println("가방의 재질 : "+b.재질);
		System.out.println("가방의 끈 개수 : "+b.가방끈개수);
		System.out.println("가방의 지퍼 유무 : "+(b.지퍼==true ? "유" : "무"));
		System.out.println("가방의 주머니 개수 : "+b.주머니개수);
	}
}
