package view;

import java.util.Scanner;

import model.Database;
import model.Employee;
import model.Option;

public class Login implements Option {

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Welcome to supermarket management system");
		System.out.println("Enter your email:");
		String email = s.next();
		System.out.println("Enter your password:");
		String password = s.next();
		controller.Login login = new controller.Login(email, password, database);
		if (login.isLoggedIn()) {
			Employee employee = login.getUser();
			System.out.println("Welcome "+employee.getFirstName());
		} else {
			System.out.println("Wrong email or password!");
			System.out.println("Try agin later");
		}
	}
	
	@Override
	public String getOption() {
		return "Login";
	}

}
