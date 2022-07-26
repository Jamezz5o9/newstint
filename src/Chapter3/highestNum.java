package Chapter3;

import java.util.Scanner;

public class highestNum {
    private static Scanner input = new Scanner(System.in);
    private static int number;
    private static int num;
    private static int smallest;
    public static void main(String[] args) {
        //highNum();
        lowestNum();
    }

    public static void highNum(){
        int largest = 0;
        int lowest = 1000000000;

        for(int i = 1; i < 11; i++){
            System.out.printf("please enter your number for student%d%n ", i);
             number = input.nextInt();
             if(number > largest){
                 largest = number;
             }

        }
        System.out.printf("The highest num is %d%n  ", largest);
    }

        public static void lowestNum(){
        smallest = num;
        for(int i = 1; i <= 5; i++){
            System.out.printf("Please enter any number %d%n", i);
            num = input.nextInt();
            if(num < smallest){
                smallest = num;
            }
            }
            System.out.printf("The smallest num is %d%n", smallest);
        }
}
