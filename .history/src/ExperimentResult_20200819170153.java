package src;

public class ExperimentResult {
    
    private double value;
	private String log;
	

    public ExperimentResult(int value, String log) {
		this.log = log;
		this.value = value;
    }
    
    public double getValue() {
		return value;
    }
    
    public double getLog() {
		return log;
	}
}