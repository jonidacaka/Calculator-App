public class SquareRoot {
    public Memory memory= new Memory();

    public double squareRoot(double nr){
        double nrSqrt = 0.0;
        if (nr < 0 ){
            System.out.println("The number you provided cant be squared because its a negative number");
            System.out.println("The operation will ignore it by itself");
        }
        else {
            nrSqrt = Math.sqrt(nr);
            memory.addToMeomory(nrSqrt);
        }
        return nrSqrt;
    }
}
