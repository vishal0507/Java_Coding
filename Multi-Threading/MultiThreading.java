
public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread ct = new ChildThread();
		ct.setPriority(1); // the default priority is .
		ct.start(); // It will start the new thread.
//		ct.join(); //after the ct execution only the main thread will work until that main thread will stop.
//		System.out.println(ct.getState()); // based on thread-life cycle..
//		System.out.println("Default Thread Name " + ct.getName());
//		ct.setName("Customer");
//		System.out.println("Customize Thread Name " + ct.getName());
//		ct.setPriority(1); // Priority should between 1 to 10 . Else there will be n Illegal Exception
//							// occur.
		ct.interrupt();  //it will make the sleep method to call.
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread " + i);
		}
		System.out.println(ct.getState());
	}
}
