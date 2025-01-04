public class Maths {
    public static void main(String args[]){
        countDigits(7789);
        reverseNumber(7789);
        checkPalindrome(121);
        armstrongNumber(371);
        divisors(36);
        prime(11);
        gcd(9 ,12);
    }

    public static void countDigits(int n){
        int count = 0;

        while (n > 0){
            count++;
            n /= 10;
        }

        System.out.println("Digits: " + count);
    }

    public static void reverseNumber(int n){
        int reverse = 0;

        while (n > 0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n /= 10;
        }

        System.out.println("Reverse: " + reverse);
    }

    public static void checkPalindrome(int n){
        int reverse = 0;
        int original = n;

        while (n > 0){
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n /= 10;
        }

        if (reverse == original){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void armstrongNumber(int n){
        int armstrong = 0;
        int original = n;

        while (n > 0){
            int digit = n % 10;
            armstrong = armstrong + (digit * digit * digit);
            n /= 10;
        }

        if (armstrong == original){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void divisors(int n){
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void prime(int n){
        int count = 0;
        
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }

        if (count > 2){
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }

    public static void gcd(int n1, int n2){
        int min = n1;
        int divisor = 1;

        if (n2 < n1){
            min = n2;
        }

        for (int i = 1; i <= min; i++){
            if ((n1 % i == 0) && (n2 % i == 0)){
                divisor = i;
            }
        }

        System.out.println("GCD: " + divisor);
    }
}
