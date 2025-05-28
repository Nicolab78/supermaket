package Supermarket;

import java.util.Scanner;


import model.Database;
import view.Login;

public class Main {

    public static void main(String[] args) {
        new Login().oper(null, new Scanner(System.in), new Database());
        

        System.out.println("Welcome to the Supermarket Management System!");
        
    }

}
