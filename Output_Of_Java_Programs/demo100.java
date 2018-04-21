package Output_Of_Java_Programs;

/*OUTPUT

main has started
Thread-1 has started
Thread-1 has ended
main has ended
 
*/
public class demo100 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " has started");
		 
        Thread thread1 = new Thread(new MyRunnable5(), "Thread-1");
        thread1.start();
        thread1.sleep(10000); 
        System.out.println(Thread.currentThread().getName() + " has ended");

	}

}
class MyRunnable5 implements Runnable {
    public void run() {
 
           System.out.println(Thread.currentThread().getName() + " has started");
           try {
                  Thread.sleep(100); //ensure that main thread don’t complete before Thread-1
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName() + " has ended");
 
    }
}