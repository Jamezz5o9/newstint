package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Variable {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<>();

        for (int i =0; i < 10; i++){
            System.out.println("Please enter any value");
            int newInput = input.nextInt();
            items.add(newInput);
        }

        calculateAverage(items, "The average of the result of the table is this : 3");

    }
    public static void calculateAverage(ArrayList<Integer> items, String result) {
        System.out.println(result);

        for(Integer item : items){
            System.out.printf("The result of our average is %d%n", item / items.size());
        }
    }
}
