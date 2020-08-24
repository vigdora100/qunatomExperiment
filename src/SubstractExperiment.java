package src;

public class SubstractExperiment extends Experiment{

    private Calculator calculator;
    	
	public SubstractExperiment(int numOfIterations, String name) {
        super(numOfIterations, name,"-");
        this.calculator = new Calculator(name);
	}
	
    public double accurateResult(double number1,double number2){
            return number1-number2;
    }

    public double calcLogic(double number1,double number2){
        return calculator.subtract(number1,number2);
    }

}
