import java.util.*;

public class Recursion {
    public static void main(String args[]){
        int count = 1;
        printNTimes(count, 5);
        printOneToN(count, 5);
        printNToOne(5);
        printOneToNBacktracking(5, 5);
        printNToOneBacktracking(5, 5);
        sumNParameter(3, 0);
        System.out.println(sumNFunctional(3));
        System.out.println(factorialN(3));

        int[] array = {1, 2, 3, 4 ,5};
        reverseArray(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        String str = "rotator";
        char[] charArray = str.toCharArray();
        System.out.println(palindromeString(charArray, 0, charArray.length - 1));

        System.out.println(fibonacci(8));
    }

    public static void printNTimes(int count, int n){
        if (count > n){
            return;
        }

        System.out.println("hello world");
        printNTimes(++count, n);
    }

    public static void printOneToN(int count, int n){
        if (count > n){
            return;
        }

        System.out.print(count);
        printOneToN(++count, n);
    }

    public static void printNToOne(int n){
        if (n == 0){
            return;
        }

        System.out.print(n);
        printNToOne(--n);
    }

    public static void printOneToNBacktracking(int count, int n){
        if (count < 1){
            return;
        }

        printOneToNBacktracking(count - 1, n);
        System.out.print(count);
    }

    public static void printNToOneBacktracking(int count, int n){
        if (count == 0){
            return;
        }

        printNToOneBacktracking(count - 1, n);
        System.out.print(n - count + 1);
    }

    public static void sumNParameter(int n, int sum){
        if (n < 1){
            System.out.print(sum);
            return;
        }

        sumNParameter(n - 1, sum + n);
    }

    public static int sumNFunctional(int n){
        if (n == 0){
            return 0;
        }

        return n + sumNFunctional(n - 1);
    }

    public static int factorialN(int n){
        if (n == 0){
            return 1;
        }

        return n * factorialN(n - 1);
    }

    public static void reverseArray(int[] array, int left, int right){
        if (left >= right){
            return;
        }

        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;

        reverseArray(array, left + 1, right - 1);
    }

    public static boolean palindromeString(char[] word, int left, int right){
        if (left >= right){
            return true;
        }

        if (word[left] != word[right]){
            return false;
        }

        return palindromeString(word, left + 1, right - 1);
    }

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
