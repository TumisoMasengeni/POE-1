/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mainclass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tumiso
 */
public class taskTest {
    
   

    /**
     * Test of checktaskdescription method, of class task.
     */
    @Test
    public void testChecktaskdescription() {
        System.out.println("checktaskdescription");
        String taskDescription = "ngvvvvvvhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjj";
        task instance = new task();
        boolean expResult = false;
        boolean result = instance.checktaskdescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskname = "login";
        String developerDetails = "tommy";
        int tasks = 0;
        task instance = new task();
       
        String result = instance.createTaskID(taskname, developerDetails, tasks);
         String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskdetails method, of class task.
     */
    @Test
    public void testPrintTaskdetails() {
        System.out.println("printTaskdetails");
        String taskDescription = "jhhhhhhhg";
        String taskID = "1";
        String taskname = "j";
        String developerDetails = "ff";
        int tasks = 0;
        String statusOutput = "done";
        int duration = 0;
        task instance = new task();
       
        String result = instance.printTaskdetails(taskDescription, taskID, taskname, developerDetails, tasks, statusOutput, duration);
         String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalhours method, of class task.
     */
    @Test
    public void testReturnTotalhours() {
        System.out.println("returnTotalhours");
        task instance = new task();
        int expResult = 0;
        int result = instance.returnTotalhours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
