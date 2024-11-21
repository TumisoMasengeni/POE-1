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
public class ReportTest {
    
   

    /**
     * Test of findLongestTask method, of class Report.
     */
    @Test
    public void testFindLongestTask() {
        System.out.println("findLongestTask");
        int[] durations = null;
        Report instance = new Report();
        int expResult = 0;
        int result = instance.findLongestTask(durations);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Report.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "";
        String[] taskNames = null;
        String[] developers = null;
        String[] statuses = null;
        Report instance = new Report();
        String expResult = "";
        String result = instance.searchTaskByName(taskName, taskNames, developers, statuses);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Report.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "";
        String[] taskNames = null;
        String[] developers = null;
        String[] taskStatus = null;
        Report instance = new Report();
        String expResult = "";
        String result = instance.searchTasksByDeveloper(developerName, taskNames, developers, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Report.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "login";
        String[] taskNames = null;
        String[] developers = null;
        String[] taskStatus = null;
        int[] taskDuration = null;
        Report instance = new Report();
        String expResult = "";
        String result = instance.deleteTaskByName(taskName, taskNames, developers, taskStatus, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskData method, of class Report.
     */
    @Test
    public void testSetTaskData() {
        System.out.println("setTaskData");
        String[] taskNames = null;
        String[] developers = null;
        String[] taskStatus = null;
        int[] taskDuration = null;
        String[] tasKid = null;
        Report instance = new Report();
        instance.setTaskData(taskNames, developers, taskStatus, taskDuration, tasKid);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasksReport method, of class Report.
     */
    @Test
    public void testDisplayAllTasksReport() {
        System.out.println("displayAllTasksReport");
        Report instance = new Report();
        String expResult = "";
        String result = instance.displayAllTasksReport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
