
public class ContactApp {

	public static void main(String[] args) {
		Console.printToConsole("Welcome to the Contact List application");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			String fName = Console.getString("Enter first name:  ");
			String lName = Console.getString("Enter last name:   ");
			String email = Console.getString("Enter email:       ");
			String phone = Console.getString("Enter phone:       ");
			
			Contact contact = new Contact(fName,lName,email,phone);
			
			
			
			Console.printToConsole(contact.displayContact());
			
			choice = Console.getString("Continue?(y/n) :");
		}

		Console.printToConsole("Bye!");
	}

}
