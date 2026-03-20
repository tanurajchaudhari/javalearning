//Lambda function 
//
/*
interface Core2Web{

	void lang();

}
class Year2022{

	public static void main(String[]args){
	
		Core2Web c2w=()->{
		
			System.out.println("Bootcamp/java/Python/OS");
		
		};
		c2w.lang();

	

	}
}
*/
/*
interface Core2Web{

        void lang(int x);

}
class Year2022{

        public static void main(String[]args){

                Core2Web c2w=(xy)->{

                        System.out.println("Bootcamp/java/Python/OS"+" : "+xy);

                };
                c2w.lang(8);



        }
}
*/

//>>>>>>>>>>>>>>>>>>Runnable interface with ananymouse innerclass>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*
class ThreadDemo{

	public static void main(String[]args){
	
		Runnable obj1=new Runnable(){
		
			public void run(){
			
				System.out.println(Thread.currentThread().getName());

			}
		
		
		};
                Runnable obj2=new Runnable(){

                        public void run(){

                                System.out.println(Thread.currentThread().getName());

                        }


                };
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	
	}

}
*/
/*
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>Runnable with lambda function>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
class ThreadDemo1{

	public static void main(String[]args){
	
		Runnable obj1=()->{
		
			System.out.println(Thread.currentThread().getName());
		};
		Runnable obj2=()->{
		
			System.out.println(Thread.currentThread().getName());
		};
                Thread t1=new Thread(obj1);
                Thread t2=new Thread(obj2);
                t1.start();
                t2.start();

	
	}

}
*/

/*
//>>>>>>>>>>>>>>>>>>>>>>>>Lambda function with comparator >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.*;
class Employee{

	int empID=0;
	String name=null;
	Employee(int empID,String name){
	
		this.empID=empID;
		this.name=name;

	}
	public String toString(){
	
		return empID+" :  "+name;

	
	}

}
class Demo{

	public static void main(String[]args){
	
		ArrayList al=new ArrayList();
		al.add(new Employee(33,"Tanuraj"));
		al.add(new Employee(45,"Sunny"));
		al.add(new Employee(23,"Sudarshan"));
		System.out.println(al);
		Collections.sort(al,(obj1,obj2)->{
		
			return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
		
	        	}
		);
		System.out.println(al);

	}
}
*/

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>forEach iterator lambda function  >>>>>>>>>>>>>>>>>>>>>>
import java.util.*;
class ArrayListDemo{

	public static void main(String[]args){
	
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(20);
		System.out.println(al);

 	/*	al.forEach((data)->{
		
			System.out.println(data);

		}); */
		al.forEach((data)->System.out.println(data));
	
	}
}
