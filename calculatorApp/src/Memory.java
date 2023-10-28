public class Memory {
    public double value;

    public void addToMeomory(double newValue){
        value += newValue;
    }
    public double recallMemory( ){
        return value;
    }
    public void clearMemory(){
        value=0.0;
    }

}
