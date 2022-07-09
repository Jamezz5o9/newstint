package Chapter4;

import java.util.Scanner;

public class Gross {
    public static void main(String[] args) {
        goodsProfits();
    }

    public static void goodsProfits(){
            Scanner input = new Scanner(System.in);
            int total = 0;
            int salary = 200;
            double profitOnGoods;
            for(int i = 1; i <= 10; i++){
                System.out.println("Please enter the goods sold");
                int goodPerWeek = input.nextInt();
                total += goodPerWeek;
            }
            profitOnGoods = total * 0.09;
            double salaryPlusProfit = profitOnGoods + salary;
            System.out.printf("The total values of goods sold per week is: %d%n", total);
            System.out.printf("Your profit on goods for this week is %.2f while your salary plus profit is %.2f",profitOnGoods, salaryPlusProfit);

    }

}


