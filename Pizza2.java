import java.util.*;

public class Pizza2{
   public isEven(int N){
        if (N%2 == 0){
            System.out.println(N + " " + "is even");
        }
        else{} 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float R = sc.nextFloat();

        float C = sc.nextFloat();
        float A = ((R - C)*(R - C)/(R*R))*100;
        System.out.println(A);
        
        
    }
}
