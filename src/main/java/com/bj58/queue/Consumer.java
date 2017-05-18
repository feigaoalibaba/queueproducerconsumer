/**
 * 
 */
package com.bj58.queue;

/**
 * @author 58
 * 消费者
 */
public class Consumer implements Runnable {

	@Override
	public void run() {
		
		while(true ){
			String str = null;
			try {
				str = (String) QueueUtil.queue.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" get data "+str +" queue 剩余数据量为："+ QueueUtil.queue.size());
			
		}
		
	}

}
