//Deborah Aguer
//comp 1731
//assignment 2
//18/03/2020





public class TestArrayPlay{
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[15];
        int[] arr3 = new int[4];
        int[] arr4 = new int[3];
        int[] arr5 = new int[7];
        int[] arr6 ={76, 54, 17, 4, 1, 9, 10};

        ArrayPlay.fillRandom(arr1);
        ArrayPlay.printArray(arr1);
        ArrayPlay.sort(arr1);
        ArrayPlay.printArray(arr1);

        ArrayPlay.fillRandom(arr2); 
        ArrayPlay.printArray(arr2);
        ArrayPlay.sort(arr2);
        ArrayPlay.printArray(arr2);

        ArrayPlay.fillRandom(arr3);
        ArrayPlay.printArray(arr3);
        ArrayPlay.sort(arr3);
        ArrayPlay.printArray(arr3);

        ArrayPlay.fillRandom(arr4);
        ArrayPlay.printArray(arr4);
        ArrayPlay.sort(arr4);
        ArrayPlay.printArray(arr4);

        ArrayPlay.fillRandom(arr5);
        ArrayPlay.printArray(arr5);
        ArrayPlay.sort(arr5);
        ArrayPlay.printArray(arr5); 

        ArrayPlay.fillRandom(arr6);
        ArrayPlay.printArray(arr6);
        ArrayPlay.sort(arr6);
        ArrayPlay.printArray(arr6);
    
   }

}
        
        