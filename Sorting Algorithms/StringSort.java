import java.util.Arrays;

public class StringSort {

    public static void main(String[] args) {
        String[] array = {"banana", "apple", "orange", "grape"};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        
        // Sorting the array of strings
        Arrays.sort(array);
        
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
