/*

class demo { 
    public static void main ( String [] args ) { 
    
       int n=5;
       for ( int i =1; i<=n ; i++) { 
          for ( int j=1; j<=n; j++){ 
	     System.out.print( "*  ") ;

	  
	  
	  }
	  System.out.println() ;

       
       }
    
    }


}

*/

/*
class  demo { 
    public static void main ( String [] args ) { 
            int n= 3;
	    int num =1;
	    for ( int i =1; i<=n; i++) { 
       	       for ( int j =1; j<=n; j++) { 
	          System.out.print( num );
		  num++;

	       
	       }
	       System.out.println () ;

	    
	    }
       


    }

i}

*/
/*
class pattern{ 
 public static void main ( String[]args ) { 
 
   char ch='A';
   for ( int i=1;i<=3;i++) {
      for ( int j=1 ;j<=3;j++) { 
      
        System.out.print( ch++);
	// ch=ch+1;
      
      }
      System.out.println();

   
   }
 
 }

}
*/
/*
class demo {


	public static void main( String [] args ){ 
	    int n=4;
	    for ( int i =1; i<=n; i++){ 
	       for ( int j=1; j<=n; j++){ 
	         if ( j%n==1 || j%n==0) { 
		     System.out .print( " * ");

		 
		 }
		 else{ 
		    System.out. print( "  ");

		 }
	       
	       }
	       System.out.println();

	    }
	
	
	}

}
*/

/*
class demo { 
  public static void main    ( String [] args ) { 
      int n=4;
       for ( int i=1; i<=n; i++){ 
          for ( int j=1;j<=i; j++) { 
	     System.out .print( " * ");

	  
	  }
	  System.out.println();

       
       } 
  
  }

}
*8/

/
class demo{
  public static void main( String [] args){ 
   int n=4;
   int num =1;
   for ( int i =1;i<=n;i++){ 
      for ( int j=1; j<=i; j++){ 
          System.out.print( num + " ");
          num++;

          
      }
      System.out.println();

   
   }
  
  }
}
*/

/*
class demo{ 
  public static void main(String [] args ){ 
  
      
	  int n=4;
	  for(int i =1;i<=n;i++) {
	     int num=1;
	     for ( int j =1; j<=i;j++){ 
	        System.out.print( num +" ");
		num++;

	     
	     }  
	     System.out.println() ;

	  
	  }
	  

  
  }
}

*/


/*
class demo { 

 public static void  main ( String []args){ 
    int n=6;
    int num = (n*(n+1))/2;
    for ( int i=1;i<=n;i++){
       for ( int j =1;j<=i;j++){ 
          System .out.print( num +" ");
	  num--;
        
       }
      System.out.println() ;

    }
   
 }

}
*/
/*
 class demo { 
    public static void main ( String []args ) { 
       int n=6;
       
       for ( int i =1; i<=n; i++) { 
         for ( int j =1; j<=(n-i+1 ); j++) { 
	 
	    System.out.print( " * ");

	 
	 } 
	 System.out.println ();

       
       }
    
    }
 
 }
 */

/*
class demo{ 
   public static void  main( String [] args) { 
       int n=4;
       for( int i=1; i<=n;i++) { 
         for ( int j=1; j<=n-i;j++){ 
	   System.out.print(" ");

	 
	 }
	 for( int k =1;k<=2*i-1;k++) { 
	    System.out.print( "*" );
	 
	 
	 }
	 System.out.println() ;

       
       }
   
   }  
  
}

*/

class demo{ 
 public static void main ( String [] args ) { 
   int n=4;

   for ( int i =1; i<=n; i++) {
	  char ch ='A'; 
      for ( int j =1; j<=n-i+1; j++) { 
         System.out.print( ch++ +" ");

      
      }
      System.out.println();

   
   }
 
 }

}
