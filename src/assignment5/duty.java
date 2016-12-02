/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class duty {
    private LinkedList<String> data= new LinkedList<String> ();
  
  public synchronized void addduty(String duty){
      data.add(duty);
  }
  
  public List<String> getduty(){
      ArrayList<String> ans= new ArrayList<String>(data);
      return ans;
      
  }
  
}
