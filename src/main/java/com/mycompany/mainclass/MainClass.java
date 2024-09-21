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
       String capturedUsername ;
        String capturedPassword ;
        String LoginUserName ;
        String LoginpassWord ;
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
        //user.name = input.next();
        user.setName(input.next());
        
        System.out.println("please enter your last name:");
        //user.surname = input.next();
        user.setsurname(input.next());
        
        
        //creating username and password
        System.out.println("Please create a username not longer than 5 characters and contains an underscore");
        //user.capturedUsername = input.next();
        user.setUsername(input.next());
        
        
       System.out.println("Please create a password longer than 7 characters");
      // user.capturedPassword = input.next();
       user.setPassword(input.next());
       
         //Proccess of verifying conditions for registration
       if(user.checkUserName(user.getUsername()) && user.checkPasswordComplexity(user.getPassword()) ){
           
        //callinng the registerUser method
        String register;
                register= user.registerUser(user.getUsername(), user.getPassword());
        System.out.println(register);
        
}
       
       
       //login to account
       if(user.getUsername().contains("_") && user.getUsername().length() <= 5 && user.checkPasswordComplexity(user.getPassword())){
       //prompting user to enter username and password
       System.out.println("Please enter your username to login:");
       //user.LoginUserName = input.next();
       user.setLoginUsername(input.next());
       
       System.out.println("Please enter your password to login:");
        //user.LoginpassWord = input.next();
       user.setLoginPassword(input.next());
       
       //testing if password and username entered matches recorded passoword and username
       if(user.loginUser(user.getLoginUsername(), user.getLoginPassword(), user.getUsername() , user.getPassword())){
                 
      
           //calling loginstatus method
           String status = user.returnLoginStatus(user.getLoginUsername(), user.getLoginPassword() ,user.getUsername() ,user.getPassword() );
           System.out.println(status);
       }
       else{
            //calling loginstatus method
           String status = user.returnLoginStatus(user.getLoginUsername(), user.getLoginPassword(),user.getUsername() , user.getPassword());
           System.out.println(status);
       }
       
       }
       else{
            String register;
                register= user.registerUser(user.getUsername(), user.getPassword());
        System.out.println(register);
       }
    }
    
}
