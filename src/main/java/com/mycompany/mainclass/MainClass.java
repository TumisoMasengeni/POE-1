/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainclass;

import java.util.Scanner;

/**
 *
 * @author Tumiso
 */
public class MainClass {

    public static void main(String[] args) {
             /*
        Create a login account by entering your name, lastname, creating a username and a password
        */
        
        //declarations
        
       String name;
       String surname;
        String capturedUsername = null;
        String capturedPassword = null;
       int usernameLength = 5;
        int passwordLength = 8;
        
        
        //Class instance creation
        Login user = new Login();
        // String name = user.name;
         // String surname = user.surname;
        
             //Object Scanner
        Scanner input = new Scanner(System.in);
        
        //prompting user to enter name, last name and create a username and password
        System.out.println("Please enter your name:");
        name = input.next();
        
        System.out.println("please enter your last name:");
        surname = input.next();
        
        
        //creating username and password
        System.out.println("Please create a username not longer than 5 characters and contains an underscore");
        user.capturedUsername = input.next();
        
        
       System.out.println("Please create a password longer than 7 characters");
       user.capturedPassword = input.next();
       
         //Proccess of verifying conditions for registration
       if(user.checkUserName(capturedUsername) && user.checkPasswordComplexity(capturedPassword) ){
           
          //calling registerUser method
          String register = user.registerUser(capturedUsername, capturedPassword);
         
          //Display registration output
          System.out.println(register);
        
}
       
       //login to account
       
       //prompting user to enter username and passoword
       System.out.println("Please enter your username to login:");
       String LoginUserName = input.next();
       
       System.out.println("Please enter your password to login:");
       String LoginpassWord = input.next();
       
       //testing if password and username entered matches recorded passoword and username
       if(user.loginUser(LoginUserName, LoginpassWord, capturedUsername , capturedPassword)){
                 
      //calling returnLoginStatus from login class
       String loginStatus = user.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword);
       // display message for login status
        System.out.println(loginStatus);
   
           
       }
    }
}
