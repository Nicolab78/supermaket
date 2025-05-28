package model;

public class Admin extends Employee{

    public Admin() {
        this.options = new Option[] {};
    }

    public Admin(int id, String firstName, String lastName, String email, String phoneNumber, String address, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.options = new Option[] {};
    }

}


