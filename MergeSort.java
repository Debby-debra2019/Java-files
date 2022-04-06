//#4(a) mergesort
class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        //find the sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        //create temperary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        //transfer data to the temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        //merge the two arrays

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        //Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        //Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    //this function sorts the array
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            
            int m =l+ (r-l)/2;//find the middle point of the array m
  
            // Sort the first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // then Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
  
    //this class prints the array
    static void printArray(int arr[])
    {
        int size = arr.length;
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
   //main class
    public static void main(String args[])
    {
        int arr[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
  
        System.out.println("Array before sorting");
        printArray(arr);
  
        MergeSort mgs = new MergeSort();
        mgs.sort(arr, 0, arr.length - 1);
  
        System.out.println("\nThis is the sorted array");
        printArray(arr);
    }
}