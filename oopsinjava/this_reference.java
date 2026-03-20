
//methode signature
/*
class demo{
   int x=10;
   demo(){
	   System.out.println("In constructor 1");
	   System.out.println("X="+x);   
   } 
   demo(){
           System.out.println("In constructor 2");
           System.out.println("X="+x);
   }
}
*/

class demo{
   int x=10;
   demo(){
           System.out.println("In  No argument constructor ");
   }
   demo(int x){
           System.out.println("In para constructor ");       
   }
   public static void main(String []args){
   demo obj1=new demo();
   demo obj2=new demo(10);
   }
}

