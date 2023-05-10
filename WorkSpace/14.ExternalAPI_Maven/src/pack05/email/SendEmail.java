package pack05.email;

import java.net.URL;
import java.util.Scanner;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
		SendEmail se = new SendEmail();
		se.sendMulti();
	}
	//1. �ܼ��ϰ� �ؽ�Ʈ�� �ִ� �̸��� : SimpleEmail
	//2. ÷�������̳� url������ �̹����� �ִ� �̸��� : MultipartEmail
	//3. ��� ����� ������ html �±ױ��� ��밡���� �̸��� : HtmlEmail
	
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//�ѱ۱�������
		mail.setDebug(true);//������ ã�Ƽ� ������ �ϰ��ִ� ��������.
		
		mail.setAuthentication("sbn121", "��й�ȣ");
		mail.setSSLOnConnect(true);
		//====================���� � ������ ���� smtp������ smtp������ �̿��� �� �ִ� ��������
		
		//�۽���
		try {
			mail.setFrom("sbn121@naver.com", "�ѿ�SBNFROM");
			
			mail.addTo("sbn121@naver.com", "�ѿ�SBNTO"); //���� �� �ϸ鿩������������
			
			mail.setSubject("ȸ������ ���� �޼���");
			mail.setMsg("���� �Դϴ�~");
			
			//mail��ü�� ��� ������ ������ ������ �غ� ��ħ.��
			
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email���� �ƴ� ��"+e.getMessage());
		}
		
	
	}
	
	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//�ѱ۱�������
		mail.setDebug(true);//������ ã�Ƽ� ������ �ϰ��ִ� ��������.
		
		mail.setAuthentication("sbn121", "��й�ȣ");
		mail.setSSLOnConnect(true);
		//====================���� � ������ ���� smtp������ smtp������ �̿��� �� �ִ� ��������
		
		//�۽���
		try {
			mail.setFrom("sbn121@naver.com", "�ѿ�SBNFROM");
			
			mail.addTo("sbn121@naver.com", "�ѿ�SBNTO"); //���� �� �ϸ鿩������������
			mail.addTo("gimaaaaam_@naver.com", "�ѿ�SBNTO");
			mail.addTo("615637@hanmail.net", "�ѿ�SBNTO");
			
			mail.setSubject("ȸ������ ���� �޼���");
			Scanner sc = new Scanner(System.in);
			System.out.println("���� ������ �Է��ϼ���.");
			String msg = sc.nextLine();
			mail.setMsg(msg);
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\pic.png"); 
			//�̹��� ���� ��θ� �־���.(��θ� ã�� �� ���� ��� �ּ�ó��)
			mail.attach(file); //���Ͽ� ���� �߰�
			
			file = new EmailAttachment();
			file.setURL(new URL("https://file3.instiz.net/data/file3/2018/02/17/5/b/3/5b300d506b1cdce4576f012fc70a7f70.jpg"));
			mail.attach(file);
			
			//mail��ü�� ��� ������ ������ ������ �غ� ��ħ.��
			
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email���� �ƴ� ��"+e.getMessage());
		}
		
	
	}
	
	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//�ѱ۱�������
		mail.setDebug(true);//������ ã�Ƽ� ������ �ϰ��ִ� ��������.
		
		mail.setAuthentication("sbn121", "��й�ȣ");
		mail.setSSLOnConnect(true);
		
		//�۽���
		try {
			mail.setFrom("sbn121@naver.com", "�ѿ�SBNFROM");
			
			mail.addTo("sbn121@naver.com", "�ѿ�SBNTO"); //���� �� �ϸ鿩������������
			mail.addTo("gimaaaaam_@naver.com", "�ѿ�SBNTO");
			mail.addTo("615637@hanmail.net", "�ѿ�SBNTO");
			
			//������ ������ �Ϲ� ���ڰ� �ƴ϶� html���·� ���� ���̱� ������ �ٲ�.
			StringBuffer msg = new StringBuffer(); //"A", "A"+"B"
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<header>header</header>");
			msg.append("<section>");
			msg.append("<article>");
			msg.append("<img src: =\"https://file3.instiz.net/data/file3/2018/02/17/5/b/3/5b300d506b1cdce4576f012fc70a7f70.jpg\">");
			msg.append("</article>");
			msg.append("<article>");
			msg.append("<img src: =\"https://file3.instiz.net/data/file3/2018/02/17/5/b/3/5b300d506b1cdce4576f012fc70a7f70.jpg\">");
			msg.append("</article>");
			msg.append("</section>");
			msg.append("<aside>aside</aside>");
			msg.append("<footer>footer</footer>");
			msg.append("</body>");
			msg.append("</html>");
			
			mail.setHtmlMsg(msg.toString());
			
			
			
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email���� �ƴ� ��"+e.getMessage());
		}
		
	
	}
	
}