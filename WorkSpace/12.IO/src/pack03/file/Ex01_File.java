package pack03.file;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		// D:\Study_Java\WorkSpace\12.IO
		// ������ ������ �ٿ�ε�ްų� �Ǵ� ���ε带 �� �� ���� ����ϰ� ���Ǵ� Ŭ������ FileŬ������.
		// �⺻������ InputStream�� OutputStream�� ���ؼ� ����������� ���� �������ٴ� ������ �˾ƾ���.
		File file = new File("D:\\Study_Java\\WorkSpace\\12.IO"); // ?\(o) \\(?)
		if(file.exists()) {
			System.out.println("��ΰ� �����մϴ�.");
		}else {
			System.out.println("��ΰ� �����ϴ�.");
		}
		file = new File("D:\\Study_Java\\WorkSpace\\12.IO_FileTest");
		if(file.exists()) {
			System.out.println("��ΰ� �����մϴ�.");
		}else {
			System.out.println("��ΰ� �����ϴ�.");
			file.mkdir(); // make directory ������ ��θ� �����Ѵ�.
		}
		
		for(int i=0;i<10;i++) {
		file = new File("D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\����"+(i+1));
		if(file.exists()) {
			System.out.println("��ΰ� �����մϴ�.");
		}else {
			System.out.println("��ΰ� �����ϴ�.");
			file.mkdir();
		}
		}
		
	}
}