package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new Experiment(20,"Crystal 1");
		Experiment SecondQuantom = new Experiment(20,"Crystal 2");
		Thread thread1 = new Thread(firstQuantom);
		Thread thread2 = new Thread(SecondQuantom);

		thread1.start();
		thread2.start();
		try{
		thread1.join();
		thread2.join();
		}catch(Exception e){
			System.out.println("error has occured" +e)
		}
		ExperimentResult firstQuantomResult = firstQuantom.getResult();
		ExperimentResult SecondQuantomResult = SecondQuantom.getResult();
		System.out.println(firstQuantomResult.getLog());
		System.out.println(SecondQuantomResult.getLog());

	}
}
