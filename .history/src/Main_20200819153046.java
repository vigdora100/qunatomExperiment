package src;

public class Main
{
	public static void main(String[] args) {
	    int numOfaccuracies = 0;
		Calculator calculator = new Calculator("Crystal 1");
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i<10; i++){
    	    double number1 = Math.random();
			double number2 = Math.random();
			double accurateResult = number1+number2;
    	    double result  = calculator.add(number1,number2);
    	    if(accurateResult == result){
				printedResult.append(number1 + " + "  + number2
				+ " = " + accurateResult + "   (correct)" + "\n");
				  numOfaccuracies = numOfaccuracies+1;
			}
			printedResult.append(number1.toString() + " + "  + number2.toString()
			+ " = " + accurateResult.toString() + "   (error)" + "\n");
		}
		double successRate = numOfaccuracies * 4;
		printedResult.append("Crystal 1 Success rate: " + successRate);
		System.out.println(printedResult);
	}
}
