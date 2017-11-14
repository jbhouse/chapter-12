import java.util.ArrayList;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wizardItems = new ArrayList<>(4);
		wizardItems.add("wooden staff");
		wizardItems.add("wizard hat");
		wizardItems.add("cloth shoes");
		System.out.println("Command Menu\nshow - grab all itema\ngrab - grab an item\nedit - Edit an item\ndrop - Drop an item\nexit - Exit program");
		while(true) {
			String input = Console.getString("Enter a command: ");
			if(input.equals("show")) {
				for(String s : wizardItems) {
					System.out.println(wizardItems.indexOf(s)+1+". "+s);
				}
			}
			if(input.equals("grab")) {
				if(wizardItems.size()<4) {
					wizardItems.add(Console.getString("Name: "));
				}
			}
			if(input.equals("drop")){
				if(wizardItems.size()>0) {
					wizardItems.remove(Console.getInt("Number: ", 0, 5));
				}
			}
			if(input.equals("edit")) {
				int number = Console.getInt("Number: ");
				String updatedName = Console.getString("Updated item name: ");
				wizardItems.set(number, updatedName);
			}
			if(input.equals("exit")) {
				return;
			}
		}
	
	}

}
