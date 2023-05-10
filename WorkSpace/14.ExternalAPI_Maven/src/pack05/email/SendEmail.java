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
	//1. 단순하게 텍스트만 있는 이메일 : SimpleEmail
	//2. 첨부파일이나 url등으로 이미지가 있는 이메일 : MultipartEmail
	//3. 모든 기능을 가지고 html 태그까지 사용가능한 이메일 : HtmlEmail
	
	public void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("sbn121", "비밀번호");
		mail.setSSLOnConnect(true);
		//====================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		//송신인
		try {
			mail.setFrom("sbn121@naver.com", "한울SBNFROM");
			
			mail.addTo("sbn121@naver.com", "한울SBNTO"); //여러 개 하면여러명한테전송
			
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("내용 입니다~");
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침.↑
			
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌 거"+e.getMessage());
		}
		
	
	}
	
	public void sendMulti() {
		MultiPartEmail mail = new MultiPartEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("sbn121", "비밀번호");
		mail.setSSLOnConnect(true);
		//====================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		//송신인
		try {
			mail.setFrom("sbn121@naver.com", "한울SBNFROM");
			
			mail.addTo("sbn121@naver.com", "한울SBNTO"); //여러 개 하면여러명한테전송
			mail.addTo("gimaaaaam_@naver.com", "한울SBNTO");
			mail.addTo("615637@hanmail.net", "한울SBNTO");
			
			mail.setSubject("회원가입 축하 메세지");
			Scanner sc = new Scanner(System.in);
			System.out.println("메일 내용을 입력하세요.");
			String msg = sc.nextLine();
			mail.setMsg(msg);
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\WorkSpace\\12.IO_FileTest\\pic.png"); 
			//이미지 파일 경로를 넣어줌.(경로를 찾을 수 없을 경우 주석처리)
			mail.attach(file); //메일에 파일 추가
			
			file = new EmailAttachment();
			file.setURL(new URL("https://file3.instiz.net/data/file3/2018/02/17/5/b/3/5b300d506b1cdce4576f012fc70a7f70.jpg"));
			mail.attach(file);
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침.↑
			
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Email오류 아닌 거"+e.getMessage());
		}
		
	
	}
	
	public void sendHtml() {
		HtmlEmail mail = new HtmlEmail();
		//smtp.naver.com
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지.
		
		mail.setAuthentication("sbn121", "비밀번호");
		mail.setSSLOnConnect(true);
		
		//송신인
		try {
			mail.setFrom("sbn121@naver.com", "한울SBNFROM");
			
			mail.addTo("sbn121@naver.com", "한울SBNTO"); //여러 개 하면여러명한테전송
			mail.addTo("gimaaaaam_@naver.com", "한울SBNTO");
			mail.addTo("615637@hanmail.net", "한울SBNTO");
			
			//메일의 내용이 일반 글자가 아니라 html형태로 보낼 것이기 때문에 바꿈.
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
			System.out.println("Email오류 아닌 거"+e.getMessage());
		}
		
	
	}
	
}
