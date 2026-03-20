/*
import java.io.*;
class buf{ 
     public static void main (String [] args )throws IOException  { 
              InputStreamReader isr = new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(isr);

	      System.out.println("enter your name :- ");
	      String name = br.readLine();

	      System.out.println(name);

              System.out.println(" Enter your age :- ");
	      int age = Integer.parseInt(br.readLine());
              System.out.println("Your age is :- "+age);

     
     
     }


}

*/
/*
import java.io.*;
class inswitch{
     public static void main(String args[]) throws IOException { 
     
	     InputStreamReader isr= new InputStreamReader( System.in);
	     BufferedReader br= new BufferedReader( isr );


	     System.out.println(" enter the platform name :- ");
	     String name=br.readLine();
             System.out.println( name);

	     switch(name) {
	         

		     case "Netflix":{
		         System.out.println ("Enter movies or series :-");
			 String name1 = br.readLine();
                         switch(name1){ 
			     case "movies":
				     System.out.println("dunki");
				     break;
			     case "series":
				     System.out.println("breaking bad ");
				     break;
			     default:
				     System.out.println (" Not match ");
				     break;


			        
			 
			 }
		     
		     }
	             break;
                    
		     case"Primevideo":{
		       System.out.println(" Enter movies or series :- ");
                       String name1=br.readLine();
    	               switch(name1){ 
		       
		          case"movies":
				  System.out.println("shaitan");
				  break;
		          case "series":
				  System.out.println("friends");
				  break;
		          default:
				  System.out.println("Not Match");
				  break;

		       }
		     
		     }
		     default:
				      System.out.println(" other ott platformis not accepted ");
				      break;

	     }
     
     
     }


}
*/
