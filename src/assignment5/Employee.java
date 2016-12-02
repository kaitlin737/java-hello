
package assignment5;
import assignment5.duty;
import static kiss.API.*;

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
  

