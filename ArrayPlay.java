//Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020




import java.util.*;


public class ArrayPlay{
    public static final int MAX = 999;  
    private ArrayPlay(){
        super();
    
    }

    public static void fillRandom(int[] arr){ 
        Random rand = new Random();
     
        int len = arr.length;
        for (int i = 0; i < len; i++){
            int num = rand.nextInt(MAX) +1;
            arr[i] = num;
        }
        
    }

    public static void printArray(int[] arr){
      System.out.println(Arrays.toString(arr));
    }

    private static int findIndexOfSmallest(int[] arr, int start, int end){
     
        int len = arr.length;
        int min = start;

        for (int j = start + 1; j < len; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }

        return min;

    }  
     
    public static void sort(int arr[]) {
        int len = arr.length -1;

        for (int i = 0; i < len; i++) {
       
            int minIndex = findIndexOfSmallest(arr, i, len);

            int element =arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = element;
        }
    }
    
}





