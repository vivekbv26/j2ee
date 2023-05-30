package ninth_java;
import java.util.*;

class VowelCounterThread extends Thread {

 @Override

 public void run() {

 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a word: ");

 String word = sc.next();

 int count = 0;

 for (char ch : word.toCharArray()) {
	 if(ch=='a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
		 count++;
	 }



 }

 System.out.println("\nVowel Count: " + count);

 }


}


