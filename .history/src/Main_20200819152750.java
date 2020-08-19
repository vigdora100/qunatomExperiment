package src;

public class Main
{
	public static void main(String[] args) {
	    int numOfaccuracies = 0;
		Calculator calculator = new Calculator("Crystal 1");
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i<20; i++){
    	    Double number1 = Math.random();
			Double number2 = Math.random();
			Double accurateResult = number1+number2;
    	    Double result  = calculator.add(number1,number2);
    	    if(accurateResult == result){
				printedResult.append(number1.toString() + " + "  + number2.toString()
				+ " = " + accurateResult.toString() + "   (correct)" + "\n");
				  numOfaccuracies = numOfaccuracies+1;
			}
			printedResult.append(number1.toString() + " + "  + number2.toString()
			+ " = " + accurateResult.toString() + "   (error)" + "\n");
		}
		Double successRate = numOfaccuracies/20;
		printedResult.append("Crystal 1 Success rate: " + successRate);
		System.out.println(printedResult);
	}
}
