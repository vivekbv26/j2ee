package first_java;
import java.util.*;

public class Main {
	
	static LinkedList<MissedCallDetails> amiss = new LinkedList<MissedCallDetails>();
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	DataBaseCallers.createEntry();
	DataBaseCallers.display();
	while(true){
	Scanner sc = new Scanner(System.in);
	System.out.println("\tMenu:\n");
	System.out.println("1. Add miss call\n 2.Delete number\n 3.Display\n 4. Exit\n");
	System.out.println("Enter your choice:");
	int ch = sc.nextInt();
	switch(ch){
	case 1: System.out.println("Enter the missed call telephone number: ");
	Calendar cal = Calendar.getInstance();
	System.out.println("Enter telephone number: ");
	String telnox = sc.next();
	String name;
	if(DataBaseCallers.contacts.containsKey(telnox))
	name = DataBaseCallers.contacts.get(telnox);
	else
	name = "Private caller";
	MissedCallDetails ob = new MissedCallDetails(cal, telnox, name);
	if(amiss.size() == 5)
	amiss.removeLast();
	amiss.addFirst(ob);
	System.out.println("\t Missed Call Details");
	Iterator<MissedCallDetails> it = amiss.iterator();
	while(it.hasNext()){
	MissedCallDetails i = it.next();
	System.out.println("------------------------------");
	i.display();
	}
	break;
	case 2: System.out.println("Enter number to be deleted in MissedCallDetails");
	String phno = sc.next();
	Iterator <MissedCallDetails> it1 = amiss.iterator();
	boolean flag = false;
	while(it1.hasNext()){
	MissedCallDetails ob1 = it1.next();
	if(ob1.telno.equals(phno)){
	flag = true;
	amiss.remove(ob1);
	break;
	}
	}
	if(flag == true)
	System.out.println("Phone number deleted");
	else
	System.out.println("Phone number does not exists");
	break;
	case 3: System.out.println("\tMissed Call Details\n");
	Iterator<MissedCallDetails> it2 = amiss.iterator();
	while(it2.hasNext()){
	MissedCallDetails i = it2.next();
	System.out.println("----------------------------");
	i.display();
	}
	break;
	default: return;
	}
	}
	}

}
