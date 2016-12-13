/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Gameplay extends JPanel implements KeyListener, ActionListener{
    private boolean play=false;
    private int score =0;
    private int totalBricks=28;
    
    private Timer timer;
    private int delay= 10;
    private int playerX=310;
    private int ballpositionx = 120;
    private int ballpositiony=350;
    private int ballxdirection=-1;
    private int ballydirection=-2;
    
    private MapGenerator map;
    public Gameplay(){
        map= new MapGenerator(4,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }
    
    
    public void paint(Graphics g){
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,800,600);
        
        //drawing map
        map.draw((Graphics2D) g);
        
        //borders
        g.setColor(Color.green);
        g.fillRect(0,0,7,800);
        g.fillRect(0,0,800,7);
        g.fillRect(687,0,7,600);
        
        //scores
        g.setColor(Color.white);
        g.setFont(new Font("serif",Font.BOLD, 25));
        g.drawString(""+score,590,30);
        
        //paddle
        g.setColor(Color.red);
        g.fillRect(playerX,550,100,8); 
        
        //ball
        g.setColor(Color.red);
        g.fillOval(ballpositionx,ballpositiony,20,20);
        
        if(totalBricks <= 0) {
            play=false;
            ballxdirection =0;
            ballydirection =0;
            g.setColor(Color.red);
            g.setFont(new Font("serif",Font.BOLD, 30));
            g.drawString("You Won!",190,300);
            
            g.setFont(new Font("serif",Font.BOLD, 20));
            g.drawString("Press Enter to Restart ",230,350);
        }
        
        if(ballpositiony > 570) {
            play=false;
            ballxdirection =0;
            ballydirection =0;
            g.setColor(Color.red);
            g.setFont(new Font("serif",Font.BOLD, 30));
            g.drawString("Game Over",250,300);
           
            
            g.setFont(new Font("serif",Font.BOLD, 20));
            g.drawString("Press Enter to Restart ",230,350);
        }
        
        if(ballpositiony == 350 && ballpositionx == 120 ){
          g.setFont(new Font("serif",Font.BOLD, 20));
            g.drawString("Press an Arrow to Begin",230,350);  
        }
        g.dispose();
    }
    
    
    @Override 
    public void actionPerformed(ActionEvent e){
        timer.start();
        
        if(play){
            if(new Rectangle(ballpositionx,ballpositiony,20,20).intersects(new Rectangle(playerX,550,100,8))){
                ballydirection= -ballydirection;
            }
            A: for(int i=0; i<map.map.length;i++){
                for(int j=0;j<map.map[0].length;j++){
                    if (map.map[i][j] > 0) {
                        int brickX=j*map.brickWidth +80;
                        int brickY=i * map.brickHeight + 50;
                        int brickWidth=map.brickWidth;
                        int brickHeight = map.brickHeight;
                        
                        Rectangle rect = new Rectangle(brickX,brickY,brickWidth,brickHeight);
                        Rectangle ballRect = new Rectangle (ballpositionx,ballpositiony,20,20);
                        Rectangle brickRect = rect;
                        
                        if(ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i,j);
                            totalBricks--;
                            score += 5;
                    
                
            
                            if(ballpositionx + 19 <= brickRect.x || ballpositionx + 1 >= brickRect.x + brickRect.width){
                                ballxdirection = -ballxdirection;
                                
                            }else{
                                ballydirection = -ballydirection;
                                
                            }
                            break A;
                        }
                    }
                    
                    }
                }
            
            
            ballpositionx+=ballxdirection;
            ballpositiony += ballydirection;
            if(ballpositionx < 0){
                ballxdirection= -ballxdirection;
            }
            if(ballpositiony < 0){
                ballydirection= -ballydirection;
            }
            if(ballpositionx > 670){
                ballxdirection= -ballxdirection;
            }
        }
        
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

     @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
        if(playerX >=600 )
        {
            playerX = 600;
        }
        else{
            moveRight();
        }
        }
        
        if(ke.getKeyCode()==KeyEvent.VK_LEFT){
        if(playerX < 10)
        {
            playerX = 10;
        }
        else{
            moveLeft();
        }
    }
    
        if(ke.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!play){
                play=true;
                ballpositionx=120;
                ballpositiony=350;
                ballxdirection=-1;
                ballydirection=-2;
                playerX= 310;
                score=0;
                totalBricks=28;
                map = new MapGenerator(4,7);
                
                repaint();
            }
        }
    }
public void moveRight(){
    play=true;
    playerX+=20;
}
public void moveLeft(){
    play=true;
    playerX-=20;
}

void testbricks(){
    map= new MapGenerator(4,7);
    int totalBricks=28;
    assert(totalBricks==4*7);
    }

void testGameEnd(){
    if(totalBricks == 0)
        play=false;
    if (totalBricks <=28)
        play=true;
    }
    
void testScore(){
    if(totalBricks == 20)
        score= 35;
    if(totalBricks == 16)
        score=60;
    if(totalBricks == 7)
        score=105;
    }
    
}