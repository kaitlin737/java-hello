/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;


public class HelloWorld {
    
    void testRun() {
       try (Close out = outExpect("Hello World!")) {
           run ();
       }
    }
    

  void run() {
      println("Hello World!");
      }
              

void testBooleans(){
assert true != false;
assert true == true;
assert false == false;
try (Close out = outExpect("true")) {println(true);}
try (Close out = outExpect("false")) {println(false);}

// not

assert !true == false;
assert !false == true;

//and 
assert (true && true) == true;
assert (true && false) == false;
assert (false && true) == false;
assert (false && false) == false;

assert (false && random(0,1) == 1) == false;

assert (false && (1/0 ==3)) == false;

 //or
 
 assert (true || true) == true;
 assert ( true || false) == true;
 assert (false || true) == true;
 assert (false || false) == false;
 
 assert (true || (random(0,1) == 1)) == true;

}


void testInts(){
    assert Integer.MAX_VALUE == Math.pow(2,31)-1;
    assert Integer.MAX_VALUE == 2_147_483_647;
   assert Integer.MAX_VALUE == 0b0111_1111_1111_1111_1111_1111_1111_1111;
    
    assert Integer.MIN_VALUE == -Math.pow(2,31);
    //assert Integer.MIN_VALUE == -2_147_483_647;
    assert Integer.MIN_VALUE == 0b1000_0000_0000_0000_0000_0000_0000_0000;
    
    assert Integer.MIN_VALUE - 1 == Integer.MAX_VALUE;
    assert Integer.MAX_VALUE +1 == Integer.MIN_VALUE;
    
    int x=3;
    int y= 0xffff;
    int z= 0b10_01;
    
    assert x == 3;
    assert y == 65_535;
    assert z == 9;
    
    assert Integer.toString(x,10).equals("3");
    assert Integer.toString(y,16).equals("ffff");
    assert Integer.toString(z,2).equals("1001");
    
    assert 17/5 == 3;
    assert ((double) 17)/((double)5) ==3.4;
    
    int a =1;
    ++a;
    
    try(Close out = outExpect("2")) {println(a);}
    
    try(Close out= outExpect("3")) {println(++a);}
    try(Close out= outExpect("3")) {println(a);}
    
    try(Close out= outExpect("3")) {println(a++);}
    try(Close out= outExpect("4")) {println(a);}
    
    //bitwise not
    assert ~0b0000_0000_0000_0000_0000_0000_1111_0000 
         == 0b1111_1111_1111_1111_1111_1111_0000_1111;
    assert ~0b1111_0000
         == 0b1111_1111_1111_1111_1111_1111_0000_1111;
    
    //bitwise and
    assert (0b1111_0000 
          & 0b1010_1010) == 
            0b1010_0000;
    
    //bitwise or
    assert (0b1111_0000 
          | 0b1010_1010) == 
            0b1111_1010;
    
    //bit-shift operator
    assert (0b1010_1111_0000 >> 4) ==
                 0b1010_1111;
    
      //bit-shift operator
    assert (0b1010_1111_0000 << 4) ==
       0b1010_1111_0000_0000;
    
    int b= random(0,1_000_000);
    println(b);
    assert((b>>1) == b/2);
    assert(((-b)>>1) == -b/2);
    assert((b<<1) == 2*b);
    assert(((-b)<<1) == 2*(-b));
    
    int c =random(-1_000_000, 1_000_000);
    
    assert((~c)+1)==-c;
    
    assert -2 == 0b1111_1111_1111_1111_1111_1111_1111_1110;
    
    //right shifts shift the sign bit in (highest order bit)
    assert (-2 >> 1) == 0b1111_1111_1111_1111_1111_1111_1111_1111;
    println(Integer.toString(-2,2));
            
}

void testloop(){
    
}
}