import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(array, leftArray, rightArray);
        }
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
