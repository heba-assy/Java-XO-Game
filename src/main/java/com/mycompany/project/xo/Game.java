
package com.mycompany.project.xo;

import java.util.Scanner;

public class Game {
    private Board b=new Board();
    private Player p1=new Player();
    private Player p2=new Player();
    private int count=0;
    
    Scanner cin=  new Scanner(System.in);
    
    public void readPlayerData(){
        
        System.out.println("....Welcome To XO Game....");
        System.out.println("Enter P1 Name: ");
        String n = cin.next();
        p1.setName(n);
        
        System.out.println("Enter P1 Op (X,O): ");
        char c = cin.next().charAt(0);
        p1.setOp(c);
        
        System.out.println("Enter P2 Name: ");
        n = cin.next();
        p2.setName(n);
        
        if(p1.getOp()=='X'){
            p2.setOp('O');
        }
        else{
            p2.setOp('X');
        }
       
    }
    
    public void play(){
        readPlayerData();
        b.draw();
        
        while(!b.isFull()){
            Player cp=p1;
            if(count%2==1){
                cp=p2;
            }
            while(true){
                System.out.print("Select an empty position from 1:9-> ");
                int pos=cin.nextInt();
                if(b.repChar(pos, cp)){
                    break;
                }
            }
            b.draw();
            if(b.isWin(cp)){
                System.out.print("The Winner is: "+ cp.getName());
                return;
            }
            count++;
        }
        System.out.println("Game is Draw!....");
    }
}
