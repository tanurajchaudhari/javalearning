/*
class MyThread extends Thread {
	MyThread(ThreadGroup tg,String str){
	
		super(tg,str);
	
	}

	public void run(){
	
		System.out.println(Thread.currentThread());
		try{
		
			Thread.sleep(5000);
		}catch(InterruptedException ie){
		
			System.out.println(ie.toString());

		}
	}

}
class ThreadGroupDemo{

	public static void main(String[]args)throws InterruptedException{
	
		ThreadGroup pThreadGP=new ThreadGroup("India");
		
		MyThread t1=new MyThread(pThreadGP,"Maharashtra");
                MyThread t2=new MyThread(pThreadGP,"Goa");
		t1.start();t2.start();
	
	        ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"Pakistan");
                
	        MyThread t3=new MyThread(cThreadGP,"KArachi");
                MyThread t4=new MyThread(cThreadGP,"lahore");
                t3.start();t4.start();

                ThreadGroup cThreadGP2=new ThreadGroup(pThreadGP,"Bangladesh");

                MyThread t5=new MyThread(cThreadGP2,"Dhaka");
                MyThread t6=new MyThread(cThreadGP2,"mirpur");
                t5.start();t6.start();
                cThreadGP.interrupt();
		System.out.println(pThreadGP.activeCount());
		System.out.println(pThreadGP.activeGroupCount());
	       
	}

}
*/

/*
class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());

	
	try{
	
		Thread.sleep(5000);
	} catch(InterruptedException ie){
	
		System.out.println(ie.toString());
	}
   }
}

class ThreadGroupDemo{

	public static void main(String[]args){
	
		ThreadGroup pThreadGP=new ThreadGroup("India");
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(pThreadGP,obj1,"Maharashtra");
		Thread t2=new Thread(pThreadGP,obj2,"Goa");
                
		t1.start();t2.start();
	       	ThreadGroup cThreadGP=new ThreadGroup(pThreadGP,"pakistan");
		MyThread obj3=new MyThread();
		MyThread obj4=new MyThread();

		Thread t3=new Thread(cThreadGP,obj3,"Karachi");
		Thread t4=new Thread(cThreadGP,obj4,"Lahore");
                t3.start();
		t4.start();	
	}

}
*/

//Thread POOL

import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
		
	MyThread(int num){
	
		this.num=num;

	
	
	}
	
	public void run(){
	
		System.out.println(Thread.currentThread()+"Start Thread "+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"End Thread "+num);
	        
	}
        void dailyTask(){
		try{
			Thread.sleep(5000);
		}catch (InterruptedException ie){
		
		}
	}
}
class ThreadPoolDemo{
	public static void main(String[]args){
	ExecutorService ser =Executors.newFixedThreadPool(5);
	for(int i=1;i<=10;i++){
		MyThread obj=new MyThread(i);
		ser.execute(obj);
	}
	ser.shutdown();
	}
}














