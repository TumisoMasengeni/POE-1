/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclass;

/**
 *
 * @author Tumiso
 */
public class task {
    
   private String taskDescription, taskID;
   private String taskname, developerDetails;
   private int tasks;
   private String [] definetasks = new String [tasks];
   private int statusOption;
   private int duration;
    private int totalHours = 0;
  

   
    
   //checking length of taskdescription method
    public boolean checktaskdescription(String taskDescription){
        //outputs if task description is empty
        if (taskDescription == null || taskDescription.isEmpty()) {
            return false;}
        
        return taskDescription.length()< 50; //task description must be less than 50
    }
    
   public String createTaskID(String taskname, String developerDetails, int tasks){
       
      // Extract first two letters of taskName and last three letters of developerName
        String taskNamePart = taskname.length() >= 2 ? taskname.substring(0, 2).toUpperCase() : taskname.toUpperCase();
        String developerNamePart = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        
        // Format the Task ID
        return taskNamePart + ":" + tasks + ":" + developerNamePart;
    
       
       
    }
    
    public String  printTaskdetails(String taskDescription, String taskID, String taskname, String developerDetails, int tasks,String statusOutput,int duration ){
       this.totalHours += duration; // Add the task's duration to totalHours
        return "Task Status: " + statusOutput + "\nDeveloper Details: " + developerDetails + "\nTask number: " + tasks + "\nTask name: " + taskname + "\nTask description: " + taskDescription + "\nTask ID: " + taskID + "\ntask duration: " + duration +"hrs";  
        
    }
    
    public int returnTotalhours(){
      
        return totalHours;
    
    
    }

}

