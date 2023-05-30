package first_java;
import java.util.*;
public class DataBaseCallers {
	public static HashMap<String, String> contacts = new HashMap<String, String>();
	static void createEntry(){
	contacts.put("8197052710", "Shreya");
	contacts.put("8179404003", "Nishitha");
	contacts.put("6362688458", "Dhatvik");
	contacts.put("8660937838", "Ankith");
	contacts.put("8867196217", "Kavan");
	}
	static void display(){
	System.out.println("\tDATABASE CALLERS\t\n");
	System.out.println(contacts);
	}

}
