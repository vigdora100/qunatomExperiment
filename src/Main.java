package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new AddExperiment(20,"Crystal 1");
		Experiment SecondQuantom = new AddExperiment(20,"Crystal 2");
		Thread thread1 = new Thread(firstQuantom);
		Thread thread2 = new Thread(SecondQuantom);

		thread1.start();
		thread2.start();
		try{
		thread1.join();
		thread2.join();
		}catch(Exception e){
			System.out.println("error has occured: " + e );
		}
		ExperimentResult firstQuantomResult = firstQuantom.getResult();
		ExperimentResult secondQuantomResult = SecondQuantom.getResult();
		System.out.println(firstQuantomResult.getLog());
		System.out.println(secondQuantomResult.getLog());
		if(firstQuantomResult.getValue() > secondQuantomResult.getValue()){
			System.out.println("Crystal 1 is better");
		}else{
			System.out.println("Crystal 2 is better");
		}



	}
}
