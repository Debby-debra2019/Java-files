//comp 1731
//assignment 1 number 2
//Deborah Aguer
// 09 - 02- 2020

import becker.robots.*;

import java.util.*;

public class RandomBot extends RobotSE

{
    public RandomBot(City city, int ave, int str, Direction dir)
    {
        super(city, ave, str, dir);
    }
    public void moveRandom(){
        Random r = new Random();
        
        int num = r.nextInt(4);
        
        if (num == 0)
        {
            this.move();
            this.move();
        }
        else if (num == 1){
            this.turnLeft();
            this.move();
        }
        else if (num == 2)
        {
            this.turnLeft();
            this.turnLeft();
            this.turnLeft();
            this.move();

        }
        else if (num == 3)
        {
            this.turnLeft();
            this.turnLeft();
            this.turnLeft();
            this.turnLeft();
            this.move();
            this.move();  
        }


    }
}