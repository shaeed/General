import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class TstRunnable implements Runnable{
	private final String taskName;
	private static int threadNumber;
	
	public TstRunnable() {
		this("untitled");
	}
	
	public TstRunnable(String task) {
		threadNumber++;
		taskName = task + ": " + threadNumber;
	}
	
	@Override
	public void run() {
		//Thread will execute all these statements.
		System.out.println("Runnning the task: " + taskName);
	}
	
}

//Create and run the thread
public class TstThread1 {
	public static void main(String[] args) {
		//Create the threads
		System.out.println("Creating the threads:");
		Thread thread1 = new Thread(new TstRunnable());
		Thread thread2 = new Thread(new TstRunnable("thread2"));
		Thread thread3 = new Thread(new TstRunnable("thread3"));
		Thread thread4 = new Thread(new TstRunnable("thread4"));
		Thread thread5 = new Thread(new TstRunnable("thread5"));
		Thread thread6 = new Thread(new TstRunnable("thread6"));
		//Thread thread3 = new Thread(new )
		
		//Starting the threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		System.out.println("Threads started");
		
		//Thread management with Executor
		TstRunnable task1 = new TstRunnable();
		TstRunnable task2 = new TstRunnable("task2");
		TstRunnable task3 = new TstRunnable("task3");
		TstRunnable task4 = new TstRunnable("task4");
		TstRunnable task5 = new TstRunnable("task5");
		TstRunnable task6 = new TstRunnable("task6");
		TstRunnable task7 = new TstRunnable("tas7");
		
		//Create the executor service to manage the threads.
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		
		//Start threads and place the in runnable state
		threadExecutor.execute(task1);
		threadExecutor.execute(task2);
		threadExecutor.execute(task3);
		threadExecutor.execute(task4);
		threadExecutor.execute(task5);
		threadExecutor.execute(task6);
		threadExecutor.execute(task7);
		
		System.out.println("Main ends.");
		
	}
}
