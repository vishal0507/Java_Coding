
public class ChildThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//Thread.yield(); // It will move from running state it will be yeild.
			try {
				Thread.sleep(10000);
				System.out.println("Child Thread " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
