import org.junit.Test;
import static org.junit.Assert.*;

public class HoarePartitionTest {
    
    @Test
    public void testSortedArray() {
        int[] arr = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int[] expected = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        
        HoarePartition.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals("Array should be sorted correctly", expected, arr);
    }
    
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        
        HoarePartition.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals("Empty array should remain empty", expected, arr);
    }
    
    @Test
    public void testUnsortedArray() {
        int[] arr = {84, 3, 7, 1, 9, 6, 2, 5};
        int[] expected = {1, 2, 3, 5, 6, 7, 9, 84};
        
        HoarePartition.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals("Array should be sorted correctly", expected, arr);
    }
}