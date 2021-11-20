//comp 1731
//assignment 1
//Deborah Aguer
//07-02-2020



import becker.robots.*;

public class SpiderBot extends RobotSE

{
    public SpiderBot(City city, int ave, int str, Direction dir)
    {
        super(city, ave, str, dir);
    } 
    public void CrawlOneBuilding()
    {
        this.turnLeft();
        this.move();
        this.move();
        this.move();
        this.move();
        this.move();
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
        this.move();
        this.move();
        this.turnLeft();
        this.turnLeft();
        this.turnLeft();
        this.move();
        this.move();
        this.move();
        this.move();
        this.move();
        this.turnLeft();
    }

        public void CrawlWalls(int times){
        
        
          int i = 0;

          while (i < times)
          {
          CrawlOneBuilding();
          i++;
          }


        }
}
    

