 //Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020




import becker.robots.*;

public class AlienBot extends RobotSE{
    //private int str = (num-1)/2;;
    //public int ave = (num-1)/2;;
    //public int r = (num-1)/2;
    
    public AlienBot(City city, int str, int ave, Direction dir, int numThings){
        super(city, str, ave, dir, numThings);
    }
    public void oneRow(int val){
         int x = 0;
         while ( x != val){
             this.putThing();
             this.move();
             x++;
         }
         this.turnRight();
         this.turnRight();
         this.move(val);
         this.turnLeft();
         this.move();
         this.turnLeft();
    }
    public void makeSquare(int num){
        
        int copy = num;
        while ( copy > 0){
            oneRow(num);
            copy--;
        }
     
    }
    public void oneRow(int num, int str , int ave){
            
        int copy = num;
        int r =(num-1)/2; 
        while ( copy > 0){
            int currentStr = getStreet();
            int currentAve = getAvenue();
            int mag = (currentStr - str)*(currentStr - str) + (currentAve - ave)*(currentAve -ave);
            double r2 = Math.sqrt(mag);
            //System.out.println(r);
            //System.out.println(r2);
            //System.out.println(mag);
            //this.move();
            if (r2 <= r) {
                this.putThing();
                //this.move();
            }
            this.move();
            copy--;
        }    
        //this.move();
        this.turnRight();
        this.turnRight();
        this.move(num);
        this.turnLeft(); 
        this.move();
        this.turnLeft();
            
    }
        
    public void makeCircle(int num ){
        if (num % 2 == 0 || num <= 0 ){
            
            return;
        }
        int currentStr = getStreet();
        int currentAve = getAvenue();
        int r = (num-1)/2;
        int centreStr = r + currentStr;
        int centreAve = r + currentAve;
        int copy = num;

        while ( copy > 0){
            oneRow(num, centreStr, centreAve);
            copy--;
        }


        
     
        
        
        
         
        
    }

     

    }
