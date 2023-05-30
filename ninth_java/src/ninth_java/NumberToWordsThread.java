package ninth_java;

import java.util.Scanner;

class NumberToWordsThread extends Thread {

 @Override

 public void run() {

 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter a number with at least 4 digits: ");

 int num = scanner.nextInt();

 String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

 if (num < 1000) {

 System.out.println("The number must have at least 4 digits.");

 } else {

 String numStr = Integer.toString(num);

 System.out.println("The number in words is: ");

 for (char digit : numStr.toCharArray()) {

 System.out.print(words[Character.getNumericValue(digit)] + " ");

 }

 System.out.println();

 }

 }

}

