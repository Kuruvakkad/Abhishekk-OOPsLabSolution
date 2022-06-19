package Emailapp.Main;

import java.lang.reflect.Array;
import java.util.Scanner;

import Emailapp.Employee.Employee;
import Emailapp.credential.CredentialService;

public class Main {

	public static void main(String[] args) {
		
		String Email;
		char[] genPassword;
		Scanner sc= new Scanner(System.in);
		Employee employee= new Employee("RAJ","Kumar");
		//System.out.println("please Enter your First Name");
		//String FirstName= sc.next();
		//System.out.println("please Enter your Last Name");
		//String LastName= sc.next();
		
		System.out.println("Please choose the department from the following");
		System.out.println();
		String[] menu= {"1.Technical","2.Admin","3.HR","4.Legal"};
		for (int i=0;i<menu.length;i++) {
			System.out.println(menu[i]);
		}
		int Option= sc.nextInt();
		
		if(Option==1) {
			Email= CredentialService.EmailGen(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "technical");
			genPassword=CredentialService.PasswordGen();
			CredentialService.display(employee, Email, genPassword);
		}
		else if(Option==2) {
			Email= CredentialService.EmailGen(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "admin");
			genPassword=CredentialService.PasswordGen();
			CredentialService.display(employee, Email, genPassword);
		}
		else if(Option==3) {
			Email= CredentialService.EmailGen(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "hr");
			genPassword=CredentialService.PasswordGen();
			CredentialService.display(employee, Email, genPassword);
		}
		else if(Option==4) {
			Email= CredentialService.EmailGen(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "legal");
			genPassword=CredentialService.PasswordGen();
			CredentialService.display(employee, Email, genPassword);
		}else {
			System.out.println("selected an invalid option");
		}

	}

}
