import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read the instructions below, then type the number(s) you would like to calculate!");
        while (true) {
            System.out.println("Please type the math operation you would like to complete");
            System.out.println("+ for addition");
            System.out.println("- for subtraction");
            System.out.println("* for multiplication");
            System.out.println("/ for division");
            System.out.println("** for power");
            System.out.println("% for finding the remainder");
            System.out.println("X for Exiting");
            String operator = scanner.nextLine();
            if (operator.equals("+")) {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println(number1 + number2);


            } else if (operator.equals("-")) {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println(number1 - number2);


            } else if (operator.equals("*")) {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println(number1 * number2);


            } else if (operator.equals("/")) {
                double number1 = scanner.nextInt();
                double number2 = scanner.nextInt();
                System.out.println(number1 / (number2 * 1.0));

            } else if (operator.equals("**")) {
                int number1 = scanner.nextInt();
                System.out.println(number1 * number1);
            } else if (operator.equals("%")) {
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                System.out.println(number1 % number2);

            } else if (operator.equals("X")) {
                System.out.println("See you later man!");
                break;
            } else {
                System.out.println("Pick an option from the list above, this one isn't valid. Sorry!");


            }

        }

    }
}

