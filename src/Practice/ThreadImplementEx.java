package Practice;
 
public class ThreadImplementEx implements Runnable {
	public static void main(String[] args) {
		ThreadImplementEx Obj =new ThreadImplementEx();
		Thread thread = new Thread(Obj);
	    thread.start();
	    System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("this code is running in a thread");
	}
}




