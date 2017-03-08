/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Hello {
    private Robot escritor1;
    private Robot escritor2;
    private Robot escritor3;
    private Robot escritor4;
    private Robot escritor5;
    private City libro;
    private Thing lapiz;
    
public Hello(){
    this.libro = new City(7, 22);
    this.escritor1 = new Robot(libro,1, 1, Direction.SOUTH, 11);
    this.escritor2 = new Robot(libro,1, 7, Direction.WEST, 12);
    this.escritor3 = new Robot(libro,0, 9, Direction.SOUTH, 7);
    this.escritor4 = new Robot(libro,0, 13,Direction.SOUTH, 7);
    this.escritor5 = new Robot(libro,5, 19,Direction.NORTH, 13);
}
public void H(){int s =0, r=0, t=0, q=0;
     while(s<5){
     this.escritor1.putThing();
     this.escritor1.move();
     s++;  
     }
     this.escritor1.turnLeft();
     this.escritor1.move();
     this.escritor1.move();
     this.escritor1.turnLeft();
     while(r<5){
     this.escritor1.move();
     this.escritor1.putThing();
     r++;
     }
     while(q<2){
     this.escritor1.turnLeft();
     this.escritor1.move();
     q++;
     }
     this.escritor1.move();
     this.escritor1.putThing();
     while(t<3){
     this.escritor1.move();
     t++;
     }
    }
public void E(){
    int x=0, y=0, z=0, w=0, v=0;
    this.escritor2.putThing();
    while(x<2){
        this.escritor2.move();
        this.escritor2.putThing();
        x++;
    }
    this.escritor2.turnLeft();
    while(y<4){
        this.escritor2.move();
        this.escritor2.putThing();
        y++;
    }
    this.escritor2.turnLeft();
    this.escritor2.putThing();
    while(z<2){
        this.escritor2.move();
        this.escritor2.putThing();
        z++;
    }
    this.escritor2.turnLeft();
    this.escritor2.move();
    while(v<2){
    this.escritor2.move();
    this.escritor2.putThing();
    this.escritor2.turnLeft();
    v++;
    }
    while(w<3){
        this.escritor2.move();
        w++;
    }
}
public void L(){
    int a=0, b=0, c=0;
    while(a<5){
    this.escritor3.move(); 
    this.escritor3.putThing();
    a++;
    }
    this.escritor3.turnLeft();
    while(b<2){
    this.escritor3.move();
    this.escritor3.putThing();
    b++;
    }
    while(c<3){
    this.escritor3.turnLeft();
    c++;
    }
    this.escritor3.move();
    }
public void L2(){
    int a=0, b=0, c=0;
    while(a<5){
    this.escritor4.move(); 
    this.escritor4.putThing();
    a++;
    }
    this.escritor4.turnLeft();
    while(b<2){
    this.escritor4.move();
    this.escritor4.putThing();
    b++;
    }
    while(c<3){
    this.escritor4.turnLeft();
    c++;
    }
    this.escritor4.move();
    }
public void O(){
    int a=0, b=0, c=0, d=0;
    while(a<4){
        this.escritor5.putThing();
        this.escritor5.move();
        a++;
    }
    this.escritor5.putThing();
    this.escritor5.turnLeft();
    while(b<2){
       this.escritor5.move(); 
       this.escritor5.putThing();
       b++;
    }
    this.escritor5.turnLeft();
    while(c<4){
        this.escritor5.putThing();
        this.escritor5.move();
        c++;
    }
    this.escritor5.putThing();
    this.escritor5.turnLeft();
    this.escritor5.move();
    this.escritor5.putThing();
    while(d<3){
    this.escritor5.turnLeft();
    d++;
    }
    this.escritor5.move();
    
}    }