package Output_Of_Java_Programs;

public class demo95 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("In main() method");
        MyRunnable1 runnable=new MyRunnable1();
        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("end main() method");

	}

}
class MyRunnable1 implements Runnable{
    public void run(){
           for(int i=0;i<3;i++){
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}

/*In main() method
i=0 ,ThreadName=Thread-0
i=1 ,ThreadName=Thread-0
i=2 ,ThreadName=Thread-0
i=0 ,ThreadName=Thread-1
i=1 ,ThreadName=Thread-1
i=2 ,ThreadName=Thread-1
end main() method*/