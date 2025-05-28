package view.employee;

import java.util.Scanner;

import model.Admin;
import model.Cashier;
import model.Database;
import model.Employee;
import model.Option;
import model.Storekeeper;

public class CreateEmployee implements Option {

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Enter first name:");
		String firstName = s.next();
		System.out.println("Enter last name:");
		String lastName = s.next();
		System.out.println("Enter email:");
		String email = s.next();
		System.out.println("Enter phone number:");
		String phoneNumber = s.next();
		System.out.println("Enter address:");
		String address = s.next();
		System.out.println("Enter salary (double):");
		double salary = s.nextDouble();
		System.out.println("Enter password:");
		String password = s.next();
		System.out.println("Enter department (0.Admin 1.Cahier 2.Storekeeper):");
		int department = s.nextInt();
		
		Employee e;
		switch (department) {
		case 0:
			e = new Admin();
			break;
		case 1:
			e = new Cashier();
			break;
		case 2:
			e = new Storekeeper();
			break;
			default:
				System.out.println("Invalid department");
				e = new Cashier();
				break;
		}
		
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setEmail(email);
		e.setAddress(address);
		e.setPassword(password);
		e.setSalary(salary);
		e.setPhoneNumber(phoneNumber);
		
		new controller.employee.CreateEmployee(e, database);
	}

	@Override
	public String getOption() {
		return "Add New Employee";
	}

}
