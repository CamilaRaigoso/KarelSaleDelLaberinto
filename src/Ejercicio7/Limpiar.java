/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import becker.robots.*;
public class Limpiar {
   
    private Robot jey;
    private City paris;
    private Thing ladrillo;
    
    public Limpiar(){
        this.paris = new City(12,12);
        this.jey = new Robot(paris,9,5,Direction.NORTH);
        int a=1;
        int b=1;
        int c=1;
        int v=1;
        while (c<5){
            this.ladrillo = new Thing (this.paris,c ,1);
            this.ladrillo = new Thing (this.paris,c ,2);
            this.ladrillo = new Thing (this.paris,c ,3);
            this.ladrillo = new Thing (this.paris,c ,4);
            this.ladrillo = new Thing (this.paris,c ,9);
            this.ladrillo = new Thing (this.paris,c ,6);
            this.ladrillo = new Thing (this.paris,c ,7);
            this.ladrillo = new Thing (this.paris,c ,8);
            c++;
        }
        while (v<5){
            this.ladrillo = new Thing (this.paris,v+5,1);
            this.ladrillo = new Thing (this.paris,v+5,2);
            this.ladrillo = new Thing (this.paris,v+5,3);
            this.ladrillo = new Thing (this.paris,v+5,4);
            this.ladrillo = new Thing (this.paris,v+5,6);
            this.ladrillo = new Thing (this.paris,v+5,7);
            this.ladrillo = new Thing (this.paris,v+5,8);
            this.ladrillo = new Thing (this.paris,v+5,9);
            v++;
        }
        
        while (a<5){
            Wall muro = new Wall(this.paris,6,a,Direction.NORTH);     
            Wall muro2 = new Wall(this.paris,(a+5),1,Direction.WEST); 
             
            Wall muro5 = new Wall(this.paris,6,a+5,Direction.NORTH);  
            Wall muro7 = new Wall(this.paris,(a+5),9,Direction.EAST);
            Wall muro8 = new Wall(this.paris,1,a,Direction.NORTH);     
            Wall muro9 = new Wall(this.paris,(a),1,Direction.WEST); 
            
            Wall muro12= new Wall(this.paris,1,a+5,Direction.NORTH);  
            Wall muro13= new Wall(this.paris,(a),9,Direction.EAST);
            Wall muro1 = new Wall(this.paris,9,a,Direction.SOUTH);
            Wall muro6 = new Wall(this.paris,9,a+5,Direction.SOUTH);
            Wall muro14 = new Wall(this.paris,4,a,Direction.SOUTH);
            Wall muro15 = new Wall(this.paris,4,a+5,Direction.SOUTH);
            a++;
            }
        while (b<4){
            Wall muro3 = new Wall(this.paris,(b+5),4,Direction.EAST); 
            Wall muro4 = new Wall(this.paris,(b+5),6,Direction.WEST);
            Wall muro10 = new Wall(this.paris,(b+1),4,Direction.EAST); 
            Wall muro11= new Wall(this.paris,(b+1),6,Direction.WEST); 
            b++;
        }
        b=1;
        Wall muro19 = new Wall(this.paris,5,1,Direction.WEST);
        Wall muro20 = new Wall(this.paris,5,9,Direction.EAST);
        Wall muro21 = new Wall(this.paris,1,5,Direction.NORTH);
        Wall muro22 = new Wall(this.paris,9,5,Direction.SOUTH);
    }
    public void rig(){
        jey.turnLeft();
        jey.turnLeft();
        jey.turnLeft();
    }
    public void lim(){
        boolean frontIsClean;
        int a =0;
        while (a<25){ 
          int b=0;
          while(b<2){  
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            rig();  
            if (jey.frontIsClear())
                jey.move();
            if (jey.canPickThing()){
                    jey.pickThing();}   
            rig();   
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            jey.turnLeft();
            if (jey.frontIsClear())
                jey.move();
            if (jey.canPickThing()){
                    jey.pickThing();}
            jey.turnLeft();
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            b++;
           }
          rig();
          while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
          a++;
        }
        rig();
        rig();
        jey.move();
        jey.move();
        jey.move();
        jey.move();
        jey.turnLeft();
        while (jey.frontIsClear()){
                jey.move();
        }
        rig();
        rig();
        a =0;
        while (a<25){ 
          int b=0;
          while(b<2){  
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            jey.turnLeft();
            if (jey.frontIsClear())
                jey.move();
            if (jey.canPickThing()){
                    jey.pickThing();}   
            jey.turnLeft();   
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            rig();
            if (jey.frontIsClear())
                jey.move();
            if (jey.canPickThing()){
                    jey.pickThing();}
            rig();
            while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
            b++;
           }
          jey.turnLeft();
          while (jey.frontIsClear()){
                jey.move();
                if (jey.canPickThing()){
                    jey.pickThing();}
                }
          a++;
        }
    }
}