package tddClass;

import java.util.Scanner;

public class AverageClass {
    public static void main(String[] args) {
    //checkGrade3();
    unaryIncrement();

    }
    static void checkClass(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 5){
            System.out.println("Enter your grade");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;
        }
        int average = total / 10;

        System.out.printf("The sum of your total input is: %d%n", total);
        System.out.printf("The average of your grade is: %d%n", average);
        }

        static void checkClass1(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.println("Enter -1 to quit this loop");
        int grade = input.nextInt();

        while(grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.println("Enter -1 to quit this loop");
            grade = input.nextInt();
        }

        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades is %d%n", gradeCounter, total);
            System.out.printf("The class average is %.2f%n", average);
        } else{
            System.out.println("No value was entered");
        }
        }

        static void checkGrade3(){
            Scanner input = new Scanner(System.in);
            int studentCounter = 0;
            int passes = 0;
            int failure = 0;
            int noData = 0;


            while(studentCounter <= 10){
                System.out.println("Enter result");
                int result = input.nextInt();
                studentCounter = studentCounter + 1;

                if(result >= 40 && result <= 100){
                    passes = passes + 1;

                } else if (result >=1 && result <= 39) {
                    failure = failure + 1;
                } else {
                    noData = noData + 1;
                }
                }
            System.out.printf("Passed: %d students%nFailed: %d students%nNo Data: %d%n", passes, failure, noData);
            if(passes >= 8){
                System.out.printf("%d passes, Kudos to the instructor!%n", passes);
            }

        }
        static void unaryIncrement(){

        int c = 5;

        System.out.printf("C before postincrement is %d%n", c);
        System.out.printf("C postincrement is %d%n", c++);
        System.out.printf("C after postincrement is %d%n%n%n", c);

            c = 5;
            System.out.printf("C before preincrement is %d%n", c);
            System.out.printf("C preincrement is %d%n", ++c);
            System.out.printf("C after preincrement is %d%n", c);

        }
}

