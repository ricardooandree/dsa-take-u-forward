public class Maths {
    public static void main(String args[]){
        countDigits(7789);
        reverseNumber(10400);
        checkPalindrome(121);
        armstrongNumber(371);
        divisors(36);
        prime(11);
        gcd(9 ,12);
    }

    public static void countDigits(int n){
        int counter = 0;
        while (n > 0){
            n = n / 10;
            counter++;
        }

        System.out.println(counter);
    }

    public static void reverseNumber(int n){
        int digit;
        int reverse = 0;

        while (n > 0){
            digit = n % 10;
            n = n / 10;

            reverse = (reverse * 10) + digit;
        }
        System.out.println(reverse);
    }

    public static void checkPalindrome(int n){
        int digit;
        int reverse = 0;
        int original = n;

        while(n > 0){
            digit = n % 10;
            n = n / 10;

            reverse = (reverse * 10) + digit;
        }

        System.out.println(reverse == original);
    }

    public static void armstrongNumber(int n){
        int digit;
        int armstrong = 0;
        int original = n;

        while (n > 0){
            digit = n % 10;
            n = n /10;

            armstrong = armstrong + (digit * digit * digit);
        }

        System.out.println(original == armstrong);
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
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println(count == 2);
    }

    public static void gcd(int n1, int n2){
        int gcd = 1;
        int min = 0;

        if (n1 > n2){
            min = n2;
        } else {
            min = n1;
        }

        for (int i = 1; i <= min; i++){
            if ((n1 % i == 0) && (n2 % i == 0)){
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
