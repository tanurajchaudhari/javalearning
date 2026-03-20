/*
class parent{
	parent(){
		System.out.println("In parent constructor");
	}
	void fun(){
		System.out.println("parent fun");
	}
}
class child extends parent{
	child(){
	
		System.out.println("child constructor");
	}
	void fun(){
	
		System.out.println("child fun method ");
	}
}
class client {
	public static void main(String[]args){
		child obj=new child();
		obj.fun();
	}
}
*/
/*
class parent{
        parent(){
                System.out.println("In parent constructor");
        }
        void fun(int x){
                System.out.println("parent fun"+ x);
        }
}
class child extends parent{
        child(){

                System.out.println("child constructor");
        }

        void fun(){

                System.out.println("child fun method ");

        }
        void gun (){
	
		System.out.println("child gun method ");
	}
}
class client{
	public static void main(String[]args){
	 child obj=new child();

         obj.fun(10);

	 parent obj1=new parent();
	 //obj1.gun();
	}
}
*/
/*
class parent {
	void fun(int x){
	
		System.out.println("parent fun"+x);
	}
}
class child extends parent{
    void fun(float y){
	   
	System.out.println("child fun");
    }
}
class client{

	public static void main(String []args ){
	
	parent obj= new child();
	obj.fun(20.50f);
	}
}

*/

//****************************************for better understanding*******************************************
/*
class parent {
	parent(){
		System.out.println("In parent Constructor ");
	}
	void fun(int x){
		System.out.println("Fun method  parameter int X:-"+ x);
	}
	String fun(char ch){
		System.out.println("Fun method  parameter is char ch:-"+ ch);
		String x="tanuraj";
		return x;
	}
}
class child extends parent {

	child(){
	
		System.out.println("In Child COnstructor ");
	}
	void fun(String s){
	
		System.out.println("Fun method in child :-"+ s);   
	}
}
class client{

	public static void main(String []args ){
	
		parent obj=new child();
		//System.out.println(obj.fun("Chaudhari"));
		obj.fun("Chaudhari");
	}
}
*/

/*
class parent{

	parent(){
	
		System.out.println("In Parent constructor ");
	}
	void run(){
	
		System.out.println("Run method in parent having void return  type ");
	}

} 
class child extends parent{

	child(){
	
		System.out.println("In child constructor");
	}
	void run(){
	
		System.out.println("Run method in child class havin  chara para ");
		return "Tanuraj";
	}
        void run(int x){

                System.out.println("Run method in child class havin int para :-  "+x);
        }
}
class client{

	public static void main(String[]args){
	
		child obj=new child ();
		obj.run();
		//obj.run('D');
		//obj.run(3);
	}
}
*/
/*
class match{

	void match_type(){

		System.out.println("T20/OneDay/Test");
	}
}
class iplmatch extends match{

	void match_type(){
	
		System.out.println("T20");
	}
}
class TestWorldCup extends match{

	void match_type(){
	
		System.out.println("Test");
	}
}


class client{

	public static void main(String[]args ){
	
		match obj=new iplmatch();
		obj.match_type();
		match obj2=new TestWorldCup();
		obj2.match_type();
	}
}
*/
/*
class demo{

	void fun(String str){
	
		System.out.println("String");

	}
	void fun(StringBuffer str1){
	
		System.out.println("String Buffer");
	}

}
class client {

	public static void main(String[]args){
	
		demo obj=new demo();
		obj.fun("Core2Web");
		obj.fun(new StringBuffer("Incubator"));
	        StringBuffer obj1=new StringBuffer("Tanuraj");
		obj.fun(obj1);
	}
}
*/



class parent{

	Object  fun(){
	
		return new Object();
	}

}
class child extends parent{

	String fun(){
	
		return new String();
	}
}
class client{

	public static void main(String[]args){
	parent obj=new parent();
	Systemn();
	}
}

