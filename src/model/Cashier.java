package model;

public class Cashier extends Employee {

    public Cashier() {
        this.options = new Option[] {};
    }

    public Cashier(int Id, String firstName, String lastName, String email, String phoneNumber, String address, double salary, String password) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.password = password;
        this.options = new Option[] {};
    }

    @Override
    public int getDepartment() {
        return 1;
    }
}
