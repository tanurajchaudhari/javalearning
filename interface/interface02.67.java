/*
interface  demo{

	static void fun(){
	
	
		System.out.println("In fun demo");
	
	}
        default void gun(){
	
		System.out.println("In gun demo");
	
       }
}
class client{

	public static void main(String[]args ){
	    demo.fun();
            


	}
}
*/
/*
interface demo{
	void gun();
	default void fun(){
		System.out.println("In fun demo");
	}
}
class demochild implements demo{
	public void gun(){
		System.out.println("In gun demochild ");
	}
}
class client{
	public static void main(String []args){
		demo obj=new demochild();
		obj.gun();
		obj.fun();
	}
}
*/




//************************************************************************
/*
interface A {
    default void run() {
        System.out.println("Run method from A");
    }
}

interface B {
    default void run() {
        System.out.println("Run method from B");
    }
}

// ✅ Solution: Override run() and specify which interface to use
class C implements A, B {
    @Override
    public void run() {
        A.super.run(); // ✅ Explicitly calling A's run()
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.run(); // ✅ Output: Run method from A
    }
}
*/
























