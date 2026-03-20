/*
class MyThread extends Thread{


	MyThread (String str){
	
		super(str);

	} 
	public void run(){
	
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}

}
class ThreadDemo{

	public static void main(String args[]){
	
		MyThread obj=new MyThread("XYZ");
		obj.start();

	
	}
}
*/
/*
class MyThread extends Thread{
	MyThread (ThreadGroup tg,String str){
		super(tg,str) ;
	} 
	public void run(){
		System.out.println(Thread.currentThread());        
	}
}

class ThreadGroupDemo{

	public static void main(String [] args){
	
		ThreadGroup pThreadGP = new ThreadGroup("Core2Web");
	        
		ThreadGroup qThreadGP = new ThreadGroup("Incubator");
		ThreadGroup rThreadGP = new ThreadGroup("Biencaps");

		MyThread obj1=new MyThread (pThreadGP,"C");
		MyThread obj2=new MyThread (qThreadGP,"java");
		MyThread obj3=new MyThread (rThreadGP,"python");
	        

         
                obj1.start();
		obj2.start();
		obj3.start();

	}

} 

*/

/*
class MyThread extends Thread{

        MyThread(){
	
		
	}
        MyThread (String str){

                super(str);

        }
        public void run(){

                System.out.println(getName());
                System.out.println(Thread.currentThread().getThreadGroup());
        }

}
class ThreadDemo{

        public static void main(String args[]){

                MyThread obj=new MyThread("XYZ");
                obj.start();
               
	       	MyThread obj1=new MyThread("PQR");
                obj1.start();
	       
	       	MyThread obj2=new MyThread();
                obj2.start();

        }
}
*/











