class parent {

	parent(){
	System.out.println(this);
	System.out.println("in parent constructor");
	
	}
	void parentProperty(){
	
	System.out.println("Flat,car,gold");
	}

}

class child extends parent{
	child(){
        
	        System.out.println(this);	
		System.out.println("In child constructor");
	}
}
class client{

	public static void main(String[]args){
	
	child obj2=new child();
	  System.out.println(obj2);
	obj2.parentProperty();
	
	}
}
