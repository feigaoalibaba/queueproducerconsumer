/**
 * 
 */
package com.bj58.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author 58
 * 
 * 实现10个线程，三个线程向队列里写数据，七个线程从队列里取数据。写满如何处理，对队列长度进行一个限制。
 *
 */
public class QueueUtil {
	
	static int capacity = 50; 

	static BlockingQueue<Object>  queue = new LinkedBlockingDeque<Object>(QueueUtil.capacity);
	
	
	public static void main(String[] args) {

		for(int i=0; i< 3; i++)
		new Thread(new Consumer()).start();//启动一个新的线程
		
		for(int j =0; j< 7; j++)
		new Thread(new Producer()).start();
		
	
		
	}
	

}