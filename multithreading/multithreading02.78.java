//do not do this code 
/*
class  MyThread extends Thread{

	public void run(){
	
		System.out.println("In run");
		System.out.println("MyThread : "+ Thread.currentThread().getName());

	
	}
	public void start(){
	
		System.out.println("In mythread start ");
		run();

	}


}
class ThreadDemo{

	public static void main(String []args){
	
		MyThread obj=new MyThread ();
		obj.start();
		System.out.println(Thread.currentThread().getName());
	
	
	}
}
*/
/*
class Demo extends Thread{
	public  void run() {
		System.out.println("Demo : "+Thread.currentThread().getName());
	}
}
class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread : "+Thread.currentThread().getName());
		Demo obj=new Demo ();
		obj.start();
	}
}
class ThreadDemo{
	public static void main(String[]args){
		System.out.println("ThreadDemo : "+Thread.currentThread().getName());
		MyThread obj =new MyThread();
		obj.start();
	}
}
*/

//creadting child thread Using runable interface
/*
class MyThread implements Runnable { 
	public void run(){
		System.out.println("In Run method ");
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String[]args){
		MyThread obj=new MyThread ();
		Thread t=new Thread(obj);
		t.start();
		try{
			t.join();
		}catch(InterruptedException ie){
		
			System.out.println("Exception is : "+ ie.getMessage());
		}
                System.out.println(Thread.currentThread().getName());
	}
}
*/
/*
//
class demo{
//200 methods 

}
class MyThread extends demo  implements Runnable {

        public void run(){

                System.out.println("In Run method ");
                System.out.println(Thread.currentThread().getName());


        }


}
class THreadDemo{

        public static void main(String[]args){

                MyThread obj=new MyThread ();
                Thread t=new Thread(obj);
                t.start();
                System.out.println(Thread.currentThread().getName());

        }
}
*/

//Priority in threads
//
class MyThread extends Thread{

	public void run(){
	
		Thread t =Thread.currentThread();
                t.setPriority(10);
		System.out.println(t.getPriority());

	
	}

}
class ThreadDemo{

	public static void main(String[]args){
	
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread obj=new MyThread();
		obj.start();

		t.setPriority(7);

		MyThread obj2=new MyThread();
		obj2.start();
	
	}
}

