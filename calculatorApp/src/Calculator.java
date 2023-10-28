public class Calculator {
    // Arithmetic Operations: Users can perform addition, subtraction, multiplication, and division of two numbers.
    // The calculator displays the result of each operation.
    //Square Root: Users can calculate the square root of a non-negative number. If a negative number is entered,
    // the calculator will display an error message.
    //Memory Functions: The calculator includes memory-related functions for storing, clearing, and recalling values:
    //Add to Memory (M+): Users can add the result of the last operation to memory.
    //Clear Memory (MC): Users can clear the memory, removing any stored value.
    //Recall Memory (MR): Users can recall the value stored in memory and use it in calculations.
    //
    //
    //
    //User Interface: The user interface is text-based, allowing users to interact with the calculator through the console.
    // Users are presented with a menu to select operations and enter numbers.
    //Exit Option: Users can choose to exit the calculator when they are finished with their calculations.



        public Memory memory= new Memory();

        public double add( double nr1, double nr2) {
            double sum = nr1 + nr2;
            memory.addToMeomory(sum);
            return sum;
        }
        public double subtraction( double nr1, double nr2){
            double result= nr1 - nr2;
            memory.addToMeomory(result);
            return result;
        }
        public double multiplication( double nr1, double nr2){
            double multiplicationResult= nr1 * nr2;
            memory.addToMeomory(multiplicationResult);
            return multiplicationResult;
        }
        public double division(double nr1 , double nr2){
            double divisionResult= nr1 / nr2;
            memory.addToMeomory(divisionResult);
            return divisionResult;
        }



    }

