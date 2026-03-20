//Creatin thread by using thread class 
class MyThread extends Thread{

	public void  run(){
            System.out.println("Thread name in run:-"+Thread.currentThread().getName());	
		for(int i=0;i<10;i++){
		
			System.out.println("IN run");
			try{
			  
				Thread.sleep(1000);
			} catch(InterruptedException ie){
			

			}
		}
	
	}

}
class ThreadDemo{

	public static void main(String[]args)throws InterruptedException{
		MyThread obj=new MyThread();
                 obj.start();
		 for(int i=0;i<10;i++){
			 System.out.println("In main");
			 Thread.sleep(2000);
		 }	
	}

}
