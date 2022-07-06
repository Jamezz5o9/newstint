public class LoopThrough{
    public static void main(String[] args) {
    pattern6(6);


    }
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++){

            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++){

            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print("*");
            }
            for(int col = 2; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++){
            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print("*" );
            }
            for(int col = 2; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        for (int row = 1; row <= 2 * n; row++){
            int totalColInRows = row > n ? 2 * n - row: row;
            for(int col = 1; col <= totalColInRows; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 1; row <= n; row++){
           // int t = row > n ? 2 * n - row : row;

            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            for(int col = 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void patternA(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternB(int n){
        for(int row = 1; row <= n; row++){
            int c = n + 1 - row;
            for(int col = 1; col <= c; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternC(int n){
        for(int row = 1; row <= n; row++){
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }
           // int c = n + 1 - row;
            for(int col = row; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void patternD(int n){
        for (int row = 1; row <= n; row++){

            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print("*");
            }
            for(int col = 2; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void patternAA(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void patternBB(int n){
        for(int row = 1; row <= n; row++){
            int c = n + 1 - row;
            for(int col = 1; col <= c; col++ ){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void patternCC(int n){
        for(int row = 1; row <= n; row++){
            int c = n + 1 - row;
           // int p =1;
            for(int space = 1; space <= row; space++){
                System.out.print(" ");
            }

            for(int col = 1; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
    static void patternDD(int n){
        for (int row = 1; row <= n; row++){
            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print(" ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col);
            }
//            for(int col = 2; col <= row; col++){
//                System.out.print(col+ " ");
//            }
            System.out.println();
        }

    }
//    static void checkPattern(int n){
//        for (i = 1; i <= 5; i++) {
//            for (j = 1; j <= 3; j++) {
//                for (k = 1; k <= 4; k++) {
//                    System.out.p++rint('*');
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }


}
