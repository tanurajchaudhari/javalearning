class tanuraj{ 

    public static void main( String[] args) { 
       int x=11;
       if(x%3==0 && x%5==0) { 
        System.out.println( "  divisible by both" );

       
       }
       else if(x%3==0) { 
         System.out.println( "Fizz" );



       }
       else if( x%5==0){ 
          System.out.println( " Buzz");

       }
       else{
          System.out.println( "not divisinle by both");

       }
    }
}
