package src;

public class Main
{
	public static void main(String[] args) {
		Experiment firstQuantom = new Experiment(20,"Crystal 1");
		ExperimentResult firstQuantomResult = firstQuantom.run();
		System.out.println(firstQuantomResult.getLog());
	}
}
