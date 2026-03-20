/*
class demo{
    int x=10;
    static int y=20;

    void fun1(){
     System.out.println(x);
     System.out.println(y);
    }
    static void fun2(){
       System.out.println(y);
    }
}
class client{
  
	public static void main(String[]args){
	  demo obj=new demo();
	  obj.fun1();
	  obj.fun2();
         // demo.fun1();
	  demo.fun2();
          demo obj1=new demo();
          obj1.fun1();
          obj1.fun2();  
  }

}
*/


class demo{
   int x=20000;	
   static int y=100;
   static{
   System.out.println("Static block  5");
   System.out.println(y);
   }
   public static void main(String[]args){
   
	   System.out.println("Main Method ");
           demo obj=new demo();
	   System.out.println(obj.x);
   }
   static {
   System.out.println("statoc  block 2");
   
   System.out.println(y);
   }
}
 

