import java.util.Scanner;

public class EnterNum {
    public static void main(String[] args) {
        checkGrade2();
    }

    static void checkGrade() {

        Scanner input = new Scanner(System.in);

        for (int user = 1; user <= 6; user++) {
            System.out.println("Please enter your number");
            int userInput = input.nextInt();
            switch (userInput) {
                case 90:
                    System.out.printf("Your grade is %s%n", "A");
                    break;
                case 60:
                    System.out.printf("Your grade is %s%n", "B");
                    break;
                case 50:
                    System.out.printf("Your grade is %s%n", "C");
                    break;
                case 40:
                    System.out.printf("Your grade is %s%n", "D");
                    break;
                case 30:
                    System.out.printf("Your grade is %s%n", "E");
                    break;
                case 20:
                    System.out.printf("Your grade is %s%n", "F");
                    break;

                default:
                    System.out.printf("Your number should be within the range of 90 - 20 %n");
                    break;
            }
        }

    }

    static void checkGrade2() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("Please enter your grade");
        int result = input.nextInt();

        for (int i = 1; i <= 6; i++) {

        System.out.println("Please enter your grade");
        result = input.nextInt();

        if (result >= 90 && result <= 100) {
            score = 90;
        } else if (result >= 60 && result <= 89) {
            score = 60;
        } else if (result >= 50 && result <= 59) {
            score = 50;
        } else if (result >= 40 && result <= 49) {
            score = 40;
        } else if (result >= 30 && result <= 39) {
            score = 30;
        } else if (result >= 20 && result <= 29) {
            score = 20;
        }
        else {
            score = 0;
        }

            switch (score) {
                case 90:
                    System.out.printf("Your grade is %s%n", "A");
                    break;

                case 60:
                    System.out.printf("Your grade is %s%n", "B");
                    break;

                case 50:
                    System.out.printf("Your grade is %s%n", "C");
                    break;

                case 40:
                    System.out.printf("Your grade is %s%n", "D");
                    break;

                case 30:
                    System.out.printf("Your grade is %s%n", "E");
                    break;

                case 20:
                    System.out.printf("Your grade is %s%n", "F");
                    break;

                default:
                    System.out.printf("Your number should be within the range of 90 - 20 %n");
                    break;
                }
            }
        }
}
