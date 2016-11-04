package helloworld;


import java.lang.reflect.Array;
import static kiss.API.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kcstark
 */
public class Test {
   void run(){
    int king=0;
    int queen=0;
    int rooks=0;
    int bishops=0;
    int knights=0;
    int pawns=0;
    int [] input;
    input= new int [6];
    input[0]=0;
    input[1]=1;
    input[2]=2;
    input[3]=2;
    input[4]=2;
    input[5]=7;
    king=input[0];
    queen=input[1];
    rooks=input[2];
    bishops=input[3];
    knights=input[4];
    pawns=input[5];
    if(king ==1)
        System.out.println(0);
    else 
        System.out.println(1-king);
    
    if (queen == 1)
        System.out.println(0);
    else 
        System.out.println(1-queen);
    
    if (rooks == 2)
        System.out.println(0);
    else 
        System.out.println(2-rooks);
    
    if (bishops == 2)
        System.out.println(0);
    else 
        System.out.println(2-bishops);
    
    if (knights == 2)
        System.out.println(0);
    else 
        System.out.println(2-knights);
    
    if (pawns == 8)
        System.out.println(0);
    else 
        System.out.println(8-pawns);
}
    
}
