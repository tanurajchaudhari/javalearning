//methods in java
/*
class demo{
      public static void main(String [] args ){
   //   demo obj= new obj();
      fun();
      gun();






      }
     static void fun () {
        System.out.println("In fun method ");

      }
      void gun(){
          System.out.println("in gun method ");



      }

}


*/


/*
class demo{ 
       int x=10;
       static int y=20;
       
       void fun () {
		 System.out.println("In fun method ");                                                                                                                                                                                                                                                                                 }
       static  void gun(){
               System.out.println("in gun method ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       }  
      

	public static void main(String [] args ){  
             


	 demo obj= new demo();



                               
	      System.out.println(obj.x);
	      System.out.println(y);
	      obj.fun();
	       gun();                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }  
}
*/


/*
class demo1{

     int x=10;
     static int y=20;

     void fun(){
     
         System.out.println(x);
         System.out.println(y);

     
     }
     public static void main(String [] args){
     
         demo1 obj=new demo1();

	 obj.fun();


	 //System.out.println(x);
         //System.out.println(y);
     
     
     
     }



}
*/

/*
import  java.util.*;

class add{
       
        static void add(int a,int b){
	
	   int ans = a+b;
	   System.out.println("addition is :=  "+ans);

	
	
	}
	static void sub(int x,int y){
	
	  int ans =x-y;
	  System.out.println("Subtraction is :-" +ans);
	
	}

	static void mul(int s,int h){
	
	int ans = s*h;
	System.out.println("multipliacation is :- "+ans);
	
	}
	static void div(int x,int y){
	  int ans =x/y;
	  System.out.println("division is :- "+ ans);

	
	}



	public static void main(String[] args){
	
	Scanner sc = new Scanner (System.in);

        System.out.println("enter int values ");
        int a=sc.nextInt();	
	int b=sc.nextInt();
        add(a,b);
	sub(a,b);
	mul(a,b);
	div(a,b);


	
	
	}




}
*/
/*
class demo {
     void fun(int x){
        System.out.println(x);

     
     }
     public static void main(String []args){
     
       System.out.println("in main");
       demo obj =new demo();
       obj.fun();
       System.out.println("End main");

       
     
     
     }

}
*/

class demo{
	
         public static void main(String [] args ){
	 
	     demo obj = new demo();
             obj.fun(10);

	     obj.fun(10.5f);

	 
	 
	 }

         void fun(int x){
		 System.out.println("in fun methods ");
		 System.out.println(x);
	 
	 
	 
	 } 
	
}
