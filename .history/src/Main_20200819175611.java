package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new Experiment(20,"Crystal 1");
		Thread thread = new Thread(foo);
thread.start();
thread.join();
int value = foo.getValue()
		ExperimentResult firstQuantomResult = firstQuantom.run();
		System.out.println(firstQuantomResult.getLog());
	}
}
