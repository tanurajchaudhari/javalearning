/*
class outer {

	class inner{
	
	
	
      }



}
*/
/*
class outer{
	class inner {	
		void m1(){
			System.out.println("Inner m1");
		}
	}
	void m2(){
		System.out.println("outer m2");
	}
	public static void main(String[]args){
		inner obj=new outer ().new inner();
		obj.m1();
		//obj.m2();
		outer obj1=new outer();
		obj1.m2();
	}
}

*/


//method local inner class 
/*
class outer{
	void m1(){
		System.out.println("in m1 outerclass");
		class Inner{
			void m1(){
				System.out.println("In m1 innerclass");
			}
		}
	        Inner obj=new Inner ();
		obj.m1();
	}
        void m2(){
		System.out.println("In m2 -outer");
	}
	public static void main(String[]args){
		outer obj=new outer ();
		obj.m1();
		obj.m2();
	}
}
*/

//Static Nested /Static  Inner Class 
/*
class  Outer {
	void m1(){
		System.out.println("In m1 outer ");
	}
        static class  Inner{
		void m1(){
			System.out.println("In m1 Innner class  ");
		}
	}
}
class client{
	public static void main(String[]args){
		Outer.Inner obj=new Outer.Inner();
               obj.m1();
	}
}
*/
/*
class parent {

	int x=10;
	static int y=20;
	void m1(){
	
		System.out.println("In parent m1");
	}
	static void  m2(){
	
		System.out.println("In parent m2");
	}
	parent(){
	
		System.out.println("In constructor parent");
	}
}
class child extends  parent{

	int a =15;
	static int b=60;
	child(){
	
		System.out.println("In - constructor child ");
	}
	void m1(){
	
		System.out.println("In m1 child ");
	}
	static void m3(){
	
		System.out.println("in m3 child ");
	}
}
class client{

	public static void main(String[]args){
	
		parent obj=new  parent();
		obj.m1();
		child obj2=new child();
		obj2.m1();
		obj2.m3();
		parent obj3=new child();
		obj3.m1();
		obj3.m2();
		obj3.m3();
	}
}
*/
/*
class parent{

	int x=10;
	void m1(){
	
		System.out.println("In parent m1");
	}

}
class child extends parent{

	int a=20;
	void m1(){
	
		System.out.println("In child m1");
	}
}
class demo{

	demo(parent p){
	
		System.out.println("In Constructor - Parent ");
		p.m1();

	} 
	demo(child c){
	
		System.out.println("In Constructor  - Child ");
		c.m1();

	}
	public static void main(String []args ){
	
		demo obj1=new demo(new  parent());
		demo obj2=new demo(new child());

	}
}
*/
//****** 5 * code
/* 
class parent{

	parent(){
	
		System.out.println("In parent constructor ");
	}
        demochild m1(){
	
		System.out.println("In parent m1");
		return new demochild();
	}
}
class demo{

	demo(){
	
		System.out.println("/in constructor demo");
	}

}
class demochild extends demo{

	demochild(){
	
		System.out.println("In parent - constructor ");
	}
	demo m1(){
	
		System.out.println("In m1 parent");
		return new demo();

	}
}
class child extends parent{

	child(){
	
		System.out.println("In constructor - child ");
	}
	 demochild m1(){
	 
		 System.out.println("In m1- child ");
		 return new demochild();

	 }
}
class client{

	public static void main(String[]args ){
	
		parent p=new child();
		p.m1();

	}
}
*/

