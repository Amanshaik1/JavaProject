package Practice;


public class ThreadConcurrencyEx extends Thread {
	public static int amount = 0;
	
	public static void main(String[] args) {
	ThreadConcurrencyEx thread = new ThreadConcurrencyEx();
	thread.start();
	while(thread.isAlive()){
		System.out.println("waiting");
	}
	System.out.println("Main :" + amount);
	amount++;
	System.out.println("Main :" + amount);
	}
	public void run() {
		amount++;
	}
}
