import java.util.*;

public class Sorting {
    public static void main(String[] args){
        int[] array = new int[]{13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(selectionSort(array)));
        System.out.println(Arrays.toString(bubbleSort(array)));
        System.out.println(Arrays.toString(insertionSort(array)));
        
        array = new int[]{13, 46, 24, 52, 20, 9};
        recursiveBubbleSort(array, 0);
        System.out.println(Arrays.toString(array));

        array = new int[]{13, 46, 24, 52, 20, 9};
        recursiveInsertionSort(array, 0);
        System.out.println(Arrays.toString(array));

        array = new int[]{13, 46, 24, 52, 20, 9};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        array = new int[]{13, 46, 24, 52, 20, 9};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static int[] selectionSort(int[] array){        
        for (int i = 0; i < array.length - 1; i++){
            int min_index = i;

            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }

            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }

        return array;
    }

    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) { break; }
        }

        return array;
    }

    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
        
        return array;
    }

    public static void merge(int[] array, int low, int middle, int high){
        ArrayList<Integer> aux = new ArrayList<>();
        int left = low;
        int right = middle + 1;

        while (left <= middle && right <= high){
            if (array[left] <= array[right]){
                aux.add(array[left]);
                left++;
            }
            else {
                aux.add(array[right]);
                right++;
            }
        }
        
        while (left <= middle){
            aux.add(array[left]);
            left++;
        }

        while (right <= high){
            aux.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++){
            array[i] = aux.get(i - low);
        }
    }

    
    public static void mergeSort(int[] array, int low, int high){
        if (low >= high) { return; }

        int middle = (low + high) / 2;
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        merge(array, low, middle, high);
    }

    
    public static void recursiveBubbleSort(int[] array, int n){
        // base case
        if (n == 1){
            return;
        }

        boolean swapped = false;

        for (int i = 0; i < n - 1; i++){
            if (array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                swapped = true;
            }
        }

        if (!swapped) { return; }
        
        recursiveBubbleSort(array, n - 1);
    }

    
    public static void recursiveInsertionSort(int[] array, int i){
        // Base Case
        if (i == array.length){
            return;
        }

        int key = array[i];
        int j = i - 1;
        
        while (j >= 0 && array[j] > key){
            array[j+1] = array[j];
            j--;
        }

        array[j+1] = key;
        recursiveInsertionSort(array, i + 1);
    }
    

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];  
        int i = low + 1;  
        int j = high;
    
        while (i <= j) {  // i and j must not cross over
            // Move i to the right while array[i] is less than or equal to pivot
            while (i <= high && array[i] <= pivot) { i++; }
    
            // Move j to the left while array[j] is greater than pivot
            while (array[j] > pivot && j >= low) { j--; }
    
            // If i and j haven't crossed, swap array[i] and array[j]
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    
        // Place the pivot in its correct position (between smaller and larger elements)
        array[low] = array[j];
        array[j] = pivot;
    
        return j; 
    }
    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }
}
