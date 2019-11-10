package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task>TaskQueue;
public Worker() {
	// TODO Auto-generated constructor stub
	ConcurrentLinkedQueue<Task> TaskQueue = new ConcurrentLinkedQueue<Task>();
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (TaskQueue != null) {
		TaskQueue.remove();
		
		}
	}


}
