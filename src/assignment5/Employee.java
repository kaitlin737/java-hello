/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import assignment5.duty;
import static kiss.API.*;
/**
 *
 * @author kcstark
 */
public class Employee {
   String name;
   duty duty;
   volatile boolean finished = false;
   volatile boolean started = false;
   class Action extends  Thread {
        public void run() {
            while(!finished){
                pause (random(0,3000)*0.001);
                println(name, "got",duty.getduty());
            }
        }
   }
   
   Action action;
   
   void endShift() { 
       finished = true;
   } 
   void beginshift(){
       started=true;
   }
   Employee(String _name, duty _duty) {
       name=_name;
       duty= _duty;
       action= new Action();
       action.start();
   }
}
  

