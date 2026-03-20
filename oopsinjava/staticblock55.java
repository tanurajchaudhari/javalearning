/*
class demo{
	static {
	 System.out.println("Static blocked 1 in demo ");
	}
      	public static void main(String[]args){
	System.out.println(" main in demo class ");
	}
}
class client{
  static {
    System.out.println("Static blocked 2 in client");
  }        
    public static void main(String []args){
   System.out.println("main inclient class");
      //demo obj=new demo();
   }
  static {
  System.out.println("Static blocked  3 in ckient class");
}
}
*/
/*

class one{
        static {
         System.out.println("Static blocked 1 in demo ");
        }
       public static void main(String[]args){
        System.out.println(" main in demo class ");
        }
}
class two{
  static {
    System.out.println("Static blocked 2 in client");
  }
  public static void main(String[] args){
   System.out.println("main inclient class");
   }
  static {
  System.out.println("Static blocked  3 in ckient class");
}
}
*/

/*
class demo{
    static int x=10;
    //not aloowed
    static {
    
      //static int y=20;
    
    } 
    //not allowed
    static void fun(){    
	    static int z=20;
    }
    //not allowed
   void gun(){
   
   static int d=40;

   }

} 
*/

//instance block
//
/*
class instancedemo{

     int x=100;
      
     static{
      System.out.println("Static blocked");
     
     }
      instancedemo(){
      
      System.out.println("Constructor ");
      
      }
      {
      
      
      System.out.println("Instance blocked ");
      
      } 

      public static void main(String[]args){
      
        instancedemo obj=new instancedemo();
	System.out.println("In Main");

      
      }
      {
      
       System.out.println("Instance blocked 2");
      
      }
}
*/

/*
 Sequence of initialztions
 1. static variable
 2.static blocked
 3.static method
 4.inscetance var
 5.incstance blocked
 6constructor
 7.instance method
 */


class demo1{

	int x=10;
	 static int y=20;
	demo1() {
	  System.out.println("In constructor");
	
	} 

	static {
	System.out.println("In static blocked 1");
	}
	{
	System.out.println("In instance blocked 1");
	} 

	public static void main(String[]args){
	System.out.println("In main");
	demo1 obj=new demo1();

	
	} 

	static{
	
	System.out.println("In  static blocked 2");
	
	}
	{
	System.out.println("In  instance blocked 2");
	
	}
         
}

