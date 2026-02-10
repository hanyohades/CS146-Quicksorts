/*
Hoare Parition method is taking the first element in the array as pivot.
Using two pointers i start at low-1 and j start at high+1 of the array.
if the element at i is less than pivot we will keep increasing i
if the element at j is greate than pivot we will keep decreasing j
if i greater and equal to j we return j
None of those if conditions are true, we will swap element at i with element at j
Because that will create 
all the element half left smaller than pivot and half right greater than pivot.
*/

public class HoarePartition {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        
        // Loop will run until i >= j and return index j
        while (true) {

            // increment i by 1 first then check if true do again
            do {
                i++;
            } while (arr[i] < pivot);

            //decrement j by 1 first then check if true do again.
            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            
            //if arr[i] is not less pivot and arr[j] is not greater pivot we swap.
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            //recursion for half left part
            quickSort(arr, low, pivotIndex);

            //recursion for half right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }
}