package src;

public class AddExperiment extends Experiment{

    private Calculator calculator;
    	
	public AddExperiment(int numOfIterations, String name) {
        super(numOfIterations, name, "+");
        this.calculator = new Calculator(name);
	}
	
    public double calcLogic(double number1,double number2){
            return number1+number2;
    }

    public double accurateResult(double number1,double number2){
        return calculator.add(number1,number2);
    }

}
