package pack02_static;

public class Ex03_String {
	//String Class : ���ڿ��� �����ϱ� ���� ����� ��� �ִ� Ŭ����
	//java.lang(��Ű��).String.class(.JAVA)
	//String ���� Class�̱� ������ ����� ������ �ִ�.
	//�ٸ����(Java, Oracle)�� ���� Ŭ������ ���(�޼ҵ�)Ȱ���غ���
	//������ �Ұ�ȣ��x, �޼ҵ�� �Ұ�ȣo
	public static void main(String[] args) {
		String str1 = "apple"; 				//apple ���ڿ��� str1�̶�� ������ �Ҵ�
		String str2 = new String("APPLE");	//�ν��Ͻ�ȭ ������ ���ļ� str2��� ������ APPLE�� �Ҵ�
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		//length()�޼ҵ� : ���ڿ��� ���̸� �� �� ����
		System.out.println("length() : "+str1.length());
		
		//toUpperCase(), toLowerCase()
		//�빮�ڷ� ����, �ҹ��ڷ� ����
		System.out.println("toUpperCase() : " + str1.toUpperCase());
		System.out.println("toLowerCase() : " + str2.toLowerCase());
		
		//subString() : Ư�� ���� ����(index)
		System.out.println("subString() : "+ str1.substring(2));//���� �� index2���� ���ڿ� ������ ���
		System.out.println("subString( , ) : "+ str1.substring(1, 3));//���� �� index1���� index3���� ���
		
		//charAt() : ���ڿ����� Ư�� ���� �� ���ڸ� ����
		System.out.println("charAt() : "+str1.charAt(4));//[a][p][p][l][e]
		System.out.println("subString( , ) : "+str1.substring(4, 5));
		
		//indexOf() : ���ڿ����� Ư�� ������ ���翩�� �� ���� : index ��ȯ, ���� : -1
		System.out.println("indexOf() : "+str1.indexOf("e"));
		
		//split() : ���ڿ��� �и� �� split()�޼ҵ带 �̿��ؼ� split()�޼ҵ尡 �����ϴ� Ÿ���� �����Ϳ� ��ƺ���.
		//apple
		String[] temp = str1.split("e");
		System.out.println(temp.length);
		String str3 = "ab cd ef";
		String[] tempArr = str3.split(" ");
		System.out.println(tempArr.length);
		
		//replaceAll() : ���ڿ� ġȯ(Ư�� ���ڸ� �ٲ㼭 ���ϴ� ���ڷ� �ٲٴ� ��) A->X
		System.out.println("replace() : "+str1.replaceAll("pp", "@@").length());
		
		//trim() : �¿� ���� ����
		String trimStr1 ="   abc   def   ";
		System.out.println("trim() : "+trimStr1.trim().replaceAll(" ", "").length());
		
		String eqStr1 = "A";
		String eqStr2 = new String("A");
		if(eqStr1.equals(eqStr2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
		
		
	}
	
	
	
}