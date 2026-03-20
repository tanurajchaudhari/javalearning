/*
class outer{
	int x=10;
	static int y=20;

	void m1(){
	
	
		int a=30;
	       static int b=30;
	
	
	
	}
	public static void main(String[]args){
	 
		int p=50;
	        static int q=60;




   	}
}
*/
/*
class outer{

	int x=10;
	static int y=20;
	class inner{
	
		int a=30;
		static int b=40;
	}
}
*/

/*
class outer{

	int x=10;
	static int y=20;

	class inner{
	
		int a=30;
		final static int b=40;
	
	
	}


       public static void main(String[]args){
       
      
	       outer obj =new outer();
       
       
	       outer.inner obj1=obj.new inner();
               
       
	       System.out.println(obj.new inner().b);
               System.out.println(obj1.b);
	       
//	       System.out.println(outer.inner.a);
       
       
       }

}
*/

/*
class outer{

        int x=10;
        static int y=20;

        static class inner{

                int a=30;
                 static int b=40;


        }


       public static void main(String[]args){

            outer obj=new outer();
	   // System.out.println(obj.inner.b);                //error happen
            System.out.println(outer.inner.b);
                                                  

       }

}
*/
/*
class demo{
	int x=10;
	void marry(){
		System.out.println("tanuraj chaudhari");
	}
}
class client{
	public static void main(String[]args){
		demo obj=new demo(){
			void marry(){
				System.out.println("core2web");
			}
		};
               obj.marry();	
	}
}

*/


/*
class tanuraj{


	int a=20;
	static int b=200;
	public static void main(String[]args){
	
		tanuraj obj=new tanuraj();
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
*/

class outer{

	static class  inner{
	
		static int x = 10;

	}
}
class client{

	public static void main(String []args){
	
		outer obj=new outer();
		System.out.println(outer.inner.x);
	}
}













