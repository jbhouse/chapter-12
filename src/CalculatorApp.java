//import java.util.ArrayList;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stack Calculator.\n");
		System.out.println("Commands: push n, add, sub, mult, div, clear, or quit.\n");
		String userInput = "";
		StackCalculator newCalculator = new StackCalculator();
		while (!userInput.equals("exit")) {
			double[] currentStack = newCalculator.getValues();
			for (int i = currentStack.length-1; i >= 0; i--) {
				System.out.println(currentStack[i]);
			}
			userInput = Console.getString("stack> ");
			switch(userInput) {
				case "add":
					System.out.println("Size: "+newCalculator.size());
					if (newCalculator.size()>1) {
						newCalculator.add();
						continue;
					} else {
						System.out.println("You must have at least two valuees to perform addition");
						continue;
					}
				case "mult":
					if (newCalculator.size()>1) {
						newCalculator.multiply();
						continue;
					} else {
						System.out.println("You must have at least two valuees to perform multiplication");
						continue;
					}
					
				case "sub":
					if (newCalculator.size()>1) {
						newCalculator.subtract();
						continue;
					} else {
						System.out.println("You must have at least two valuees to perform subtraction");
						continue;
					}
					
				case "div":
					if (newCalculator.size()>1) {
						newCalculator.divide();
						continue;
					} else {
						System.out.println("You must have at least two valuees to perform division");
						continue;
					}
					
				case "clear":
					newCalculator.clear();
					continue;
				case "push":
					newCalculator.push(Console.getDouble("What number would you like to add? : "));
					continue;
				case "quit":
					continue;
			}
		}
		
		System.out.println("Thanks for using the Stack Calculator");
		
	}

}
