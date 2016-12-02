/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import assignment5.ConsoleClock;
import assignment5.Employee;
import assignment5.Manager;
import assignment5.duty;
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
        class Worker implements Runnable{
            @Override
            public void run(){
                println("Started");
                pause(3);
                println("Done");
            }
        }
    void run(){
        new Thread(()-> {pause(2);println("Begin shift"); }).start();
        Worker worker=new Worker();
        Thread workerThread = new Thread(worker);
        workerThread.start();
        new Thread(new Worker()).start();
        ConsoleClock clock = new ConsoleClock();
        clock.start();
        pause(4.0);
        clock.close();
        println("done");
    }
}



