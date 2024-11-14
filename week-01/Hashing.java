import java.util.*;

public class Hashing {
    public static void main(String args[]){
        // Counting frequencies of array elements
        HashMap<Integer, Integer> map1 = intMapHashing(new int[]{1, 0, 2, 1, 4, 4, 6, 4});
        System.out.println(map1);

        // Find the highest/lowest frequency element
        HashMap<Integer, Integer> map2 = intMapHashing(new int[]{10, 5, 10, 15, 10, 5});
        int maxFreq = 0, minFreq = 6;
        int maxElem = 0, minElem = 0;
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq){
                maxElem = element;
                maxFreq = count;
            }
            if (count < minFreq){
                minElem = element;
                minFreq = count;
            }
        }

        System.out.println("Highest frequency: " + maxElem + " shows up " + maxFreq + " times");
        System.out.println("Lowest frequency: " + minElem + " shows up " + minFreq + " times");
    }

    public static int[] intArrayHashing(int[] array, int maxNumber){
        int[] hash = new int[maxNumber + 1]; 

        for (int i = 0; i < array.length; i++){
            hash[array[i]] += 1;
        }

        return hash;
    }

    public static char[] charArrayHashing(char[] array, int maxNumber){
        char[] hash = new char[maxNumber + 1]; 

        for (int i = 0; i < array.length; i++){
            hash[array[i] - 'a'] += 1;
        }

        return hash;
    }

    public static HashMap<Integer, Integer> intMapHashing(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
    }
}
