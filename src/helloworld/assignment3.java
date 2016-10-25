

import java.util.ArrayList;
import java.util.Iterator;

public class assignment3 {
   
    
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
       try(Close out = outExpect("Max","John","Jake","Jacob")){
       System.out.println(name);
       }
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
       //try(Close out = outExpect(65,EOL,92,EOL,87,EOL,67)){
       System.out.println(grade);  
      }
       
   grades.remove(1);
   assert(grades.size()==3);
   assert grades.contains(92)==false;
   System.out.println("After removing element 92");
   try(Close out = outExpect(65,87,67)){
   System.out.println(grades);
   grades.add(1,89);
   assert(grades.size()==4);
   assert(grades.contains(89)==true);
   System.out.println("Added grade at index 1");
   //try(Close out = outExpect(65,89,87,67)){
   System.out.println(grades);
   grades.sort((a,b)->-a.compareTo(b));
   //try(Close out = outExpect(89,87,67,65)){
   System.out.println("Sorted list of grades,largest to smallest");
   System.out.println(grades);
   grades.sort((b,a)->-a.compareTo(b));
   //try(Close out = outExpect(65,67,87,89)){
   System.out.println("Sorted list of grades, smallest to largest");
   System.out.println(grades);    
   System.out.println("The average test score was");
   //try(Close out = outExpect(77)){
   System.out.println(findaverage(grades));
    }
}