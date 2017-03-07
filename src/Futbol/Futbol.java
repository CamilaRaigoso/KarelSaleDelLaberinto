

 package Futbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Futbol {
    
   private Robot cami;
   private City paris;
   private Thing balon;
   
   
   public Futbol(){
       this.paris = new City(10, 10);
       this.balon = new Thing (this.paris,9 ,9);
       this.cami = new Robot(paris, 9, 9, Direction.WEST);
     
   }
    public void adelante(){
       this.cami.pickThing();
       this.cami.move();
       this.cami.move();
       this.cami.putThing();
       this.cami.pickThing();
    }
    
    public void izquierda(){       
        this.cami.turnLeft();
        this.cami.move();
        this.cami.putThing();
        this.cami.pickThing();
        int b = 0;
        while (b < 3 ){
        this.cami.turnLeft();
        b++;
        }
        this.cami.move();
        this.cami.move();
        this.cami.putThing();
        this.cami.pickThing();
    }
  
    public void derecha(){ 
        int a = 0;
        while (a < 3 ){
        this.cami.turnLeft();
        a++;
        }
        this.cami.move();
        this.cami.putThing();
        this.cami.pickThing();
        this.cami.turnLeft();
        this.cami.move();
        this.cami.move();
        this.cami.putThing();
        this.cami.pickThing();
        }
       
    }
