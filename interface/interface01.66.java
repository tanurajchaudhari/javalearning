/*
interface demo{
	void fun();
        void gun();
}
class demochild implements demo{
	public void fun(){
		System.out.println("in fun");
	}
	public void gun(){
		System.out.println("in gun");
	}
}
class Client{
	public static void main(String[]args){
           demo obj=new demochild();
	   obj.fun();
	   obj.gun();
	}
}
*/
/*

interface demo{
        void fun();
        void gun();
}   
class demochild implements demo{
        public void fun(){
    		System.out.println("in fun");
        }
        public void gun(){
                System.out.println("in gun");
        }
}
class Client{
        public static void main(String[]args){
           demo obj=new demochild();
           obj.fun();
           obj.gun();
        }
}
*/

// multiple inheritance in java
//
/*
interface demo1{
     void fun();
}
interface demo2{
	void fun();
}
class demochild implements demo1,demo2{
	public void fun(){
		System.out.println("In fun child");
	}
}
class client{
	public static void main(String[]args){
		demo1 obj1=new demochild();
		obj1.fun();
		demo2 obj2=new demochild();
		obj2.fun();
	}
}
*/

interface demo{

//        void fun();
	default void fun(){
	
		System.out.println("interface deault modifier ");
	
        }  
        static void run(){
	

	
	
	}

}

/*
interface Demo1{

	static void m1(){
	
		System.out.println("Demo -m1");
	}
}
interface Demo2{

	static void m1(){
	
		System.out.println("Demo2-m1");
	}
}
interface DemoChild  extends Demo1,Demo2{

	public static void main(String[]args){
	
		Demo1 obj=new DemoChild();
		obj.m1();
	}
}
*/
