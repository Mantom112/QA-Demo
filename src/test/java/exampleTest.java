/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import com.mycompany.junitexamples.Mathstuff;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tommy
 */
public class exampleTest {
    @Test
    public void test_JUnit() {
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        assertEquals("This is the testcase in this class", str1);
    }
    @Test
    public void test_JUnit2() {
        System.out.println("This is the testcase in this class");
        String str1="This is the testcase in this class";
        boolean compare = false;
        if (str1.equals("This is the testcase in this class"))
            compare = true;
        assertFalse(compare);
    }
    
    @Test
    public void test_JUnit3() {
        Mathstuff test = new Mathstuff();
        assertEquals(200, test.outputTest());
                
    }
    
    @Test
    public void test_JUnit4()
    {
        Mathstuff test = new Mathstuff();
        assertEquals(test.randomStuff, "hey man whats up");
    }
    
}