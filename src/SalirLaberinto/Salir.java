package Ejercicio5_1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Nuggets {
    private Robot Comelon;
    private City Nugg;
    private Thing Nugget;

public Nuggets(){
    this.Nugg = new City(12, 12);
    this.Comelon = new Robot(Nugg, 8,8, Direction.NORTH);
    this.Nugget = new Thing(this.Nugg, 4, 8);
    this.Nugget = new Thing(this.Nugg, 5, 6);
    this.Nugget = new Thing(this.Nugg, 7, 5);
    int a=4, b=5, c=7, d=3;
    while(a<8){
       Wall z = new Wall(Nugg, 3, a, Direction.NORTH);  
       a++;
    }
    while(b<7){
       Wall x = new Wall(Nugg, 4, b, Direction.NORTH);  
       b++;
    }    
     Wall yw = new Wall(Nugg, 5, 9, Direction.NORTH);
     Wall wq = new Wall(Nugg, 7, 9, Direction.SOUTH);
     Wall rt = new Wall(Nugg, 8, 8, Direction.SOUTH);
     while(c<9){
     Wall st = new Wall(Nugg, 7, c, Direction.NORTH);
     c++;
     }
     Wall ql = new Wall(Nugg, 4, 8, Direction.NORTH);
     Wall tl = new Wall(Nugg, 5, 7, Direction.NORTH);
     Wall ll = new Wall(Nugg, 6, 6, Direction.NORTH);
     Wall nl = new Wall(Nugg, 8, 8, Direction.SOUTH);
     Wall ml = new Wall(Nugg, 6, 8, Direction.NORTH);
     Wall mm = new Wall(Nugg, 7, 5, Direction.NORTH);
     Wall qq = new Wall(Nugg, 7, 3, Direction.NORTH);
     Wall rr = new Wall(Nugg, 5, 3, Direction.NORTH);
     Wall ww = new Wall(Nugg, 6, 2, Direction.NORTH);
     Wall h = new Wall(Nugg, 7, 2, Direction.SOUTH);
     Wall jhg = new Wall(Nugg, 7, 6, Direction.SOUTH);
     while(d<5){
         Wall gg = new Wall(Nugg, 8, d, Direction.SOUTH);
         d++;
     }
     int e=5, f=7, g=5, i=7, k=4, u=6, v=6, t=3;
     while(e<8){
         Wall ab = new Wall(Nugg, e ,9 ,Direction.EAST);
         e++;
     }
     while(f<9){
         Wall yi = new Wall(Nugg, f, 8, Direction.WEST);
         f++;
     }
     while(g<7){
         Wall yo = new Wall(Nugg, g, 5,Direction.EAST);
         g++;
     }
     while(i<9){
         Wall yu = new Wall(Nugg, i, 4,Direction.EAST);
         i++;
     }
     while(k<6){
         Wall re = new Wall(Nugg, k, 5, Direction.WEST);
         k++;
     }
     while(u<8){
         Wall rq = new Wall(Nugg, u, 2, Direction.WEST);
         u++;
     }
     while(v<8){
         Wall ft = new Wall(Nugg, v, 3, Direction.EAST);
         v++;
     }  
     while(t<5){
         Wall ftt = new Wall(Nugg, t, 4, Direction.WEST);
         t++;
     }  
     Wall za = new Wall(Nugg,4, 8, Direction.EAST);
     Wall zb = new Wall(Nugg, 8, 8,Direction.EAST);
     Wall zc = new Wall(Nugg, 3, 7,Direction.EAST);
     Wall zd = new Wall(Nugg, 4, 6,Direction.EAST); 
     Wall ze = new Wall(Nugg, 7, 6,Direction.EAST);
     Wall zf = new Wall(Nugg, 5, 8,Direction.WEST);
     Wall zg = new Wall(Nugg, 5, 3,Direction.WEST);
     Wall zh = new Wall(Nugg, 8, 3,Direction.WEST);
     Wall zi = new Wall(Nugg, 8, 5,Direction.EAST);
}

public void A(){
    int r=0;
    this.Comelon.move();
    while(r<3){
    this.Comelon.turnLeft();
    r++;
    }
    this.Comelon.move();
}
public void B(){
    this.Comelon.turnLeft();
    this.Comelon.move();
    this.Comelon.move();
    this.Comelon.turnLeft();
}
public void C(){
    this.Comelon.pickThing();
    this.Comelon.turnLeft();
    this.Comelon.turnLeft();
    this.Comelon.move();
    this.Comelon.turnLeft();
}
public void D(){
    int t=0;
    while(t<2){
    this.Comelon.turnLeft();
    t++;
    }
}
public void E(){
    this.Comelon.turnLeft();
    this.Comelon.turnLeft();
    this.Comelon.move();
    this.Comelon.turnLeft();
    this.Comelon.move();
    this.Comelon.pickThing();
    this.Comelon.turnLeft();
    this.Comelon.turnLeft();
   }
public void F(){
    int x=0;
    while(x<3){
    this.Comelon.turnLeft();
    x++;
    }
    this.Comelon.move();
    this.Comelon.turnLeft();
}
public void G(){
    this.Comelon.pickThing();
    this.Comelon.turnLeft();
    this.Comelon.move();
    this.Comelon.move();
}
}