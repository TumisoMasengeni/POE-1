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
       String capturedUsername;
        String capturedPassword;
       //int usernameLength = 5;
       // int passwordLength = 8;
        
        
        //Class instance creation
        Login user = new Login();
        // String name = user.name;
         // String surname = user.surname;
        
             //Object Scanner
        Scanner input = new Scanner(System.in);
        
        //prompting user to enter name, last name and create a username and password
        System.out.println("Please enter your name:");
        user.name = input.next();
        
        System.out.println("please enter your last name:");
        user.surname = input.next();
        
        
        //creating username and password
        System.out.println("Please create a username not longer than 5 characters and contains an underscore");
        user.capturedUsername = input.next();
        
        
       System.out.println("Please create a password longer than 7 characters");
       user.capturedPassword = input.next();
       
         //Proccess of verifying conditions for registration
       if(user.checkUserName(user.capturedUsername) && user.checkPasswordComplexity(user.capturedPassword) ){
           
        //callinng the registerUser method
        String register;
                register= user.registerUser(user.capturedUsername, user.capturedPassword);
        System.out.println(register);
        
}
       
       
       //login to account
       if(user.capturedUsername.contains("_") && user.capturedUsername.length() <= 5 && user.checkPasswordComplexity(user.capturedPassword)){
       //prompting user to enter username and passoword
       System.out.println("Please enter your username to login:");
       user.LoginUserName = input.next();
       
       System.out.println("Please enter your password to login:");
        user.LoginpassWord = input.next();
       
       //testing if password and username entered matches recorded passoword and username
       if(user.loginUser(user.LoginUserName, user.LoginpassWord, user.capturedUsername , user.capturedPassword)){
                 
      
           //calling loginstatus method
           String status = user.returnLoginStatus(user.LoginUserName, user.LoginpassWord, user.capturedUsername, user.capturedPassword);
           System.out.println(status);
       }
       else{
            //calling loginstatus method
           String status = user.returnLoginStatus(user.LoginUserName, user.LoginpassWord, user.capturedUsername, user.capturedPassword);
           System.out.println(status);
       }
       
       }
       else{
            String register;
                register= user.registerUser(user.capturedUsername, user.capturedPassword);
        System.out.println(register);
       }
    }
}
