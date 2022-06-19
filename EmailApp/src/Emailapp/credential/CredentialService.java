package Emailapp.credential;

import java.util.Random;

import Emailapp.Employee.Employee;

public class CredentialService {
	public static String EmailGen(String FirstName,String LastName,String Department) {
		String Emailgen= FirstName+LastName+"@"+Department+".abc.com";
		return Emailgen;
	}
	public static char[] PasswordGen() {
		char[] password= new char[8];
		String Cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small="abcdefghijklmnopqrstuvwxyz";
		String Spcl="!@#$%^&*()_+:'";
		String Number="0123456789";
		String Value=Cap+Small+Spcl+Number;
		Random random= new Random();
		
		password[0]=Cap.charAt(random.nextInt(Cap.length()));
		password[1]=Small.charAt(random.nextInt(Small.length()));
		password[2]=Spcl.charAt(random.nextInt(Spcl.length()));
		password[3]=Number.charAt(random.nextInt(Number.length()));
		
		for (int i=0;i<8;i++) {
			password[i]=Value.charAt(random.nextInt(Value.length()));
		
		}
		return password;
		
	}
	public static void display(Employee employee,String EmailGen,char[] password) {
		System.out.println("dear Employee "+employee.getFirstName()+" your credential are as follows");
		System.out.println(EmailGen);
		System.out.println(password);
	
		
	}


}
