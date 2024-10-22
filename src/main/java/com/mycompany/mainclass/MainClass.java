/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainclass;

import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Tumiso
 */
public class MainClass {
    
    

    public static void main(String[] args) {
           
        //declaration
        String name;
       String surname;
       String capturedUsername ;
        String capturedPassword ;
        String LoginUserName ;
        String LoginpassWord ;
        
        //Class instance creation
        Login user = new Login();
        task create = new task();
        
        
        //Object Scanner creation
        Scanner input = new Scanner(System.in);
        
        //prompting user to enter first name
        System.out.println("Please enter your name:");
        name = input.next();
        
        //prompting user to enter last name
        System.out.println("please enter your last name:");
        surname = input.next();
        
        //creating username by prompting user
        System.out.println("Please create a username not longer than 5 characters and contains an underscore");
        capturedUsername =input.next();
        
        //creating password by prompting user
       System.out.println("Please create a password longer than 7 characters");
       capturedPassword =input.next();
       
         //Proccess of verifying conditions for registration
       if(user.checkUserName(capturedUsername) && user.checkPasswordComplexity(capturedPassword)){
           
        //callinng the registerUser method
        String register;
        register= user.registerUser(capturedUsername, capturedPassword);
        System.out.println(register);
        
}
       
       //login to account
       if(capturedUsername.contains("_") && capturedUsername.length() <= 5 && user.checkPasswordComplexity(capturedPassword)){
       
         //prompting user to enter username to login
       System.out.println("Please enter your username to login:");
       LoginUserName = input.next();
       
       //prompting user to enter password to login
       System.out.println("Please enter your password to login:");
       LoginpassWord = input.next();
       
       //testing if password and username entered matches recorded password and username
       if(user.loginUser(LoginUserName,LoginpassWord, capturedUsername , capturedPassword, name, surname)){
                 
      
           //calling loginstatus method
           String status = user.returnLoginStatus(LoginUserName, LoginpassWord , capturedUsername ,capturedPassword, name, surname );
           System.out.println(status);
           
           //command JOPtion to be on top
           final JDialog top = new JDialog();
            top.setAlwaysOnTop(true);
            
            //message welcoming user
            JOptionPane.showMessageDialog(top,"Welcome to Easykanban","Welcome",JOptionPane.INFORMATION_MESSAGE);
              
             int option = 0;
             //while loop till option quit is choosen
            while(option !=3){
             
            
            String [] response = {"1. Add task(s)", "2. Show report", "3. Quit"};//array for menu option
            
            //JOptionPane to get option from user
             int choice =JOptionPane.showOptionDialog(top, "Choose option from menu:", "Menu", option, JOptionPane.PLAIN_MESSAGE, null, response, response[0]);
             option = choice;
            
            //switch case for different option choices
            switch(option){
                
                //add task option
                case 0:
                    
                    //prompt user to enter amount of tasks
                    int tasks =Integer.parseInt(JOptionPane.showInputDialog(top, "How many task do you want to enter?", "task Amount", JOptionPane.QUESTION_MESSAGE));
                    String [] definetasks = new String [tasks];
                    
                    //for loop to run till all tasks are entered
                   for (int i =0; i < definetasks.length; i++) {
                       
                       //prompting user to enter task name
                      String taskname = JOptionPane.showInputDialog(top, "Enter task name:");
                      
                      //asking user to describe task
                      String taskDescription =JOptionPane.showInputDialog(top, "Enter task description(must me less than 50 characters):");
                      
                      //if statement if task description meets condtions
                      if(create.checktaskdescription(taskDescription)){
                       JOptionPane.showMessageDialog(top,"Task successfully captured","Task Capture",JOptionPane.INFORMATION_MESSAGE);
               
                      }
                      //else statement for when task does not meet conditions
                      else {
                       JOptionPane.showMessageDialog(top,"Please enter a task description of less than 50 characters","Task Capture",JOptionPane.ERROR_MESSAGE);   
                      }
                      
                      //asking user to enter developer details
                      String developerDetails =  JOptionPane.showInputDialog(top, "Enter developer's fullname (name and surname):");
                      
                      //asking user to enter task duration in hours
                      int duration = Integer.parseInt(JOptionPane.showInputDialog(top, "Enter task duration (in hours)", "task duration", JOptionPane.PLAIN_MESSAGE));
                     
                      //display task ID to user
                     String taskID =create.createTaskID(taskname, developerDetails,i);
                     JOptionPane.showMessageDialog(top,taskID,"task ID",JOptionPane.INFORMATION_MESSAGE);
                    
                     
                      int statusOption = 0;// initializing status options
                       
                     String [] statusOftask = {"To Do", "Done", "Doing"};//Array  for task status
                     
                     //asking user to enter status of task
                     int taskStatus =JOptionPane.showOptionDialog(top, "Enter status of task", "task status", option,JOptionPane.QUESTION_MESSAGE,null, statusOftask, statusOftask[0]);
                      
                     statusOption =taskStatus;
                    
                     String statusOutput = "";
                     switch (statusOption){
                         case 0://displays when task is to be done 
                          statusOutput = "To Do";
                          JOptionPane.showMessageDialog(top,statusOutput,"Task status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                         case 1://displays when task is done
                             statusOutput = "Done";
                             JOptionPane.showMessageDialog(top,statusOutput,"Task status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                         
                         case 2: //displays when task is still being done
                              statusOutput = "Doing";
                             JOptionPane.showMessageDialog(top, statusOutput,"Task status",JOptionPane.INFORMATION_MESSAGE);
                         break;
                     }
                     
                     //displays task details
                     JOptionPane.showMessageDialog(top,create.printTaskdetails(taskDescription, taskID, taskname,  developerDetails,  i, statusOutput, duration ) , "Full task details", JOptionPane.INFORMATION_MESSAGE);
                     int totalHours = 0;
                        
                   }
                   //displays total hours of all entered tasks
                   JOptionPane.showMessageDialog(top,"Total hours:"+ create.returnTotalhours()+" hrs","Total hours", JOptionPane.INFORMATION_MESSAGE);
                    
                    break;
                    //show report option
                case 1:
                    //message to user that option 2 is in development
                    JOptionPane.showMessageDialog(top,"Coming Soon","Task Capture",JOptionPane.INFORMATION_MESSAGE);
                    break;
                    //quit option
                case 2:
                    option = 3;
                     JOptionPane.showMessageDialog(top,"Goodbye","Task Capture",JOptionPane.INFORMATION_MESSAGE);
                    break;
               
            }
            }
            top.dispose();
       }
       else{
            //calling loginstatus method
           String status = user.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername , capturedPassword, name, surname);
           System.out.println(status);
          
       } 
       }
       else{
            String register;
                register= user.registerUser(capturedUsername, capturedPassword);
        System.out.println(register);
         
       }
    }
    
}
