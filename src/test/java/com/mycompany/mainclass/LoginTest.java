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
        String capturedUsername = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(capturedUsername);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String capturedPassword = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(capturedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String capturedUsername = "";
        String capturedPassword = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(capturedUsername, capturedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String LoginUserName = "";
        String LoginpassWord = "";
        String capturedUsername = "";
        String capturedPassword = "";
        String name = "";
        String surname = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String LoginUserName = "";
        String LoginpassWord = "";
        String capturedUsername = "";
        String capturedPassword = "";
        String name = "";
        String surname = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword, name, surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
