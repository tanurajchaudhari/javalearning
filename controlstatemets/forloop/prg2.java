
// Q .6. take n as input and print whether its prime or not
class prime{ 
   public static void main( String [] args ){ 

	   int N=5;
	   int count=0;
	   for ( int i=1;i<=N;i++){ 
	      if (N%i==0) { 
	        count++;
	      }

	   
	   }
	   if (count==2) {  
	     System.out.println(N+" is prime number ");

	   
	   } 
   }


}
