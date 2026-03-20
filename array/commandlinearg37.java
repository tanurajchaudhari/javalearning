/*
class  demo{

	static int fun(int x,double  y){
		System.out.println(x);
		System.out.println(y);
	        return x;

	
	}

	
   public static void main(String[]args){
      
	   System.out.println(fun(10,20.5));

      
   }

}
*/
/*
class  demo{

        static void fun(char x,double  y){
                System.out.println(x);
                System.out.println(y);
                


        }


   public static void main(String[]args){

         fun('A',20.5);


   }

}
*/

/*
class  demo{

        static void fun(int x,double  y){
                System.out.println(x);
                System.out.println(y);

                x=x+10;
		y=y+10;

	        System.out.println(x);
                System.out.println(y);

        }


   public static void main(String[]args){

         int x=10;
	 int y=20;

	  System.out.println(x);
          System.out.println(y);
    
          System.out.println(x);
          System.out.println(y);

	  fun(x,y);
          System.out.println(x);
          System.out.println(y);


   }

}
*/
/*
class demo{

static void fun(int xarr[]){
    
	 for(int x: xarr){
       System.out.println(x);

   }
   xarr[0]=50;
   System.out.println("adress in the function"+xarr);

}
  public static void main(String [] args ){
  
    int arr[]={10,20,30};
    for(int x: arr){
    System.out.println(x);

   }
   System.out.println("Adress in the main fucntion"+arr);
   fun(arr);

    for(int x: arr){
    System.out.println(x);

   }
  }

}
*/
/*
class arraydemo{ 

 static void fun(int arr[]){
 
   for (int x:arr){
     System.out.println(x);
   
   }
                                   
      for (int i=0;i<arr.length;i++){

     arr[i]=arr[i]+50;


   }
 
 
 }

  public static void main(String [] args){
  
      int arr[]={50,100,150};

      fun(arr);
     for (int x:arr){
     System.out.println(x);

   }
  
  }

}
*/

/*
class arraydemo{

 static void fun(int arr[]){

  System.out.println(arr);
  arr[0]=700;


 }

  public static void main(String [] args){

      int arr[]={50,100,150};
      System.out.println(arr);
      fun(arr);
      System.out.println(arr);

  }

}


*/

//commandline arguments
/*
class demo{
     public static void main(String[] args){
       //int arr[]={10,20,30};

       String friends[]={"ashish","Kahna","Badhe","Rahul"};
      for(int i=0;i<args.length;i++){
        System.out.println(args[i]);
      
      
      }
     
     }


}
*/

/*
class demo{
     public static void main(String ... args){
       //int arr[]={10,20,30};

       String friends[]={"ashish","Kahna","Badhe","Rahul"};
      for(int i=0;i<args.length;i++){
        System.out.println(args[i]);


      }

     }
}
*/
