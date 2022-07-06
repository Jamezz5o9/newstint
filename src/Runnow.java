public class Runnow {
    public static void main(String[] args) {

        int rows = 5;

        for (int firstNum = 1; firstNum <= rows; firstNum++) {
            for(int secondNum = 1; secondNum <= firstNum; secondNum++){
                System.out.print(firstNum + " ");
            }
            System.out.println();
        }
    }
}
