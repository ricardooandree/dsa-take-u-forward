import java.util.*;

public class Recursion {
    public static void main(String args[]){
        int count = 1;
        printNTimes(count, 5);
        printOneToN(count, 5);
        System.out.println();
        printNToOne(count, 5);
        System.out.println();
        printOneToNBacktracking(5, 5);
        System.out.println();
        printNToOneBacktracking(5, 5);
        System.out.println();
        sumNParameter(3, 0);
        
        System.out.println("Functional-Sum: " + sumNFunctional(3));
        System.out.println("Functional-Factorial: " + factorialN(3));

        int[] array = {1, 2, 3, 4 ,5};
        reverseArray(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        String str = "rotator";
        char[] charArray = str.toCharArray();
        System.out.println("Palindrome: " + palindromeString(charArray, 0));

        System.out.println("Fibonacci: " + fibonacci(8));
    }

    public static void printNTimes(int i, int limit){
        if (i > limit){
            return;
        }

        System.out.println("Hello World!");
        printNTimes(i + 1, limit);
    }

    public static void printOneToN(int i, int n){
        if (i > n){
            return;
        }

        System.out.print(i);
        printOneToN(i + 1, n);
    }

    public static void printNToOne(int i, int n){
        if (i > n){
            return;
        }

        System.out.print(n - i + 1);
        printNToOne(i + 1, n);
    }

    public static void printOneToNBacktracking(int i, int n){
        if (i < 1){
            return;
        }

        printOneToNBacktracking(i - 1, n);  // calls the recursion before printing - makes sure the function is executed first
        System.out.print(i);
    }

    public static void printNToOneBacktracking(int i, int n){
        if (i < 1){
            return;
        }

        printNToOneBacktracking(i - 1, n);
        System.out.print(n - i + 1);
    }

    public static void sumNParameter(int i, int sum){
        if (i < 1){
            System.out.println("Parameter-Sum: " + sum);
            return;
        }

        sumNParameter(i - 1, sum + i);
    }

    public static int sumNFunctional(int i){
        if (i == 0){
            return 0;
        }

        return i + sumNFunctional(i - 1);
    }

    public static int factorialN(int n){
        if (n < 1){
            return 1;
        }

        return n * factorialN(n - 1);
    }

    public static void reverseArray(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        
        int aux = array[left];
        array[left] = array[right];
        array[right] = aux;

        reverseArray(array, left + 1, right - 1);
    }

    public static boolean palindromeString(char[] word, int i){
        int n = word.length;

        if (i >= n / 2){
            return true;
        }

        if (word[i] != word[n - i - 1]){
            return false;
           
        }

        return palindromeString(word, i + 1);
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
