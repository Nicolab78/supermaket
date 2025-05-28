package controller;

import java.util.Scanner;

import model.Database;
import model.Employee;
import model.Option;

public class CreateEmployee{

   public void CreateEmployee(Employee e, Database database){

        String insert = "INSERT INTO employee (first_name, last_name, email, phone_number, address, salary, password) VALUES ('"
                + e.getFirstName() + "', '" + e.getLastName() + "', '" + e.getEmail() + "', '"
                + e.getPhoneNumber() + "', '" + e.getAddress() + "', " + e.getSalary() + ", '"
                + e.getPassword() + "')";

   }

}
