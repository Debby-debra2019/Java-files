import becker.robots.*;

public class GoAroundRoadBlock
{
    public static void main(String[] arg)
    {
        City ny = new City();
        Wall blockAve0 = new Wall(ny, 0, 2, Direction.WEST);
        Wall blockAve1 = new Wall(ny, 1, 2, Direction.WEST);
        Robot mark     = new Robot(ny, o, 2, Direction.WEST);
        Robot ann      = new Robot(ny, 0, 1, Direction.EAST);

        mark.turnLeft();
        mark.move();
        mark.move();
        mark.turnLeft();
        mark.turnLeft();
        mark.turnLeft();
        mark.move();

        ann.turnLeft();
        ann.turnLeft();
        ann.turnLeft();
        ann.move();
        ann.move();
        ann.turnLeft();


    }
}