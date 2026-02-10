/*
Lomuto Partition method is taking the last element in the array as pivot
loop j through all the elements in array
check if the element at j is less than or equal to pivot
if yes we increment i by 1 and do the swap with the element at j index.
final step swap the element at i+1 with pivot and return i+1 (next index of i).
*/
public class LomutoPartition {

    public static int partition(int[] arr, int low, int high) {
        //get the last element in arr
        int pivot = arr[high];

        int i = low - 1;

        //j start from the left (low) and end at the last element
        for (int j = low; j < high; j++) {

            /*if element at j index is less than pivot
             we increment i by 1 and do the swap */
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap index at i+1 with the pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        //only execute if the begin and the end of the index is not cross or equal 
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Recurse on the two sides excluding the pivot index (pi),
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
}