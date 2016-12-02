/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.logging.Level;
import java.util.logging.Logger;
import static kiss.API.pause;
import static kiss.API.println;
import static kiss.API.time;

public class ConsoleClock extends Thread{
    volatile boolean running=false;
    double startTime;
        public void start(){
        startTime=kiss.API.time();
        super.start();
        }
        public void close()
        {
            running= false;
        try {
            join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ConsoleClock.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        //console clock
        public void run(){
            running=true;
          while(running) {
                pause(1.0);
                println("t=" +( time()-startTime));
              
        }
    }
}


