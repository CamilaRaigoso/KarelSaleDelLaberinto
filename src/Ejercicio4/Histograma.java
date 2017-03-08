

 package Ejercicio4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Histograma {
    
   private Robot cami;
   private City paris;
   private Thing balon;
   
   
   public Histograma(){
       this.paris = new City(10, 10);
       this.balon = new Thing (this.paris,1 ,1);
       this.balon = new Thing (this.paris,1 ,1);
       this.balon = new Thing (this.paris,1 ,1);
       this.balon = new Thing (this.paris,2 ,1);
       this.balon = new Thing (this.paris,2 ,1);
       this.balon = new Thing (this.paris,3 ,1);
       this.balon = new Thing (this.paris,3 ,1);
       this.balon = new Thing (this.paris,3 ,1);
       this.balon = new Thing (this.paris,3 ,1);
       this.balon = new Thing (this.paris,3 ,1);
       this.balon = new Thing (this.paris,4 ,1);
       this.balon = new Thing (this.paris,4 ,1);
       this.balon = new Thing (this.paris,4 ,1);
       this.balon = new Thing (this.paris,4 ,1);

       this.cami = new Robot(paris, 1, 1, Direction.EAST);
     
   }
    public void escanear(){
       while (this.cami.canPickThing()){
           while (this.cami.canPickThing ()){
            this.cami.pickThing();
             }
        this.cami.countThingsInBackpack();
        int x = this.cami.countThingsInBackpack();
        System.out.println(this.cami.countThingsInBackpack());
        while (x>0){
            this.cami.putThing();
            this.cami.move();
            this.cami.countThingsInBackpack();
            System.out.println(this.cami.countThingsInBackpack());
            int y = this.cami.countThingsInBackpack();
            if (y==0){
        this.cami.turnLeft();
        this.cami.turnLeft();
        while (x>0){
            this.cami.move();
            x--;
        }
        this.cami.turnLeft();
        this.cami.move();
        this.cami.turnLeft();
        
            }
        
        }
        }
        }
    }
    
    
    
    
       
    
