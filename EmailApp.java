package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email1 = new Email("Monis","Saeed");
		email1.SetAlternateEmail("monissaeed303@gmail.com");
		email1.SetMailBoxCapacity(500);
		
		System.out.println(email1.ShowInfo());
	}

}
