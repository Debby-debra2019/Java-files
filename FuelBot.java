//Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020





import becker.robots.*;

 public class FuelBot extends RobotRC{
    private int fuelLevel;

    public FuelBot(City city, int str, int ave, Direction dir, int initialFuel){
         super(city, str, ave, dir, fuel);
         setFuelLevel(initialFuel);
         setLabel("" + fuelLevel); // or setLebel(Integer.toSring(initialFuel))
    }
    public void setFuelLevel(int fuel){
        if ( fuel < 0){
            fuelLevel = 0;
        }
        fuelLevel = fuel;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
    public void move(){
        if ( fuelLevel >= 2 ){
            super.move();
            fuelLevel = fuelLevel - 2;
	    setLebel(Integer.toSring(fuelLevel))
            
            
        }
        else{
            breakRobot("You did not have enough fuel to move");
        }
    }
    
    
}

 