import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        operationActions();
        cleanMemory();
        recallMemory();


    }

    private static void recallMemory() {
        Scanner scanner = new Scanner(System.in);
        Memory memory = new Memory();

        System.out.println("Do you want to recall the memory (yes/no): ");
        String add = scanner.nextLine();

        if (add.equals("yes")){
            System.out.println("The result in memory is " + memory.recallMemory());
        }
    }

    private static void cleanMemory() {
        Scanner scanner = new Scanner(System.in);
        Memory memory = new Memory();

        System.out.println("Do you want to clear the memory (yes/no): ");
        String add = scanner.nextLine();

        if (add.equals("yes")){
            memory.clearMemory();
        }
    }

    private static void addToMemory(Double result) {
        Scanner scanner = new Scanner(System.in);
        Memory memory = new Memory();
        System.out.print("Do you want to add this result in memory (yes/no): ");
        String add = scanner.nextLine();

        if (add.equals("yes")){
            memory.addToMeomory(result);
        }
    }

    private static void operationActions() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        SquareRoot squareRoot = new SquareRoot();


        switch (menu(scanner)){
            case "addition":
                double nr1 = firstNumber(scanner);
                double nr2 = secondNumber(scanner);
                double addition = calculator.addition(nr1, nr2);
                System.out.println("Addition of " + nr1 + " and " + nr2 + " is " + addition);
                addToMemory(addition);

            case "subtraction":
                double n1 = firstNumber(scanner);
                double n2 = secondNumber(scanner);
                double subtraction = calculator.subtraction(n1, n2);
                System.out.println("Dubtraction of " + n1 + " and " + n2 + " is " + subtraction);
                addToMemory(subtraction);


            case "multiplication":
                double num1 = firstNumber(scanner);
                double num2 = secondNumber(scanner);
                double multiplication = calculator.subtraction(num1, num2);
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multiplication);
                addToMemory(multiplication);


            case "division":
                double number1 = firstNumber(scanner);
                double number2 = secondNumber(scanner);
                double division = calculator.subtraction(number1, number2);
                System.out.println("Division of " + number1 + " and " + number2 + " is " + division);
                addToMemory(division);


            case "square root":
                double number = firstNumber(scanner);
                double square = squareRoot.squareRoot(number);
                System.out.println("Square root of " + number  + " is " + square);
                addToMemory(square);


            default:
                System.out.println("The operation is incorrect");
                operationActions();
        }
    }

    private static double secondNumber(Scanner scanner) {
        System.out.print("Enter second number: ");
        double nr2 = scanner.nextDouble();
        return nr2;
    }

    private static double firstNumber(Scanner scanner) {
        System.out.print("Enter first number: ");
        double nr1 = scanner.nextDouble();
        return nr1;
    }

    private static String menu(Scanner scanner) {
        System.out.println("The operation menu is: ");
        System.out.println("Addition, Subtraction, Multiplication, Division and Square Root");

        System.out.print("Select one operation: ");
        String operationName = scanner.nextLine();

        return operationName;
    }
}