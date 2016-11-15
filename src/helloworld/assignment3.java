
//useful object,collections,feature,tests
import java.util.ArrayList;
import java.util.Iterator;
import kiss.API;
import kiss.API.Close;
import static kiss.API.EOL;
import static kiss.API.outExpect;


public class assignment3 {  
    
    public static int findaverage(ArrayList<Integer> grades){
       int sum=0;
       int average=0;
        for (int i=0;i<grades.size();++i)
        {
            sum += grades.get(i);
        }
        average=sum/grades.size();
        return average;
   }     
         
 void run() {
        ArrayList<String> name = new ArrayList();
        name.add("Max");
        name.add("John");
        name.add("Jake");
        name.add("Jacob");
        System.out.println(name);
        ArrayList<Integer> grades =new ArrayList();
        grades.add(65);
        grades.add(92);
        grades.add(87);
        grades.add(67);
        Iterator<Integer> i =grades.iterator();
        while(i.hasNext()){
           Integer grade = i.next();
           System.out.println(grade);
        }
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
    void testgradesize() {
        ArrayList<Integer> grades =new ArrayList();
        grades.add(65);
        grades.add(92);
        grades.add(87);
        grades.add(67);
        assert(grades.size()==4);
    }
    
    void testsize(){
        ArrayList<String> name = new ArrayList();
        name.add("Max");
        name.add("John");
        name.add("Jake");
        assert(name.size()==3);
        assert(name.isEmpty()==false);
    }
    
    void testoutput(){
        ArrayList<Integer> grades =new ArrayList();
        grades.add(65);
        grades.add(92);
        grades.add(87);
        grades.add(67);
        try(API.Close out=outExpect(65,EOL,92,EOL,87,EOL,67, EOL)){
        Iterator<Integer> i =grades.iterator();
        while(i.hasNext()){
           Integer grade = i.next();
           System.out.println(grade);
        }
        }
    }
    
    void testsortedoutput(){
        ArrayList<Integer> grades =new ArrayList();
        grades.sort((b,a)->-a.compareTo(b));
        try(Close out=outExpect(65,67,87,89)){
        System.out.println("Sorted list of grades, smallest to largest");
        }
    }
    
    void testdelete() {
        ArrayList<Integer> grades =new ArrayList();
        grades.add(65);
        grades.add(92);
        grades.add(87);
        grades.add(67);
        grades.remove(1);
        assert grades.contains(92)==false;
    }
    
    void testaverage(){
        ArrayList<Integer> grades =new ArrayList();
        if(grades.size() == 0) 
        { 
            System.out.println("Cannot divide by zero");
            throw  new ArithmeticException();
        }
    }
}