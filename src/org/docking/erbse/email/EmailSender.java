package org.docking.erbse.email;

import javax.mail.MessagingException;

public class EmailSender implements EmailSendable{
	String from; // 메일 보내???�람
	String to; // 메일 보낼?�람
	/*String cc;*/     // 참조
	String subject;// ?�목
	String content;// ?�용
	/**
	  * @param args
	  */
	 public void sendEmail() {
	  if(from.trim().equals("")) {
		  System.out.println("보내???�람???�력?��? ?�았?�니??");
	  }
	  else if(to.trim().equals("")) {
		  System.out.println("받는 ?�람???�력?��? ?�았?�니??");
	  }
	  else {
		  try {
			  EmailUtil mt = new EmailUtil();
			  // 메일보내�?
			  //mt.sendEmail(from, to, cc, subject, content);
			  mt.sendEmail(from, to, subject, content);
			  System.out.println("메일 ?�송???�공?��??�니??	");
		  }catch(MessagingException me) {
			  System.out.println("메일 ?�송???�패?��??�니??	");
			  System.out.println("?�패 ?�유 : " + me.getMessage());
			  me.printStackTrace();
		  }catch(Exception e) {
			  System.out.println("메일 ?�송???�패?��??�니??	");
			  System.out.println("?�패 ?�유 : " + e.getMessage());
			  e.printStackTrace();
		  }
	  }
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String toString() {
		return super.toString();
	}
}
