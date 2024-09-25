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
     * Test of getName method, of class Login.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Login instance = new Login();
        String expResult = "Tumiso";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Login.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Tumiso";
        Login instance = new Login();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getsurname method, of class Login.
     */
    @Test
    public void testGetsurname() {
        System.out.println("getsurname");
        Login instance = new Login();
        String expResult = "Manzini";
        String result = instance.getsurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setsurname method, of class Login.
     */
    @Test
    public void testSetsurname() {
        System.out.println("setsurname");
        String surname = "Manzini";
        Login instance = new Login();
        instance.setsurname(surname);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Login.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Login instance = new Login();
        String expResult = "TLM_";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Login.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String capturedUsername = "TLM_";
        Login instance = new Login();
        instance.setUsername(capturedUsername);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Login.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Login instance = new Login();
        String expResult = "Tumiso@123";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Login.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String capturedPassword = "Tumiso@123";
        Login instance = new Login();
        instance.setPassword(capturedPassword);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginUsername method, of class Login.
     */
    @Test
    public void testGetLoginUsername() {
        System.out.println("getLoginUsername");
        Login instance = new Login();
        String expResult = "TLM_";
        String result = instance.getLoginUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginUsername method, of class Login.
     */
    @Test
    public void testSetLoginUsername() {
        System.out.println("setLoginUsername");
        String LoginUserName = "TLM_";
        Login instance = new Login();
        instance.setLoginUsername(LoginUserName);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getLoginPassword method, of class Login.
     */
    @Test
    public void testGetLoginPassword() {
        System.out.println("getLoginPassword");
        Login instance = new Login();
        String expResult = "Tumiso@123";
        String result = instance.getLoginPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoginPassword method, of class Login.
     */
    @Test
    public void testSetLoginPassword() {
        System.out.println("setLoginPassword");
        String LoginpassWord = "Tumiso@123";
        Login instance = new Login();
        instance.setLoginPassword(LoginpassWord);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String capturedUsername = "TLM_";
        Login instance = new Login();
       // boolean expResult = false;
        boolean result = instance.checkUserName(capturedUsername);
       // assertEquals( result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String capturedPassword = "Tumiso@123";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(capturedPassword);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String capturedUsername = "TLM_";
        String capturedPassword = "Tumiso@123";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(capturedUsername, capturedPassword);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String LoginUserName = "TLM_";
        String LoginpassWord = "Tumiso@123";
        String capturedUsername = "TLM_";
        String capturedPassword = "Tumiso@123";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(LoginUserName, LoginpassWord, capturedUsername, capturedPassword);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String LoginUserName = "TLM_";
        String LoginpassWord = "Tumiso@123";
        String capturedUsername = "TLM_";
        String capturedPassword = "Tumiso@123";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(LoginUserName, LoginpassWord, capturedUsername, capturedPassword);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
