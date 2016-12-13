/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        JFrame object =new JFrame();
        Gameplay gameplay= new Gameplay();
        object.setBounds(10,10,700,600);
        object.setTitle("Brick Breaker");
        object.setResizable(false);
        object.setVisible(true);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        object.add(gameplay);
        //above creates empty frame
    }
    
}

