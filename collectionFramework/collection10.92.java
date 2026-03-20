/*
import java.util.concurrent.*;
class BlockingQueueDemo{

	public static void main(String[]args)throws InterruptedException{
	
		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		System.out.println(bQueue);
		bQueue.put(40);               //Blocked Thread
		System.out.println(bQueue);	
	}
}
*/

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
class BlockingQ{

	public static void main(String[]args)throws InterruptedException{
	
		BlockingQueue bq=new ArrayBlockingQueue(3);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		System.out.println(bq);
		bq.offer(40,5,TimeUnit.SECONDS);

		bq.take();
		System.out.println(bq);

		ArrayList al= new ArrayList();
		System.out.println("Array list "+al);
		bq.drainTo(al);
		//System.out.println()
		System.out.println("Array list "+al);


		
	}
}
/*
import java.util.*;
import java.util.concurrent.*;
class BlockingQueueDemo{

	public static void main (String[]args)throws InterruptedException{
	
		BlockingQueue bq=new LinkedBlockingQueue(3);
		bq.put(10);
		bq.put(20);
		bq.put(30);
	        System.out.println(bq);
		bq.offer(40,5,TimeUnit.SECONDS);
		System.out.println(bq);
		bq.take();
		System.out.println(bq);
		ArrayList al=new ArrayList();
		System.out.println("ArrayList"+al);
		bq.drainTo(al);
		System.out.println("ArrayList"+al);
		System.out.println(bq);


	}

}
*/
/*
import java.util.*;
import java.util.concurrent.*;
class BlockingQueueDemo{

        public static void main (String[]args)throws InterruptedException{

                BlockingQueue bq=new LinkedBlockingQueue();
                bq.put(10);
                bq.put(20);
                bq.put(30);
                System.out.println(bq);
                bq.offer(40,5,TimeUnit.SECONDS);
                System.out.println(bq);
                bq.take();
                System.out.println(bq);
                ArrayList al=new ArrayList();
                System.out.println("ArrayList"+al);
                bq.drainTo(al);
                System.out.println("ArrayList"+al);
                System.out.println(bq);


        }

}
*/
/*
//Produce Consumer Problem
//
import java.util.concurrent.*;
class Producer implements Runnable{
	BlockingQueue bq=null;
	Producer(BlockingQueue bq){
	
		this.bq=bq;

	}
	public void run(){
	
		for(int i =1;i<=10;i++){
		
			try{
			
				bq.put(i);
				System.out.println("Produce :"+i);

			}catch(InterruptedException ie){
			
			}

			///*try{
			
			//	Thread.sleep(1000);
			
			//}catch (InterruptedException ie){
			//}
		}
	}
}
class Consumer implements Runnable{

	BlockingQueue bq=null;
	Consumer(BlockingQueue bq){
	
		this.bq=bq;
	}

	public void run(){
	for(int i=1;i<=10;i++){
	
		try{
		
			bq.take();
			System.out.println("Consume :"+i);
		}catch(InterruptedException ie){
		
		}

		///*try{
		
			//Thread.sleep(1000);

		//}catch(InterruptedException ie){
		
		//}
	
	}
  }
}
class ProducerConsumerBQDemo{
	public static void main(String[]args){
	
		BlockingQueue bq=new ArrayBlockingQueue(10);
		Producer produce =new Producer(bq);
		Consumer consume=new Consumer(bq);
		Thread pThread=new Thread(produce);
		Thread cThread=new Thread(consume);
		pThread.start();
		cThread.start();	
	}

}
*/


































