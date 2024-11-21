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
        int[] durations = {5, 8, 2, 11};
        Report instance = new Report();
        int result = instance.findLongestTask(durations);
          int expResult = result;
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
        String taskName = "Create Login";
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] developers =  {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] statuses = {"To Do", "Doing", "Done", "To Do"};
        Report instance = new Report();
  
        String result = instance.searchTaskByName(taskName, taskNames, developers, statuses);
              String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Report.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "Mike Smith";
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] developers =  {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskStatus = {"To Do", "Doing", "Done", "To Do"};
        Report instance = new Report();
        String result = instance.searchTasksByDeveloper(developerName, taskNames, developers, taskStatus);
        String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Report.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "Create Login";
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskStatus = {"To Do", "Doing", "Done", "To Do"};
        int[] taskDuration = {5, 8, 2, 11};
        Report instance = new Report();
        
        String result = instance.deleteTaskByName(taskName, taskNames, developers, taskStatus, taskDuration);
        String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskData method, of class Report.
     */
    @Test
    public void testSetTaskData() {
        System.out.println("setTaskData");
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskStatus = {"To Do", "Doing", "Done", "To Do"};
        int[] taskDuration = {5, 8, 2, 11};
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
        String result = instance.displayAllTasksReport();
        String expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
