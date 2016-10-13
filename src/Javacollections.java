/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;
import static kiss.API.*;
/**
 *
 * @author kcstark
 */
public class Javacollections {
    public int compare (Integer a,Integer b){
        return -a.compareTo(b);
    }
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        name.add("Max");
        name.add("John");
        name.add("Jake");
        assert(name.size()==3);
        assert(name.isEmpty()==false);
        name.add("Jacob");
        assert(name.size()==4);
        System.out.println(name);
        ArrayList<Integer> grades =new ArrayList();
        grades.add(65);
        grades.add(92);
        grades.add(87);
        grades.add(67);
        assert(grades.size()==4);
        try(Close out=outExpect(65,EOL,92,EOL,87,EOL,67, EOL)){
        Iterator<Integer> i =grades.iterator();
        while(i.hasNext()){
           Integer grade = i.next();
           System.out.println(grade);
        }
        }
        grades.remove(1);
        assert grades.contains(92)==false;
        System.out.println("After removing element 92");
        System.out.println(grades);
        grades.add(1,89);
        System.out.println("Added grade at index 1");
        System.out.println(grades); 
        grades.sort((a,b)->-a.compareTo(b));
        System.out.println("Sorted list of grades,largest to smallest");
        System.out.println(grades);
        grades.sort((b,a)->-a.compareTo(b));
        System.out.println("Sorted list of grades, smallest to largest");
        System.out.println(grades);
    }
}