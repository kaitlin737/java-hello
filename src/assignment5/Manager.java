/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import assignment5.duty;
import static kiss.API.*;
public class Manager {

   String name;
   duty duty;
   boolean retired = false;
   boolean finished = false;
   boolean started = false;
   class Action extends  Thread {
        public void run() {
            for(;;){
                duty.addduty(name);
                println(name, "got",duty.getduty());
            }
        }
   }
   
   Action action;
   
   void retired() { 
       retired= true;
   } 
   void endShift() { 
       finished = true;
   } 
   void beginshift(){
       started=true;
   }
   Manager(String _name,duty _duty) {
       name=_name;
       duty= duty;
       action= new Action();
       action.start();
   }
}

