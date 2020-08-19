package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new Experiment(20,"Crystal 1");
		Thread thread = new Thread(firstQuantom);
		thread.start();
		try{
		thread.join();
		}catch(){
			
		}
		ExperimentResult firstQuantomResult = firstQuantom.getResult();
		System.out.println(firstQuantomResult.getLog());
	}
}
