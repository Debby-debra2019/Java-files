//comp 1731
//assignment 1
//Deborah Aguer
//07-02-2020



import becker.robots.*;

public class TestSpiderBot
{

public static void main(String[] args)
{
    City paris = new City();
    
    SpiderBot spider = new SpiderBot(paris, 5, 0, Direction.EAST);
    new Wall(paris, 1, 1, Direction.NORTH);
    new Wall(paris, 1, 1, Direction.WEST);
    new Wall(paris, 2, 1, Direction.WEST);
    new Wall(paris, 3, 1, Direction.WEST);
    new Wall(paris, 4, 1, Direction.WEST);
    new Wall(paris, 5, 1, Direction.WEST);
    new Wall(paris, 1, 1, Direction.EAST);
    new Wall(paris, 2, 1, Direction.EAST);
    new Wall(paris, 3, 1, Direction.EAST);
    new Wall(paris, 4, 1, Direction.EAST);
    new Wall(paris, 5, 1, Direction.EAST);
    new Wall(paris, 1, 3, Direction.NORTH);
    new Wall(paris, 1, 3, Direction.WEST);
    new Wall(paris, 2, 3, Direction.WEST);
    new Wall(paris, 3, 3, Direction.WEST);
    new Wall(paris, 4, 3, Direction.WEST);
    new Wall(paris, 5, 3, Direction.WEST);
    new Wall(paris, 1, 3, Direction.EAST);
    new Wall(paris, 2, 3, Direction.EAST);
    new Wall(paris, 3, 3, Direction.EAST);
    new Wall(paris, 4, 3, Direction.EAST);
    new Wall(paris, 5, 3, Direction.EAST);
    new Wall(paris, 1, 5, Direction.NORTH);
    new Wall(paris, 1, 5, Direction.WEST);
    new Wall(paris, 2, 5, Direction.WEST);
    new Wall(paris, 3, 5, Direction.WEST);
    new Wall(paris, 4, 5, Direction.WEST);
    new Wall(paris, 5, 5, Direction.WEST);
    new Wall(paris, 1, 5, Direction.EAST);
    new Wall(paris, 2, 5, Direction.EAST);
    new Wall(paris, 3, 5, Direction.EAST);
    new Wall(paris, 4, 5, Direction.EAST);
    new Wall(paris, 5, 5, Direction.EAST);



    spider.CrawlWalls(3);

    


    

    
    
}

}