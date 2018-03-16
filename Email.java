package EmailApp;

import java.util.Scanner;

public class Email {
	private String FirstName,LastName,Password,Department,AlternateEmail,Email,Company="royalcyber";
	private int MailBoxCapacity,DefaultPasswordLength=9;
	
	public Email(String FirstName,String LastName) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		
		this.Department=SetDepartment();
		
		this.Password=SetPassword(DefaultPasswordLength);
		
		Email=FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department.toLowerCase()+"."+Company+".com";
		
	}
	private String SetDepartment()
	{
		System.out.println("Enter Department \n 1 For Sales \n 2 For Development \n 3 For Accounting \n 0 For None");
		Scanner in = new Scanner(System.in);
		int DeptChoice=in.nextInt();
		switch(DeptChoice)
		{
		case 1:
			return "Sales";
		case 2:
			return "Development";
		case 3:
			return "Accounting";
		default:
			return "None";
			
		
		}
		
	}
	private String SetPassword(int length)
	{
		String SetPassword="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
		char[] Password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand= (int) (Math.random()*SetPassword.length());
			Password[i]=SetPassword.charAt(rand);
			
		}
		return new String(Password);
	}
	public void ChangePassword(String Password)
	{
		this.Password=Password;
		
	}
	public void SetAlternateEmail(String AlternateEmail)
	{
		this.AlternateEmail=AlternateEmail;
		
	}
	public void SetMailBoxCapacity(int MailBoxCapacity)
	{
		this.MailBoxCapacity=MailBoxCapacity;
		
	}
	public String GetPassword()
	{
		return Password;
	}
	public int GetMailBoxCapacity()
	{
		return MailBoxCapacity;
	}
	public String GetAlternateEmail()
	{
		return AlternateEmail;
	}
	public String ShowInfo()
	{
		return "Information About New Employee\n"+"\nFull Name:\n"+FirstName+" "+ LastName+"\nDepartment:\n"+Department+"\nPassword:\n"+Password+
				"\nEmail:\n"+Email+"\nAlternatEmail:\n"+AlternateEmail+"\nMailBoxCapacity:\n"+MailBoxCapacity;}}
