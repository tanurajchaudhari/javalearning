/*
class parent{

	int x=10;
	static int y=20;

	parent(){
	
		System.out.println("parent constructor");
	}
	void fun(){
		System.out.println("parent fun method");
	
	}
	static void run(){
	
		System.out.println("static run ");
	}
}
class child extends parent{
	void gun(){
	
		System.out.println("Gun method");
	}
}
class client{
	public static void main(String[]args){
	       	parent pobj=new parent();
                
		child obj=new child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
                obj.run();	
	}
}
*/

class parent{
	int x=10;
	static int y=20;
	parent(){
	
		System.out.println("Parent ");
	}
}
class child extends parent{
	int x=100;
	static int y=200;
	child(){
		System.out.println("child");
	}
	void access(){
	        System.out.println(this);
		System.out.println(super.y);
		System.out.println(this.x);
		System.out.println(parent.y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(this.x);
                System.out.println(this.y);
	}
}
class client{
	public static void main(String[]args){
	child obj=new child();
	obj.access();
	}
}

