package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task>TaskQueue;
public Worker(ConcurrentLinkedQueue<Task> TaskQueue) {
	// TODO Auto-generated constructor stub
	this.TaskQueue = TaskQueue;
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!TaskQueue.isEmpty()) {
		TaskQueue.remove().perform();
		}
	}


}
