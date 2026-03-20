class breakdemo { 

    public static void main( String [] args ){ 
    
         int n=15;
	 int count=0;
	 int i =1;
	  
	  for ( ; i<=n; i++) { 
	  
	       if ( n%i==0){ 
	       
	       
	         count++;

	       
	       }
	      /* if (count>2) { 
	       
	          break;

	       
	       }*/
	  
	  
	  }  

	  System.out.println ( i); 
	  if ( count ==2){ 
	      System.out.println   ( "prime  no") ;

	  
	  } 
	  else{ 
	  
	      System.out.println( "  not  prime ") ;
	  
	  }
    
    
    
    }


}
