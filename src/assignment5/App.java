/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import static kiss.API.*;


public class App {
    
         void testEmployees(){
           duty duty = new duty();
           duty.addduty("clean");
           duty.addduty("cook");
           duty.addduty("cashier");
            Employee John = new Employee("John",duty);
            Employee Fred = new Employee("Fred",duty);
            Employee Greg = new Employee("Greg",duty);
            Employee Kayla = new Employee("Kayla",duty);
            Manager Megan= new Manager("Megan",duty);
            Manager Deb = new Manager("Deb", duty);
            Manager Larry = new Manager("Larry", duty);
            pause(10);
            John.beginshift();
            Greg.beginshift();
            Fred.beginshift();
            John.endShift();
            Fred.endShift();
            Greg.endShift();
            Megan.retired();
            Deb.retired();
            Larry.beginshift();
            Larry.endShift();
        }
         public class Countdown extends Thread{
            
             public void run(){
                 println("begin");
             }   
         }
        public class countdown implements Runnable{
            public void run(){
                println("Started Shift");
                pause(10);
                println("Done With Shift");
            }
        }
        public static void main() {
                 Thread thread =new Thread();
                 thread.start();
                  
            }
 
    }




