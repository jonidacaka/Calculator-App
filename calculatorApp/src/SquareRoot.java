public class SquareRoot {
    public Memory memory= new Memory();

    public double squareRoot(double nr){
        double nrSqrt = 0.0;
        if (nr < 0 ){
            System.out.println("Error");
        }
        else {
            nrSqrt = Math.sqrt(nr);
            memory.addToMeomory(nrSqrt);
        }
        return nrSqrt;
    }
}
