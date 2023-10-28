import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Memory memory = new Memory();

        callCalculaitonoperation(memory);
    }

    private static void callCalculaitonoperation(Memory memory) {
        operationActions(memory);
        recallMemory(memory);
        cleanMemory(memory);
        goOrBack(memory);
    }

    private static void goOrBack(Memory memory) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Do you want to make another operation (yes/no): ");
        String back = scanner.nextLine();

        if (back.equals("yes")){
            System.out.println();
            callCalculaitonoperation(memory);
        }else {
            System.out.println("Thank you for using my calculator application.");
        }
    }

    private static void recallMemory(Memory memory) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Do you want to recall the memory (yes/no): ");
        String recall = scanner.nextLine();

        if (recall.equals("yes")){
            System.out.println("The result in memory is " + memory.recallMemory());
        }
    }

    private static void cleanMemory(Memory memory) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Do you want to clear the memory (yes/no): ");
        String clean = scanner.nextLine();

        if (clean.equals("yes")){
            memory.clearMemory();
            System.out.println("Memory cleaned successfully");
        }
    }

    private static void addToMemory(Memory memory, Double result) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Do you want to add this result in memory (yes/no): ");
        String add = scanner.nextLine();

        if (add.equals("yes")){
            memory.addToMeomory(result);
            System.out.println("Value added successfully in memory");
        }
    }

    private static void operationActions(Memory memory) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        SquareRoot squareRoot = new SquareRoot();


        switch (menu()){
            case "addition":
                double nr1 = firstNumber(scanner);
                double nr2 = secondNumber(scanner);
                double addition = calculator.addition(nr1, nr2);
                System.out.println("Addition of " + nr1 + " and " + nr2 + " is " + addition);
                addToMemory(memory, addition);
                break;

            case "subtraction":
                double n1 = firstNumber(scanner);
                double n2 = secondNumber(scanner);
                double subtraction = calculator.subtraction(n1, n2);
                System.out.println("Subtraction of " + n1 + " and " + n2 + " is " + subtraction);
                addToMemory(memory, subtraction);
                break;


            case "multiplication":
                double num1 = firstNumber(scanner);
                double num2 = secondNumber(scanner);
                double multiplication = calculator.multiplication(num1, num2);
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + multiplication);
                addToMemory(memory, multiplication);
                break;


            case "division":
                double number1 = firstNumber(scanner);
                double number2 = secondNumber(scanner);
                double division = calculator.division(number1, number2);
                System.out.println("Division of " + number1 + " and " + number2 + " is " + division);
                addToMemory(memory, division);
                break;


            case "square root":
                double number = number(scanner);
                double square = squareRoot.squareRoot(number);
                System.out.println("Square root of " + number  + " is " + square);
                addToMemory(memory, square);
                break;


            default:
                System.out.println("The operation is incorrect");
                operationActions(memory);
                break;
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

    private static double number(Scanner scanner) {
        System.out.print("Enter number: ");
        double nr1 = scanner.nextDouble();
        return nr1;
    }

    private static String menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The operation menu is: ");
        System.out.println("Addition, Subtraction, Multiplication, Division and Square Root");

        System.out.print("Select one operation: ");
        String operationName = scanner.nextLine();

        return operationName;
    }
}