/*
class parent{
int x=10;
	parent(){
	
		System.out.println("In parent constructor");
	
	}
	void access(){
	
		System.out.println("parent instance ");
	
	}


}
class child extends parent{
        int y=20;
	child(){
	
		System.out.println("In child constructor");
		System.out.println(x);
		System.out.println(y);
	}



} 
class client{

	public static void main(String[]args){
	child obj=new child();
	obj.access();


	
	
	}


}
*/
/*
class parent{
     static{
     
	     System.out.println("in parent static blocked 1");
     
     }
     static {
     
	     System.out.println("in parent static blocked 2");
     }

}
class child extends parent{

	static{
	
		System.out.println("in child static blocked 1");
	}
}
class client{
	public static void main(String[]args){
	
		child obj=new child();	
	}
}
*/
/*
class parent{

 static int x=10;
 static{
 
	 System.out.println("In parent static block");
 
 }
 static void access(){
 
	 System.out.println(x);
 }
}
class child extends parent{

	static{
	
		System.out.println("in child static blocked");
		System.out.println(x);
		access();
	}
}
class client{

	public static void main(String[]args){
	System.out.println("In main");
	child obj=new child();
	}
}
*/

