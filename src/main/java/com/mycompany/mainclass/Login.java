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
    
    
     public boolean checkUserName(String capturedUsername){
          
          if (capturedUsername == null || capturedUsername.isEmpty()) {
            return false;}
        // Check if the username is less than or equal to 5 characters and contains an underscore
        return capturedUsername.length() <= 5 && capturedUsername.contains("_");
    }
    
    public boolean checkPasswordComplexity(String capturedPassword){
          if (capturedPassword == null || capturedPassword.isEmpty()) {
            return false; }
     
    // Ensure password is at least 8 characters, has one uppercase letter, one digit, and one special character
    return capturedPassword.length() >= 8 
        && capturedPassword.matches(".*[A-Z].*")    // Check for at least one uppercase letter
        && capturedPassword.matches(".*\\d.*")      // Check for at least one digit
        && capturedPassword.matches(".*[^a-zA-Z0-9].*"); // Check for at least one special character
        
    }
}
