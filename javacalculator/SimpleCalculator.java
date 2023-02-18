package javacalculator;

import java.util.Scanner;

public class SimpleCalculator {


    public static void main(String[] args) {

        double input1, input2, result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the calculation");
        System.out.println("For example (24 * 10");
        String eingabeS = scanner.nextLine();
        input1 = Double.parseDouble(eingabeS.split(" ")[0]);
        input2 = Double.parseDouble(eingabeS.split(" ")[2]);

        switch (eingabeS.split(" ")[1]) {
            case "+" -> result = input1 + input2;
            case "-" -> result = input1 - input2;
            case "*" -> result = input1 * input2;
            case "/" -> result = input1 / input2;
            default -> {
                System.err.println("Error");
                result = 0;
            }
        }
        System.out.println("The result is " + result);

    }

}
