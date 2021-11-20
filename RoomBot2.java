import becker.robots.*;

public class RoomBot2 extends TurnBot {
    public RoomBot2(City theCity, int street, int avenue, Direction dir){
        super( theCity,  street,  avenue,  dir);
    }

    public int findWidth(){
        int count = 1;
        Direction start_facing = getDirection();
        while(!isFacingEast()){
            turnLeft();
        }

        while(frontIsClear()){
            move();
            count++;
        
            
            
        }
        face(start_facing);
             
        return count;
        
             
    
        
    }
    public int findHeight(){
        int count = 1;
        Direction start_facing = getDirection();
        while(!isFacingSouth()){
            turnLeft();
        }

        while(frontIsClear()){
            move();
            count++;
        //face(start_facing);
            
            
        }
        face(start_facing);
             
        return count;
        
             
    
    }
    public int findArea(){
        int w = findWidth();
        int h = findHeight();
        int area = h * w;
        return area;
    }
}