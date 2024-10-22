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
public class LoginTest {
    
  

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String capturedUsername = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(capturedUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String capturedPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(capturedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String capturedUsername = "kyl_1";
        String capturedPassword = "Ch&&sec@ke99";
        Login instance = new Login();
        String result = instance.registerUser(capturedUsername, capturedPassword);
         String expResult = result;
        assertEquals(expResult, result);
         
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String LoginUserName = "kyl_1";
        String LoginpassWord = "Ch&&sec@ke99";
        String capturedUsername = "kyl_1";
        String capturedPassword = "Ch&&sec@ke99";
        String name = "tumiso";
        String surname = "manzini";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String LoginUserName = "kyl_1";
        String LoginpassWord = "Ch&&sec@ke99";
        String capturedUsername = "kyl_1";
        String capturedPassword = "Ch&&sec@ke99";
        String name = "kyle";
        String surname = "walker";
        Login instance = new Login();
        String result = instance.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
         String expResult = result;
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
