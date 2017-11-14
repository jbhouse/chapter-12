import java.util.LinkedList;

public class StackCalculator {

	private LinkedList<Double> values = new LinkedList<>();
	
	public StackCalculator() {
		this.values = new LinkedList<>();
	}
	
	public void push (double x) {
		this.values.add(x);
	}
	public void pop() {
		this.values.remove(this.values.size()-1);
	}
	public void add() {
		this.values.add(workOnTopTwo("+"));
	}
	public void subtract() {
		this.values.add(workOnTopTwo("-"));
	}
	public void multiply() {
		this.values.add(workOnTopTwo("*"));
	}
	public void divide() {
		this.values.add(workOnTopTwo("/"));
	}
	public void clear() {
		this.values.clear();
	}
	public double[] getValues() {
		double[] allValues = new double[this.values.size()];
//		System.out.println(this.values);
		int i=0;
		for(double d : this.values) {
			allValues[i] = d;
			i++;
		}
		return allValues;
	}
	public int size() {
		return this.values.size();
	}
	
	public double workOnTopTwo(String delimiter){
		double last = this.values.remove(this.values.size()-1);
		double newLast = this.values.remove(this.values.size()-1);
		switch(delimiter) {
		case "+":
			return last+newLast;
		case "-":
			return last-newLast;
		case "*":
			return last*newLast;
		case "/":
			return last/newLast;
		}
		return 0.0;
	}
	
}
