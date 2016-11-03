package helloworld;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kcstark
 */
public class Tests {
 import org.junit.Test;
import static org.junit.Assert.*;
 
public class MyAssertEqualsTest {
 
    @Test
    public void EqualsTest(){
         
        String name = "Max";
        Assert.assertEquals("Max");
    }
       
    @Test
    public void testAddition(){
      int grade1=65;
      int grade2=92;
      int addition = grade1 + grade2;
      Assert.assertTrue(addition == 157);
   }
    @Test
    public void testDivision(){
      double grade1=60;
      double grade2=40;
      double division=(grade1/grade2);
      Assert.assertTrue(division == 1.5);
}
    @Test
    public void testDivisionWithZero()
    {
        double grade1=54;
        double grade2=64;
        try {
            double answer=(grade1+grade2)/0;
        fail("Cannot divide by zero");
        }
    catch (ArithmeticException answer) {
    }
    }
    
    @Test
    public void testAverage()
    {
        double grade1=45;
        double grade2=76;
        double grade3=56;
        double average=(grade1+grade2+grade3)/3;
        Assert.assertTrue(average==59);
    }
}   
}   

