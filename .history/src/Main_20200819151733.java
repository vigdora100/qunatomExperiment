package src;

public class Main
{
	public static void main(String[] args) {
	    int NumOfaccuracies = 0;
		Calculator calculator = new Calculator("Crystal 1");
		StringBuilder printedResult = new StringBuilder(); 
	    for(int i=0; i<20; i++){
    	    Double number1 = Math.random();
			Double number2 = Math.random();
			printedResult.append(number1.toString() + ""  + number2.toString() )
    	    double accurateResult = number1+number2;
    	    double result  = calculator.add(number1,number2);
    	    if(accurateResult == result){
					NumOfaccuracies++;
			}
		}
		double successRate = NumOfaccuracies/20;
		System.out.println("Hello World " + successRate );
	}
}
