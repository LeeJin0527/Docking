package org.docking.erbse.email;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	public void sendEmail(String from, String to, String subject, String content) throws Exception {
			  // Properties ?�정
			  // ?�로?�티 �??�스?�스 ?�성�?기본?�션(SMTP ?�버 ?�스??�?��)
			  Properties props = new Properties();
			  
			  // G-Mail SMTP ?�용??
			  props.put("mail.transport.protocol", "smtp");// ?�로?�콜 ?�정
			  props.put("mail.smtp.host", "smtp.gmail.com");// gmail SMTP ?�비??주소(?�스??
			  props.put("mail.smtp.port", "465");// gmail SMTP ?�비???�트 ?�정
			  // 로그???�때 Transport Layer Security(TLS)�??�용??것인�??�정
			  // gmail ?�선 tls�??�수�??�니�?�� ?�도 그만 ?�해??그만
			        props.put("mail.smtp.starttls.enable","true");
			        // gmail ?�증??Secure Socket Layer(SSL) ?�정
			        // gmail ?�서 ?�증???�용?�주�?�� ?�건 ?�해주면 ?�됨
			        props.setProperty("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			        // props.put("mail.smtp.user", from);
			        props.put("mail.smtp.auth", "true");// SMTP ?�증???�정
			        /**
			         * SMTP ?�증???�요??경우 반드??Properties ??SMTP ?�증???�용?�다�??�정?�여???�다.
			         * 그렇�??�으�??�증???�도조차 ?��? ?�는??
			         * 그리�?Authenticator ?�래?��? ?�속받�? SMTPAuthenticator ?�래?��? ?�성?�다.
			         * getPasswordAuthentication() 메소?�만 override ?�면 ?�다.
			         * �??�실 ?�른 메소?�는 final 메소?�여??override ????조차 ?�다. -??;
			         */
			  Authenticator auth = new SMTPAuthenticator();
			  Session mailSession = Session.getDefaultInstance(props, auth);
			  
			// create a message
			  Message msg = new MimeMessage(mailSession);
			  
			  // set the from and to address
			  msg.setFrom(new InternetAddress(from));//보내???�람 ?�정
			  msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));//받는 ?�람?�정
			  
			 /* if(!cc.trim().equals("")) {
			   msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc, false));
			  }*/
			  
			  // Setting the Subject and Content Type
			  msg.setSubject(subject); // ?�목 ?�정
			  msg.setText(content);  // ?�용 ?�정
			  msg.setSentDate(new Date());// 보내???�짜 ?�정
			  
			  Transport.send(msg);  // 메일 보내�?
	}
}
