# queueproducerconsumer

知识点：多线程的使用 , java队列的使用。经典生产者、消费者模型。

此处实现了一个10个线程，三个线程向队列里写数据，七个线程从队列里取数据。

扩展：
可以详细分析下ArrayBlockingQueue的实现原理，由于该并发集合其底层是使用了java.util.ReentrantLock 和 java.util.Condition 来完成并发控制的，我们可以通过JDK的源代码更好的学习并发控制类的使用，同时该类也是所有并发集合中最简单的一个，分析该类的源码为之后分析其他并发集合做好基础。

	Java提供了下面7种阻塞队列，区别于底层数据结构的不同：
		ArrayBlockingQueue ：一个由数组结构组成的有界阻塞队列。
		LinkedBlockingQueue ：一个由链表结构组成的有界阻塞队列。
		PriorityBlockingQueue ：一个支持优先级排序的无界阻塞队列。
		DelayQueue：一个使用优先级队列实现的无界阻塞队列。
		SynchronousQueue：一个不存储元素的阻塞队列。
		LinkedTransferQueue：一个由链表结构组成的无界阻塞队列。
		LinkedBlockingDeque：一个由链表结构组成的双向阻塞队列。

阻塞队列的接口是：java.util.concurrent.BlockingQueue，主要提供了以下存取方法（根据队列空或者满时的响应方式，可分成3类）

    方法\处理方式         返回特殊值       超时返回特殊值          一直阻塞    抛出异常
    插入                  offer(e)        offer(e,time,unit)      put(e)     add(e)
    移除                  poll()          poll(time,unit)         take()     remove()
    读取                  peek()          无                       无        element()
