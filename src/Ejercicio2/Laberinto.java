package Ejercicio2;


import becker.robots.*;
public class Laberinto {
   
    private Robot cami;
    private City paris;
    private Thing pelota;
    
    public Laberinto(){
        this.paris = new City(9,11);
        this.cami = new Robot(paris,6,2,Direction.NORTH);
        
        //CUARTO 1
         this.pelota = new Thing(this.paris,3,1);
        this.pelota = new Thing(this.paris,2,3);
        this.pelota = new Thing(this.paris,2,1);
        this.pelota = new Thing(this.paris,1,1);
        this.pelota = new Thing(this.paris,1,3);
        this.pelota = new Thing(this.paris,5,3);
        this.pelota = new Thing(this.paris,3,3);
        this.pelota = new Thing(this.paris,4,3);
        this.pelota = new Thing(this.paris,5,1);
        this.pelota = new Thing(this.paris,4,1);
        this.pelota = new Thing(this.paris,5,2);
        this.pelota = new Thing(this.paris,1,2);
        //CUARTO 2
        this.pelota = new Thing(this.paris,1,4);
        this.pelota = new Thing(this.paris,1,5);
        this.pelota = new Thing(this.paris,1,6); 
        this.pelota = new Thing(this.paris,2,4);      
        this.pelota = new Thing(this.paris,3,4);
        this.pelota = new Thing(this.paris,3,5);            
         this.pelota = new Thing(this.paris,3,6);
         this.pelota = new Thing(this.paris,4,6);
         this.pelota = new Thing(this.paris,5,6);
         this.pelota = new Thing(this.paris,5,4);
         this.pelota = new Thing(this.paris,5,5);
        //CUARTO 3
         this.pelota = new Thing(this.paris,1,7); 
         this.pelota = new Thing(this.paris,1,8);
         this.pelota = new Thing(this.paris,1,9);
         this.pelota = new Thing(this.paris,2,7);
         this.pelota = new Thing(this.paris,3,7);
         this.pelota = new Thing(this.paris,4,7);
         this.pelota = new Thing(this.paris,3,9);
         this.pelota = new Thing(this.paris,4,9);
         this.pelota = new Thing(this.paris,5,9);
         this.pelota = new Thing(this.paris,2,9);
         this.pelota = new Thing(this.paris,5,7);
         this.pelota = new Thing(this.paris,5,8);
         
         
                
        //escenario
        int a=1;
        while (a<10){
            Wall muro = new Wall(this.paris,1,a,Direction.NORTH);   
        a++;
        }     
        int b=1;
        while (b<6){
            Wall muro1 = new Wall(this.paris,b,1,Direction.WEST);   
            Wall muro2 = new Wall(this.paris,b,4,Direction.WEST);   
            Wall muro3 = new Wall(this.paris,b,7,Direction.WEST);   
            Wall muro4 = new Wall(paris,b,9,Direction.EAST);  
            b++;
        }
            Wall pared1 = new Wall(this.paris,5,1,Direction.SOUTH);   
            Wall pared2 = new Wall(this.paris,5,3,Direction.SOUTH);   
            Wall pared3 = new Wall(this.paris,5,4,Direction.SOUTH);   
            Wall pared4 = new Wall(this.paris,5,6,Direction.SOUTH);   
            Wall pared5 = new Wall(this.paris,5,7,Direction.SOUTH);   
            Wall pared6 = new Wall(this.paris,5,9,Direction.SOUTH);                
   }
 
    //Proceso de escanear
        public void scanear(){
   
            //RECORRIDO 1
    this.cami.move();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        int a = 0;
        while (a < 3 ){
        this.cami.turnLeft();
        a++;
        }
        this.cami.move();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        this.cami.turnLeft();
        this.cami.move();
        this.cami.move();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
        }
        this.cami.move();
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
        }
        this.cami.turnLeft();
        int c = 0;
         while (c < 2 ){
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        c++;
        }
       
        this.cami.turnLeft();
        int d = 0;
        while (d < 2 ){
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        d++;
        }
        this.cami.move ();
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        this.cami.turnLeft ();
        this.cami.move();
        this.cami.turnLeft();
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
         this.cami.move ();
         int f = 0;
        while (f < 2 ){
        this.cami.move ();
        if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
        f++;
        }
         int g = 0;
        while (g < 2 ){
        this.cami.turnLeft();
        g++;
        }
        
       this.cami.countThingsInBackpack();
       int x = this.cami.countThingsInBackpack();
       this.cami.turnLeft();
        this.cami.move();
        int h = 0;
        while (h < 3 ){
        this.cami.turnLeft();
        h++;
        }
       
       //CASOS
        //CASO 1
        if (x==3){
           System.out.print("1");
        int B=0;
           while (B < 4 ){
        this.cami.move();
        B++;
         }
        int C=0;
           while (C < 3 ){
        this.cami.turnLeft();
        C++;
         }
         this.cami.move();
         this.cami.turnLeft();
         }
        
        //CASO 4
        if (x==6){
           System.out.print("4");
          int F=0;
           while (F < 4 ){
        this.cami.move();
        F++;
         }
           int G=0;
           while (G < 3 ){
        this.cami.turnLeft();
        G++;
         }
           this.cami.move();
           this.cami.turnLeft();
       }
        //CASO 7
        if (x==5){
           System.out.print("7");
           int I=0;
           while (I < 4 ){
        this.cami.move();
        I++;
         }
        int J=0;
           while (J < 3 ){
        this.cami.turnLeft();
        J++;
         }
         this.cami.move();
         this.cami.turnLeft();               
       }
       
       //CASOS 2,3
       
       if (x==8){
           int l=0;
           while (l < 3 ){
        this.cami.move();
        l++;
        }
           if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
           this.cami.countThingsInBackpack();
       int u = this.cami.countThingsInBackpack();
        if (u==8){
            System.out.print("2");
        }
        if(u==9){
           
           System.out.print("3");
           } 
        this.cami.move();
        int E=0;
           while (E < 3 ){
        this.cami.turnLeft();
        E++;
        }
        this.cami.move();
        this.cami.turnLeft();       
         }
        
       
       //CASOS 0,5,6,9,8
       
       if (x==9){
           this.cami.move ();
           if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
       this.cami.countThingsInBackpack();
       int y = this.cami.countThingsInBackpack();
      
       
       //Caso 5 y 6
       if (y==9){
           this.cami.move();
           int i = 0;
        while (i < 3 ){
        this.cami.turnLeft();
        i++;
        }
           this.cami.move();
           this.cami.move();
           this.cami.turnLeft();
           this.cami.move ();
       
       if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
       this.cami.countThingsInBackpack();
       int w = this.cami.countThingsInBackpack();
       if (w>x){
           System.out.print("6");
       }
        if (w==x){
           System.out.print("5");
           } 
        this.cami.move ();
        this.cami.turnLeft ();
        this.cami.move ();
        int H = 0;
        while (H < 3 ){
        this.cami.turnLeft();
        H++;
        }
         }
        
       
      //Casos 9, 0,8 
         if (y==10){
           this.cami.move();
           int i = 0;
        while (i < 3 ){
        this.cami.turnLeft();
        i++;
        }
           this.cami.move();
           this.cami.move();
           this.cami.turnLeft();
           this.cami.move ();
       
       if(this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
       this.cami.countThingsInBackpack();
       
       int v = this.cami.countThingsInBackpack();
       
        if (v==y){
           System.out.print("9"); 
           this.cami.move();       
          this.cami.turnLeft();
          this.cami.move ();
          int N = 0;
        while (N < 3 ){
        this.cami.turnLeft();
        N++;
        }
       
       }
        if (v>y){
           this.cami.turnLeft();
           this.cami.turnLeft();
           this.cami.move ();
           int n = 0;
        while (n < 3 ){
        this.cami.turnLeft();
        n++;
        }
        this.cami.move();
        if (this.cami.canPickThing()){
            this.cami.pickThing();                                      
            }
       this.cami.countThingsInBackpack();
       int ñ = this.cami.countThingsInBackpack();
        if (v==ñ){
           System.out.print("0");      
       }
        if (ñ>v){
           System.out.print("8");
       }
        int q = 0;
        while (q < 3 ){
        this.cami.turnLeft();
        q++;
        }
        int Q = 0;
        while (Q < 2 ){
        this.cami.move();
        Q++;
        }
       }
        }
         } 
       
       
        this.cami.move();
        this.cami.turnLeft();
        int A = 0;
        while (A < 3 ){
        this.cami.move();
        A++;
        }
        this.cami.turnLeft();
        while (this.cami.countThingsInBackpack() >0  ){
        this.cami.putThing();  
        }
       }
        
       } 
        
        
        
             
                
            
       
     

         
    