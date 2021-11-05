package pack03_sendEmail;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailSend {
	public static void main(String[] args) {
		
	}
	
	public void htmlMail() {
		HtmlEmail mail = new HtmlEmail();//<-파라메터를 입력받는 생성자 메소드가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 smtp 서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용.버그나쓸때
		
		//네이버 2차 인증이 걸려있을경우 SSLConnect 
		mail.setAuthentication("로그인하기위한 네이버 아이디", "네이버 비밀번호");
		mail.setSSLOnConnect(true);
		//이메일 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는사람 <- 자신의 이메일 
			//메일을 받는사람 <- 받는사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("youngmoon525@naver.com" , "상대방 이메일에 표시 될 이름");//메일 송신인 지정
			mail.addTo("youngmoon525@naver.com" , "내이름");//여러명에게 보낼때는 addTo메소드 여러개.
			mail.addTo("youngmoon525@naver.com" , "내이름");
			
			mail.setSubject("회원가입 축하 메세지");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");
			msg.append("<body>");
			msg.append("<a href='http://www.naver.com'> 네이버로 바로가기   </a>");
			msg.append("<hr>");
			msg.append("<h2>한울 IoT 융합과정 입교 환영 메일</h2>");
			msg.append("<p> 대충 축하 하는 내용 취업 잘하십쇼.</p>");
			msg.append("</body>");
			msg.append("</html>");
			
			
			mail.setHtmlMsg(msg.toString());
			//mail.setMsg("실제 내용부 하고싶은말");
			//메일 전송 버튼 
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\IO_FORDER\\taa.jpg");
			//EmailAttachment라는 객체를 이용해서 여기에 파일 패쓰를 지정해서 파일을 추가함.
			
			mail.attach(file);//<-이메일 객체에 파일이 추가됨.
			
			file = new EmailAttachment();
			URL url = new URL("http://www.imageclick.com/imgs/main_intro.jpg");
			file.setURL(url);//URL <-
			
			mail.send();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void attachMail() {
		MultiPartEmail mail = new MultiPartEmail();//<-파라메터를 입력받는 생성자 메소드가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 smtp 서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용.버그나쓸때
		
		//네이버 2차 인증이 걸려있을경우 SSLConnect 
		mail.setAuthentication("로그인하기위한 네이버 아이디", "네이버 비밀번호");
		mail.setSSLOnConnect(true);
		//이메일 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는사람 <- 자신의 이메일 
			//메일을 받는사람 <- 받는사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("youngmoon525@naver.com" , "상대방 이메일에 표시 될 이름");//메일 송신인 지정
			mail.addTo("youngmoon525@naver.com" , "내이름");//여러명에게 보낼때는 addTo메소드 여러개.
			mail.addTo("youngmoon525@naver.com" , "내이름");
			
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("실제 내용부 하고싶은말");
			//메일 전송 버튼 
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_Java\\IO_FORDER\\taa.jpg");
			//EmailAttachment라는 객체를 이용해서 여기에 파일 패쓰를 지정해서 파일을 추가함.
			
			mail.attach(file);//<-이메일 객체에 파일이 추가됨.
			
			file = new EmailAttachment();
			URL url = new URL("http://www.imageclick.com/imgs/main_intro.jpg");
			file.setURL(url);//URL <-
			
			mail.send();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//글씨만 있는 이메일 , 파일첨부가 있는 이메일 , html태그가 있는 이메일
	public void sendEmailSimple() {
		SimpleEmail mail = new SimpleEmail();//<-파라메터를 입력받는 생성자 메소드가 없음.
		mail.setHostName("smtp.naver.com");//naver 서버를 통하기 때문에 naver에서 지정해준 smtp 서버를 넣어준다.
		mail.setCharset("UTF-8");
		mail.setDebug(true);//디버깅을 허용.버그나쓸때
		
		//네이버 2차 인증이 걸려있을경우 SSLConnect 
		mail.setAuthentication("로그인하기위한 네이버 아이디", "네이버 비밀번호");
		mail.setSSLOnConnect(true);
		//이메일 전송을 위한 SimpleEmail 초기화를 완료함
		try {
			//메일을 보내는사람 <- 자신의 이메일 
			//메일을 받는사람 <- 받는사람의 이메일
			//메일의 제목 , 메일의 내용
			mail.setFrom("나의 이메일@naver.com " , "상대방 이메일에 표시 될 이름");//메일 송신인 지정
			mail.addTo("youngmoon525@naver.com" , "내이름");//여러명에게 보낼때는 addTo메소드 여러개.
			mail.addTo("나의 이메일@naver.com" , "내이름");
			
			mail.setSubject("회원가입 축하 메세지");
			mail.setMsg("실제 내용부 하고싶은말");
			//메일 전송 버튼 
			mail.send();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
