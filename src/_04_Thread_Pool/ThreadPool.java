package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task>TaskQueue;

	public ThreadPool(int totalThreads) {
		// TODO Auto-generated constructor stub
		threads = new Thread[totalThreads];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new Worker(TaskQueue));
		}
		TaskQueue = new ConcurrentLinkedQueue<Task>();
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		TaskQueue.add(task);
		
		
	}
	public void start() {
		// TODO Auto-generated method stub
	for (int i = 0; i < threads.length; i++) {
		threads[i].start();
		
	}
	for (int i = 0; i < threads.length; i++) {
		try {
			threads[i].join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
