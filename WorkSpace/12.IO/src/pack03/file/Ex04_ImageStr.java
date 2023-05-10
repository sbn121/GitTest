package pack03.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_ImageStr {
	// FileInputStream, FileOutputStream
	// ����(�׸�, ����, ���� ��)���� ����Ʈ ������ ������� �ϴ� ��Ʈ���� �ǹ���
	// �̹��� ������ �о ����ϴ� ����(ctrl+c, ctrl+v)(IO : Input&Output)
	// �����̹����� �غ��ؼ� �̹����� �о�� ���� -> �ٸ��̸����� �ٽ� ���
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\pic.png");
		FileOutputStream fos = new FileOutputStream("D:\\\\Study_Java\\\\WorkSpace\\\\12.IO_FileTest\\\\pic_copy.png");
		int data, cnt =0; // data : byte������ �ɰ��� �����͸� �ϳ��� �о�ͼ� ����, cnt�� �� ���̳� ������ �д���
		while((data=fis.read())!=-1) { // -1 : file�� ����, -1�� �ƴϸ� ���ϳ��ο� �����Ͱ� �ִ�.
			cnt++;
			System.out.println(data); // �̹����� 1px��(RGB)
			fos.write(data); // data���� �ϳ��� ������Ų��(write)
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println(cnt+"Ƚ����ŭ ��������");
	}
}