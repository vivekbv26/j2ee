package ninth_java;

public class MultiThreadedExample {

	 public static void main(String[] args) {

	 NumberToWordsThread numberToWordsThread = new NumberToWordsThread();

	 VowelCounterThread vowelCounterThread = new VowelCounterThread();

	 numberToWordsThread.start();
	 try {
		numberToWordsThread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	 try {

	 numberToWordsThread.join();

	 } catch (InterruptedException e) {

	 e.printStackTrace();

	 }

	 vowelCounterThread.start();

	 try {

	 vowelCounterThread.join();

	 } catch (InterruptedException e) {

	 e.printStackTrace();

	 }

	 }

	}

