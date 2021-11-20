//Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020




import becker.robots.*;
import java.util.Scanner;

public class TestAlienBot{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        City y = new City();
        AlienBot b = new AlienBot(y, 13, 4, Direction.EAST, num*num);
        AlienBot c = new AlienBot(y, 0, 0, Direction.EAST, n*n);
        //Scanner d = new Scanner(System.in);
        
        


        if ( num % 2 == 0);{
            b.makeSquare(num);
        }
        c.makeCircle(n);
    
        

        

        
    }    
}