package src;

public class Experiment implements Runnable{

	private int numOfIterations;
	private String name;
	private ExperimentResult result;
	
	public Experiment(int numOfIterations, String name) {
		this.numOfIterations = numOfIterations;
		this.name = name;
	}
	
	public void run() {
        int numOfaccuracies = 0;
		Calculator calculator = new Calculator(this.name);
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i<20; i++){
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
		printedResult.append("Crystal 1 Success rate: "  +  successRate);
		this.setResultnew ExperimentResult(successRate, printedResult.toString()); 
	}

	private void setResult(ExperimentResult result ){
			this.result = result; 
	} 

}
