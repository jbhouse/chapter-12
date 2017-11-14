import java.util.ArrayList;

public class PrimeApp {

    public static void main(String[] args) {
    	int userInput = Console.getInt("Enter a number between 1 and 5000: ");
    	ArrayList<Integer> factorials = getFactors(userInput);
    	if (factorials.size()<3) {
			System.out.println(userInput+" is a prime number.");
		} else {
			System.out.println(userInput+" is a NOT prime number.");
			System.out.println("It has "+factorials.size()+" factors: "+factorials);
		}
    }
    
    public static ArrayList<Integer> getFactors(int input) {
    	ArrayList<Integer> factors = new ArrayList<>();
    	for (int i = 1; i <= input; i++) {
			if (input%i==0) {
				factors.add(i);
			}
    	}
    	return factors;
    }
	
}
