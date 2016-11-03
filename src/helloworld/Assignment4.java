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
//use junit 
/* 
private-same class only
nothing- any class in the same package
protected any class in the same package + any derived class
public-anybody has access

*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Iterator;
   
    public class Assignment4 {
    public static int findaverage(ArrayList<Integer> grades){
       int sum=0;
       int average=0;
      if(grades.size() == 0) 
        { 
            System.out.println("Cannot divide by zero");
            throw  new ArithmeticException();
        }
        for (int i=0;i<grades.size();++i)
        {
            sum += grades.get(i);
        }
        average=sum/grades.size();
        return average;
   }     
         
    
    public static void main(String[] args){
        
       ArrayList<String> name = new ArrayList();
       assert(name.isEmpty()==true);
       name.add("Max");
       assert(name.size() ==1);
       name.add("John");
       assert(name.size()==2);
       name.add("Jake");
       assert(name.size()==3);
       assert(name.isEmpty() == false);
       name.add("Jacob");
       assert(name.size()==4);
       System.out.println(name);
       ArrayList<Integer> grades= new ArrayList();
       assert(grades.isEmpty()==true);
       grades.add(65);
       assert(grades.size()==1);
       grades.add(92);
       assert (grades.size()==2);
       grades.add(87);
       assert(grades.size()==3);
       grades.add(67);
       assert(grades.size()==4);
       Iterator<Integer> i = grades.iterator();
       while (i.hasNext()){
       Integer grade = i.next();
       System.out.println(grade);  
       
   grades.remove(1);
   assert(grades.size()==3);
   assert grades.contains(92)==false;
   System.out.println("After removing element 92");
   System.out.println(grades);
   grades.add(1,89);
   assert(grades.size()==4);
   assert(grades.contains(89)==true);
   System.out.println("Added grade at index 1");
   System.out.println(grades);
   grades.sort((a,b)->-a.compareTo(b));
   System.out.println("Sorted list of grades,largest to smallest");
   System.out.println(grades);
   grades.sort((b,a)->-a.compareTo(b));
   System.out.println("Sorted list of grades, smallest to largest");
   System.out.println(grades);    
   System.out.println("The average test score was");
   System.out.println(findaverage(grades));
}
    }
}

}
