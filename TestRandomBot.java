//comp 1731
//assignment 1 number 2
//Deborah Aguer
// 09-02-2020




import becker.robots.*;

public class TestRandomBot
{
    public static void main(String[] args)
    {
        City york = new City();
        RandomBot rob = new RandomBot(york, 10, 5, Direction.EAST);
        int i = 0;
        while (i < 101)
        {
            rob.moveRandom();
            i++;
        }  
    }
}


