/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclass;

/**
 *
 * @author Tumiso
 */
class Login {

    String name;
    //variable declaration
    String surname;
    String capturedUsername;
    String capturedPassword;
    String LoginUserName;
    String LoginpassWord;
    
    
    
     public boolean checkUserName(String capturedUsername){
          
         // if (capturedUsername == null || capturedUsername.isEmpty()) {
         //   return false;}
        // Check if the username is less than or equal to 5 characters and contains an underscore
        return capturedUsername.length() <= 5 && capturedUsername.contains("_");
    }
    
    public boolean checkPasswordComplexity(String capturedPassword){
        //  if (capturedPassword == null || capturedPassword.isEmpty()) {
          //  return false; }
     
    // Ensure password is at least 8 characters, has one uppercase letter, one digit, and one special character
    return capturedPassword.length() >= 8 
        && capturedPassword.matches(".*[A-Z].*")    // Check for at least one uppercase letter
        && capturedPassword.matches(".*\\d.*")      // Check for at least one digit
        && capturedPassword.matches(".*[^a-zA-Z0-9].*"); // Check for at least one special character
        
    }
    
    public String registerUser(String capturedUsername, String capturedPassword){
         // Check if username and password meet the required conditions
        if (checkUserName(capturedUsername) && checkPasswordComplexity(capturedPassword)) {
            return "username and password successfully captured ";
          
            
        } else if (!checkUserName(capturedUsername)) {
            return "username not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length";
            
        } else if (!checkPasswordComplexity(capturedPassword)) {
            return "Password not correctly formatted, please ensure that your password contains atleast 8 characters, capital letter, special character and a number";
        }else{
        return "Registration failed: Invalid login information.";}
    }
    
    public boolean loginUser(String LoginUserName, String LoginpassWord, String capturedUsername, String capturedPassword){
    
         //if (LoginUserName == null || LoginUserName.isEmpty() || LoginpassWord == null || LoginpassWord.isEmpty()) {
           // return false;
       // }
        return LoginUserName.equals(capturedUsername) && LoginpassWord.equals(capturedPassword);
    }

       
    
    public  String returnLoginStatus(String LoginUserName, String LoginpassWord, String capturedUsername, String capturedPassword){
      if (loginUser(LoginUserName, LoginpassWord, capturedUsername, capturedPassword)) {
            return "Welcome back " + name +" " + surname +" it is great to see you again.";
        } else {
            return "username/password is incorrect, please try again.";
        } 

    }
}
