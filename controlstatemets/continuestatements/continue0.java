 /*

class demo1 { 
  public static void main( String [] args) { 
     int n=15;
      for ( int i =1; i<=n ; i++ ) { 
       

	      if ( i % 3==0) { 
	         continue ;
		  
	      
	      } 
	      System.out.println (i) ;
	     
      
      } 
  
  }

}

*/


class demo { 
   public static void main ( String [] args  ){ 
   
       int n=40;
        for ( int i=1; i<=n; i++ ) { 
	   if ( i%3==0 && i% 5==0 || i%4==0 ) { 
	       continue ;

	   
	   }
	   System.out.println ( i) ;

	}
   
   }

}
