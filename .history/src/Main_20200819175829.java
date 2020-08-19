package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new Experiment(20,"Crystal 1");
		Experiment SecondQuantom = new Experiment(20,"Crystal 2");
		Thread thread = new Thread(firstQuantom);
		thread.start();
		try{
		thread.join();
		}catch(Exception e){

		}
		ExperimentResult firstQuantomResult = firstQuantom.getResult();
		System.out.println(firstQuantomResult.getLog());
	}
}
