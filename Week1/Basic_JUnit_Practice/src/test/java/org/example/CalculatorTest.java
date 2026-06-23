package org.example;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;
    @BeforeEach
    void setUp(){
        c= new Calculator();
        System.out.println("Setup Done --- Calculator Created ");
    }

    @Test
    void add() {
        int result = c.add(10,10);
        assertEquals(20,result);
    }

    @Test
    void divide() {
        double result= c.divide(10,2);
        assertEquals(5,result);
    }

    @Test
    void multiply() {
        int result= c.multiply(10,10);
        assertEquals(100,result);
    }

    @Test
    void sub() {
        int result = c.sub(10,10);
        assertEquals(0,result);
    }

    @AfterEach
    void tearDown(){
        System.out.println("TearDown is performed - - - \n");
    }
}