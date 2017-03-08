package Ejercicio5_2;


import becker.robots.*;
public class MoverLadrillos {
   
    private Robot jey;
    private City paris;
    private Thing ladrillo;
    
    public MoverLadrillos(){
        this.paris = new City(15,15);
        this.jey = new Robot(paris,9,1,Direction.NORTH);
        this.ladrillo = new Thing (this.paris,7 ,1);
        this.ladrillo = new Thing (this.paris,5 ,1);
        this.ladrillo = new Thing (this.paris,4 ,2);
        this.ladrillo = new Thing (this.paris,8 ,2);
        this.ladrillo = new Thing (this.paris,4 ,4);
        this.ladrillo = new Thing (this.paris,8 ,4);
        this.ladrillo = new Thing (this.paris,5 ,5);
        this.ladrillo = new Thing (this.paris,7 ,5);
        int a=1;
        int b=2;
        while (a<6){
            Wall muro = new Wall(this.paris,4,a,Direction.NORTH);     
            Wall muro2 = new Wall(this.paris,(a+3),1,Direction.WEST);  
            Wall muro3 = new Wall(this.paris,a+3,5,Direction.EAST);  
            a++;
            }
        while (b<6){
            Wall muro1 = new Wall(this.paris,8,b,Direction.SOUTH);
            b++;
        }
        a=1;
        b=2;
        while (a<6){
            Wall muro = new Wall(this.paris,1,a+6,Direction.NORTH);   
            Wall muro2 = new Wall(this.paris,a,7,Direction.WEST);  
            Wall muro3 = new Wall(this.paris,a,11,Direction.EAST);  
            a++;
            }
        while (b<6){
            Wall muro1 = new Wall(this.paris,5,b+6,Direction.SOUTH);
            b++;
        }
        jey.move();
        }
    public void turnr(){
        jey.turnLeft();
        jey.turnLeft();
        jey.turnLeft();
    }
    public void turnrigth(){
        jey.turnLeft();
        jey.turnLeft();
        jey.turnLeft();
        jey.move();
        if (jey.canPickThing()){
            jey.pickThing();
        }
        jey.turnLeft();
        jey.turnLeft();
        jey.turnLeft(); 
    }
    public void turnl(){
        jey.turnLeft();
    }
    public void turnleft(){
        jey.turnLeft();
        jey.move();
        if (jey.canPickThing()){
            jey.pickThing();
        }
        jey.turnLeft(); 
    }
    public void gto(){
        jey.move();
        jey.turnLeft();
        for(int v=0; v<6; v++){
            jey.move();
        }
        jey.turnLeft();
        for(int v=0; v<4; v++){
            jey.move();
        }
    }
    public void avance(){
        int i=0;
        while (i<4){  
               if (jey.canPickThing()){
                    jey.pickThing();}
               jey.move();
               if (jey.canPickThing()){
                    jey.pickThing();}
               i=i+1;
        }      
    }
    public void m(){
        jey.move();
    }
    public void avance1(){
        int i=0;
        jey.move();
        jey.putThing();
        jey.move();
        jey.move();
        jey.putThing();
        jey.move();
        turnr();
    }
    public void avance2(){
        int i=0;
        jey.putThing(); 
        while(i<4){
            jey.move();
            i++;
        }
        jey.putThing();      
    }
    public void av(){
        jey.turnLeft();
        jey.move();
        jey.move();
        jey.move();
        jey.turnLeft();
    }
    public void fn(){
        int c=0;       
        jey.turnLeft();
        jey.move();
    
        
       } 
}