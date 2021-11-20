import java.util.Scanner;

import becker.robots.*;


public class TestGardenBot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sideLength = sc.nextInt();
        City c = new City();
        GardenBot g = new GardenBot(c, 0, 0, Direction.EAST, 999);
        g.plantTriangle(sideLength);
    }
}