public class InitArray {
    public static void main(String[] args) {
initArray();
    }
    static void initArray(){
        int[] array = new int[12];

        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }

    static void initArray2(){
        int[] secArray = {0, 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.print("Grade distribution");

        for(int grade = 0; grade < secArray.length; grade++){

        }
    }
}
