import becker.robots.*;

public class GardenBot extends RobotSE{
    public GardenBot(City city, int str, int ave, Direction dir, int numThings){
        super(city, str, ave, dir, numThings);
    }
    public void oneRow(int sideLength){
        int numThings = sideLength;
        int i = sideLength;
        //while (i != 0){
            
            
            while (i > 0){
                //this.move();
                this.putThing();
                this.move();
                i--;
            }
            this.turnLeft();
            this.turnLeft();
            this.move(sideLength);
            this.turnLeft();
            this.move();
            this.turnLeft();
            
    
        //
    }
    public void plantTriangle(int sideLength){
        int x = sideLength;
        //int num = sideLength;
        while (x>0){
            oneRow(x);
            x--;
        }
    }

































    }
        
        
    
