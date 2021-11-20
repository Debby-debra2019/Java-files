import java.util.Scanner;

import becker.robots.*;

public class TestSpinBot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numTurn = sc.nextInt();
        
        
        City ay = new City();
        SpinBot s = new SpinBot(ay, 4, 5, Direction.NORTH);
        s.spin(numTurn);
        
        
    }
}