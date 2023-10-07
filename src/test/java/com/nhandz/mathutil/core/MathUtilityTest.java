/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nhandz.mathutil.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lmnhn
 */
public class MathUtilityTest {
    
    //Cấu trúc TC: ID / Desc | Steps/Procedures | Expected Result | Status
    // Test case #1: - verify 
    
    //  2.Call/invoke getFactorial(n=0)
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    // Test case #2
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    
    //Test case #3
    @Test
    public void verifyFactorialGivenRightArgument5ReturnOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
}
