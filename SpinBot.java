import becker.robots.*;

public class SpinBot extends RobotSE{
    public SpinBot(City city, int str, int ave, Direction dir){
        super(city, str, ave, dir);
    }
    public void spin(int numTurn){
        int x = numTurn;
        for (int i = 1; i <= x; i++){
            //if (i>0){
                this.turnLeft();
            }
            //else if (i<0){
            
                //this.turnRight();
            //}
            //else{

            //}           
            //}
        for (int i = -1; i >= x; i--){
            //if (i<0){
                this.turnRight();
            //}
        }
    }
}