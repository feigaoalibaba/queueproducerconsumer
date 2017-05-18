/**
 * 
 */
package com.bj58.queue;


/**
 * @author 58
 * 生产者
 */
public class Producer implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (true) {

			try {
				QueueUtil.queue.put("" + i++);
				/*
				if(i ==5000){
					throw new InterruptedException();
				}*/
			} catch (InterruptedException e) {
				System.out.println("=================");
				e.printStackTrace();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " Put data:"
					+ i + "  queue size: " + QueueUtil.queue.size());
		}

	}

}
