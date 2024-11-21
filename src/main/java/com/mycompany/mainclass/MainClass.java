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
      

        // Declaration
        String name;
        String surname;
        String capturedUsername;
        String capturedPassword;
        String LoginUserName;
        String LoginpassWord;

        // Class instance creation
        Login user = new Login();
        task create = new task();
        Report details = new Report();

        // Object Scanner creation
        Scanner input = new Scanner(System.in);

        // Prompting user to enter first name
        System.out.println("Please enter your name:");
        name = input.next();

        // Prompting user to enter last name
        System.out.println("Please enter your last name:");
        surname = input.next();

        // Creating username by prompting user
        System.out.println("Please create a username not longer than 5 characters and contains an underscore:");
        capturedUsername = input.next();

        // Creating password by prompting user
        System.out.println("Please create a password longer than 7 characters:");
        capturedPassword = input.next();

        // Process of verifying conditions for registration
        if (user.checkUserName(capturedUsername) && user.checkPasswordComplexity(capturedPassword)) {
            String register = user.registerUser(capturedUsername, capturedPassword);
            System.out.println(register);
        }

        // Login to account
        if (capturedUsername.contains("_") && capturedUsername.length() <= 5 && user.checkPasswordComplexity(capturedPassword)) {
            System.out.println("Please enter your username to login:");
            LoginUserName = input.next();

            System.out.println("Please enter your password to login:");
            LoginpassWord = input.next();

            if (user.loginUser(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname)) {
                String status = user.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
                System.out.println(status);

                final JDialog top = new JDialog();
                top.setAlwaysOnTop(true);

                JOptionPane.showMessageDialog(top, "Welcome to EasyKanban", "Welcome", JOptionPane.INFORMATION_MESSAGE);

                int option = 0;
                String[] definetasks = null;
                String[] developer = null;
                String[] taskNames = null;
                String[] tasKid = null;
                int[] taskDuration = null;
                String[] tasKstatus = null;
                int tasks = 0;

                while (option != 3) {
                    // Numeric menu
                    System.out.println("1. Add Task(s)");
                    System.out.println("2. Show Report");
                    System.out.println("3. Quit");
                    option = Integer.parseInt(JOptionPane.showInputDialog("Enter Option: (1. Add tasks) (2. Show Report) (3. Quit"));

                    switch (option) {
                        case 1: // Add tasks
                            tasks = Integer.parseInt(JOptionPane.showInputDialog(top, "How many tasks do you want to enter?", "Task Amount", JOptionPane.QUESTION_MESSAGE));
                            definetasks = new String[tasks];
                            developer = new String[tasks];
                            taskNames = new String[tasks];
                            tasKid = new String[tasks];
                            taskDuration = new int[tasks];
                            tasKstatus = new String[tasks];

                            for (int i = 0; i < definetasks.length; i++) {
                                String taskName = JOptionPane.showInputDialog(top, "Enter task name:");
                                taskNames[i] = taskName;

                                // Prompting user to enter a valid task description
                                String taskDescription;
                                do {
                                    taskDescription = JOptionPane.showInputDialog(top, "Enter task description (must be less than 50 characters):");
                                    if (!create.checktaskdescription(taskDescription)) {
                                        JOptionPane.showMessageDialog(top, "Description too long! Please enter a description with fewer than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                } while (!create.checktaskdescription(taskDescription));
                                JOptionPane.showMessageDialog(top, "Task successfully captured", "Task Capture", JOptionPane.INFORMATION_MESSAGE);

                                String developerDetails = JOptionPane.showInputDialog(top, "Enter developer's full name (name and surname):");
                                developer[i] = developerDetails;

                                int duration = Integer.parseInt(JOptionPane.showInputDialog(top, "Enter task duration (in hours)", "Task Duration", JOptionPane.PLAIN_MESSAGE));
                                taskDuration[i] = duration;

                                String taskID = create.createTaskID(taskName, developerDetails, i);
                                tasKid[i] = taskID;
                                JOptionPane.showMessageDialog(top, taskID, "Task ID", JOptionPane.INFORMATION_MESSAGE);

                                String[] statusOptions = {"To Do", "Done", "Doing"};
                                int taskStatus = JOptionPane.showOptionDialog(top, "Enter status of task", "Task Status", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
                                tasKstatus[i] = taskStatus == 0 ? "To Do" : taskStatus == 1 ? "Done" : "Doing";

                                JOptionPane.showMessageDialog(top, create.printTaskdetails(taskDescription, taskID, taskName, developerDetails, i, tasKstatus[i], duration), "Full Task Details", JOptionPane.INFORMATION_MESSAGE);
                            }
                            JOptionPane.showMessageDialog(top, "Total hours: " + create.returnTotalhours() + " hrs", "Total Hours", JOptionPane.INFORMATION_MESSAGE);
                            
                            details.setTaskData(taskNames, developer, tasKstatus, taskDuration, tasKid);
                            break;

                        case 2: // Show report
                          
                            
                             String[] reportOptions = {"Show Completed Tasks", "Search for a Task by Name", "Show Longest Task", "Search Task by User", "Delete Task Using Task Name", "Show Full Report"};
                                int reportChoice = JOptionPane.showOptionDialog(top, "Choose an option:", "Show Report", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, reportOptions, reportOptions[0]);

                                switch (reportChoice) {
                                    case 0: // Show Completed Tasks
                                        StringBuilder doneTasksReport = new StringBuilder("Tasks with status 'Done':\n");
                                        for (int i = 0; i < tasks; i++) {
                                            if ("Done".equals(tasKstatus[i])) {
                                                doneTasksReport.append("Task Name: ").append(taskNames[i]).append("\n")
                                                               .append("Developer: ").append(developer[i]).append("\n")
                                                               .append("Duration: ").append(taskDuration[i]).append(" hours\n\n");
                                            }
                                        }
                                        if (doneTasksReport.length() > 0) {
                                            JOptionPane.showMessageDialog(top, doneTasksReport.toString(), "Completed Tasks Report", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(top, "No tasks with the status 'Done'.", "Completed Tasks Report", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        break;

                                    case 1: // Search for a specific task by name
                                        String taskNameToSearch = JOptionPane.showInputDialog(top, "Enter the task name to search:");
                                        String searchResult = details.searchTaskByName(taskNameToSearch, taskNames, developer, tasKstatus);
                                        JOptionPane.showMessageDialog(top, searchResult, "Task Search Result", JOptionPane.INFORMATION_MESSAGE);
                                        break;

                                    case 2: // Show longest task
                                        int longestTaskIndex = details.findLongestTask(taskDuration);
                                        if (longestTaskIndex != -1) {
                                            JOptionPane.showMessageDialog(top, "Task with the longest duration:\n" +
                                                    "Task Name: " + taskNames[longestTaskIndex] + "\n" +
                                                    "Developer: " + developer[longestTaskIndex] + "\n" +
                                                    "Duration: " + taskDuration[longestTaskIndex] + " hours", "Longest Task", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(top, "No tasks available.", "Longest Task", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        break;

                                    case 3: // Search for tasks by developer
                                        String developerToSearch = JOptionPane.showInputDialog(top, "Enter the developer's name to view tasks:");
                                        String searchResultByDeveloper = details.searchTasksByDeveloper(developerToSearch, taskNames, developer, tasKstatus);
                                        JOptionPane.showMessageDialog(top, searchResultByDeveloper, "Developer's Task Search Result", JOptionPane.INFORMATION_MESSAGE);
                                        break;

                                    case 4: // Delete task by name
                                        String taskNameToDelete = JOptionPane.showInputDialog(top, "Enter the name of the task to delete:");
                                        if (taskNameToDelete != null && !taskNameToDelete.trim().isEmpty()) {
                                            String deleteMessage = details.deleteTaskByName(taskNameToDelete, taskNames, developer, tasKstatus, taskDuration);
                                            JOptionPane.showMessageDialog(top, deleteMessage, "Delete Task", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(top, "Task name cannot be empty.", "Delete Task", JOptionPane.WARNING_MESSAGE);
                                        }
                                        break;

                                    case 5: // Show full report
                                        String fullReport = details.displayAllTasksReport();
                                        JOptionPane.showMessageDialog(top, fullReport, "All Tasks Report",
                                                 JOptionPane.INFORMATION_MESSAGE);
                                        break;

                                    default:
                                        break;
                           
}
                    break;

                        case 3: // Quit
                            JOptionPane.showMessageDialog(top, "Goodbye", "Task Capture", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        default:
                            JOptionPane.showMessageDialog(top, "Invalid option. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }
                top.dispose();
            } else {
                String status = user.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
                System.out.println(status);
            }
        } else {
            String register = user.registerUser(capturedUsername, capturedPassword);
            System.out.println(register);
        }
    }

    
}

    

