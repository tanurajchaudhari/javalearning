/*
class staticdemo{   
       
    static int x=10;
    static int y=20;

  
    static void disp(){
    
    System.out.println(x);
    System.out.println(y);
    
    
    }


} 


class client{

	 public static void main(String []args){
	 
	 System.out.println(staticdemo.x);
	 System.out.println(staticdemo.y);
	 staticdemo.disp();
	 
	 
	 }



}
*/


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
class clieent{

 public static void main(String[]args){
 demo obj1=new demo();
 obj1.fun1();
 obj1.fun2();
 System.out.println(obj1.x);
 System.out.println(obj1.y);
 
 
 
 }

}

