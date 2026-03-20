/*
abstract class parent{
	void  carrer(){
	
		System.out.println("doctor");
	
	}
	abstract void marry();
}
class child extends parent{
	void marry(){
	
		System.out.println("Love marriage");
	}
}

class client{
	public static void main(String[]args){  
	      // parent obj=new parent();          //error
               child obj2=new child(); 
                obj2.marry();obj2.carrer();	       //error 
              child obj=new child();
	
	}
}
*/
/*
abstract class parent{
        void  carrer(){

                System.out.println("doctor");

        }
        abstract void marry();

}
class child extends parent{
        void marry(){

                System.out.println("Love marriage");
        }
}
class client{
        public static void main(String[]args){
               parent obj=new child();
	       obj.carrer();
	       obj.marry();	       
	}
}
*/
/*
abstract class parent{
        void  carrer(){

                System.out.println("doctor");

        }
       private  abstract void marry();
}
class child extends parent{
        void marry(){
                System.out.println("Love marriage");
        }
}
class client{
        public static void main(String[]args){          
               child obj=new child();
    }
}

*/
/*
class singleton{
   private singleton(){
	   System.out.println("constructor");  
   }
}
class client{
	public static void main(String[]args){
	
	
		singleton obj1=new singleton();
		singleton obj2=new singleton();
		singleton obj3=new singleton();
		singleton obj4=new singleton();
	}


}

*/
/*

class Singleton{

       static Singleton obj=new Singleton();
        
	private Singleton (){
	
		System.out.println("Constructor");
	}
	static Singleton getObject(){
		return obj;
	}
}
class client{
	public static void main(String[]args){
	
		Singleton obj1=Singleton.getObject();
		System.out.println(obj1);

                Singleton obj2=Singleton.getObject();
                System.out.println(obj2);


                Singleton obj3=Singleton.getObject();
                System.out.println(obj3);
	}
}
*/


























