//4(b) quick sort

class QuickSort{
      
//A helper method to swap two elements
static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
  
//this is the partition class and the last element is the pivot
static int partition(int[] arr, int low, int high)
{
      
    int pivot = arr[high]; 
    int i = (low - 1); 
  
    for(int j = low; j <= high - 1; j++)
    {
          
        // If current element is smaller 
        // than the pivot
        if (arr[j] < pivot) 
        {
              
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
  
//this function performs quicksort
static void quickSort(int[] arr, int low, int high)
{
    if (low < high) 
    {
          
        // pi is partitioning index, arr[p]
        int pi = partition(arr, low, high);
  
        
        //sort the elements separately before and after partitioning
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
  
// Function to print an array 
static void printArray(int[] arr, int size)
{
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
          
    System.out.println();
}
  
public static void main(String[] args)
{
    int[] arr = {3,1,4,1,5,9,2,6,5,3,5};
    int n = arr.length;
      
    quickSort(arr, 0, n - 1);
    System.out.println("This is the sorted array: ");
    printArray(arr, n);
}
}