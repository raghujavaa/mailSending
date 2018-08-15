package mailSending;

public class SendMailSSL {
	public static void main(String[] args) {
		// from,password,to,subject,message
		Mailer.send("raghubr57@gmail.com", "Raghu_111",
				"raghunadh28@gmail.com", "hello javatpoint", "How r u?");
		// change from, password and to
	}

	/*
	 * private static void send(String string, String string2, String string3,
	 * String string4, String string5) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
