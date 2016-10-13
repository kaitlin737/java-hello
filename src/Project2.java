/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kcstark
 */
public class Project2 {
   
  
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
    }
}