package src;

public abstract class Experiment implements Runnable{

	private double numOfIterations;
	private String expiramentName;
	private ExperimentResult result;
	private String arithmeticSign;
	
	protected void setResult(ExperimentResult result ){
		this.result = result; 
	} 

	public Experiment(double numOfIterations, String expiramentName, String arithmeticSign ) {
		this.numOfIterations = numOfIterations;
		this.expiramentName = expiramentName;
		this.arithmeticSign = arithmeticSign;
	}
	
	public void run() {
		int numOfaccuracies = 0;
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i < numOfIterations; i++){
    	    double number1 = Math.random();
			double number2 = Math.random();
			double result = this.calcLogic(number1,number2);
			double accurateResult  = this.accurateResult(number1,number2);
			printedResult.append(number1 + " "+ arithmeticSign +" "  + number2
				+ " = " + result);
    	    if(accurateResult == result){
				printedResult.append("   (correct)" + "\n");
				numOfaccuracies = numOfaccuracies+1;
			}else{
				printedResult.append("   (error)" + "\n");
			}
		}
		double successRate = numOfaccuracies / numOfIterations;
		printedResult.append(this.expiramentName +" Success rate: "  +  successRate);
		this.setResult(new ExperimentResult(successRate, printedResult.toString())); 
	}

	public ExperimentResult getResult(){
		return result; 
	}
	
	public abstract double calcLogic(double number1, double number2);
	public abstract double accurateResult(double number1, double number2);


}
