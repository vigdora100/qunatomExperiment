package src;

public class AddExperiment extends Experiment{
    	
	public AddExperiment(int numOfIterations, String name) {
        super(numOfIterations, name);
	}
	
	public void run() {
        int numOfaccuracies = 0;
		Calculator calculator = new Calculator(this.name);
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i< numOfIterations; i++){
    	    double number1 = Math.random();
			double number2 = Math.random();
			double accurateResult = number1+number2;
    	    double result  = calculator.add(number1,number2);
    	    if(accurateResult == result){
				printedResult.append(number1 + " + "  + number2
				+ " = " + accurateResult + "   (correct)" + "\n");
				  numOfaccuracies = numOfaccuracies+1;
			}
			printedResult.append(number1+ " + "  + number2
			+ " = " + accurateResult + "   (error)" + "\n");
		}
		double successRate = numOfaccuracies / 20.0;
		printedResult.append(this.name +" Success rate: "  +  successRate);
		this.setResult(new ExperimentResult(successRate, printedResult.toString())); 
    }
    

	public ExperimentResult getResult(){
		return result; 
	} 

}
