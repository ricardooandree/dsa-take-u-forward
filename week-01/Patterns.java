public class Patterns {
    public static void main(String[] args){
        pattern_1(5);
        pattern_2(5);
        pattern_3(5);
        pattern_4(5);
        pattern_5(5);
        pattern_6(5);
        pattern_7(5);
        pattern_8(5);
        pattern_9(5);
        pattern_10(5);
        pattern_11(5);
        pattern_12(5);
        pattern_13(5);
        pattern_14(5);
        pattern_15(5);
        pattern_16(5);
        pattern_17(5);
        pattern_18(5);
        pattern_19(5);
        pattern_20(5);
        pattern_21(4);
        pattern_22(5);
    }

    public static void pattern_1(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern_4(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void pattern_5(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = i; j < rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_6(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern_7(int rows){
        int n = -1;
        for (int i = 0; i < rows; i++){
            if (i % 2 == 0){
                n = 1;
            } else {
                n = 0;
            }

            for (int j = 0; j <= i; j++){
                System.out.print(n);
                n = 1 - n;
            }
            System.out.println();
        }
    }

    public static void pattern_8(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }

    public static void pattern_9(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }

    public static void pattern_10(int rows){
        for(int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)(i + 'A'));
            }
            System.out.println();
        }
    }

    public static void pattern_11(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++){
                System.out.print((char)('A' + j));
            }

            for (int j = i; j > 0; j--){
                System.out.print((char)('A' + j - 1));
            }

            for (int j = 0; j < rows - i - 1; j++){
                System.out.print("");
            }
            System.out.println();
        }
    }

    public static void pattern_12(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)('A' + rows - 1 + j - i));
            }
            System.out.println();
        }
    }

    public static void pattern_13(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    
    public static void pattern_14(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (rows - i) - 1; j++){
                System.out.print("*");
            }

            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

    public static void pattern_15(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(j + 1);
            }

            for (int j = 0; j < 2 * (rows - i - 1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print(i + 1 - j);
            }
            
            System.out.println();
        }
    }

    public static void pattern_16(int rows){
        int n = 0;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                n += 1;
                System.out.print(n);
            }

            System.out.println();
        }
    }
    
    public static void pattern_17(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern_18(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }

            for (int j = 0; j < rows - i - 1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (rows - i) - 1; j++){
                System.out.print("*");
            }

            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern_19(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++){
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (rows - i - 1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern_20(int rows){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (rows - i - 1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i - 1; j++){
                System.out.print("*");
            }

            for (int j = 0; j < 2 * (i + 1); j++){
                System.out.print(" ");
            }

            for (int j = 0; j <  rows - i - 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern_21(int rows) {
        int size = 2 * rows - 1;
    
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int distance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                int num = rows - distance;
                System.out.print(num);
            }
            System.out.println();
        }
    }
    
    

    public static void pattern_22(int rows){
        for (int i = 0; i < rows; i++){
            if (i == 0){
                for (int j = 0; j < rows; j++){
                    System.out.print("*");
                }

                System.out.println();
            }
            else if (i == rows - 1){
                for (int j = 0; j < rows; j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");

                for (int j = 0; j < rows - 2; j++){
                    System.out.print(" ");
                }

                System.out.print("*");
                System.out.println();
            }
        }
    }
}
