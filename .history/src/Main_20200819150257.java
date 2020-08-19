package src;

public class Main
{
	public static void main(String[] args) {
	    int NumOfaccuracies = 0;
	    Calculator calculator = new Calculator("Crystal 1");
	    for(int i=0; i<20; i++){
    	    double number1 = Math.random();
    	    double number2 = Math.random();
    	    double accurateResult = number1+number2;
    	    double result  = calculator.add(number1,number2);
    	    if(accurateResult == result){
					NumOfaccuracies++;
			}
		}
		if(NumOfaccuracies>0){

		}
	    double result = calculator.add(1.13,7.15);
		System.out.println("Hello World " + result );
	}
}
