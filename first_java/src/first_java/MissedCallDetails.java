package first_java;
import java.util.*;
public class MissedCallDetails {
	Calendar cal;
	String telno;
	String name;
	MissedCallDetails(Calendar x, String y, String z){
	cal = x;
	telno = y;
	name = z;
	}
	void display(){
	System.out.println("Current time: "+ cal.getTime());
	System.out.println("Telephone number: "+telno);
	System.out.println("Name: "+name);
	}

}
