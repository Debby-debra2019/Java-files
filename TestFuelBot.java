//Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020

 
 
 
 
 import becker.robots.*;
//import java.util.Scanner;


public class TestFuelBot{
    public static void main(String[] args){

        //Scanner sc = new Scanner(System.in);
        //int fuelLevel = sc.nextInt();
        City nairobi = new City(15, 15);
        FuelBot f = new FuelBot(nairobi, 3, 5, Direction.EAST, 14);
        f.move() ;


        
    }
}