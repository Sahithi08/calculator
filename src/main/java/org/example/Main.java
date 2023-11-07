package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("program started");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        System.out.flush();
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        System.out.flush();
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1,num2);
                logger.info("addition completed");
                break;
            case 2:
                result = sub(num1,num2);
                logger.info("subtraction completed");
                break;
            case 3:
                result = mul(num1,num2);
                logger.info("multiplication completed");
                break;
            case 4:
                if (num2 != 0) {
                    result = div(num1,num2);
                    logger.info("division completed");
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    logger.warn("division by zero error");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                logger.warn("invalid choice");
                return;
        }

        System.out.println("Result: " + result);
        logger.info("program completed");
    }
    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double sub (double num1,double num2){
        return num1-num2;
    }
    public static double mul(double num1,double num2){
        return num1*num2;
    }
    public static double div(double num1,double num2){
            return num1 / num2;
    }
}

