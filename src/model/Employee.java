package model;

import java.util.Scanner;

public abstract class Employee {

    protected int Id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected double salary;
    protected String Department;
    protected String password;
    protected Option[] options;


    public Employee() {
    }

    public Employee(int Id, String firstName, String lastName, String email, String phoneNumber, String address, double salary, String Department, String password) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.Department = Department;
        this.password = password;

        this.options = new Option[] {};
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public abstract int getDepartment();


    public void showList(Scanner s, Database database) {
		System.out.println("-----------------------");
		for (int i=1;i<=options.length;i++) {
			System.out.println(i+". "+options[i-1].getOption());
		}
		System.out.println("-----------------------");
		
		int selected = s.nextInt();
		options[selected-1].oper(this, s, database);
		showList(s, database);
	}

    


}
