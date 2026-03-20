class nestswitch{ 
     public static void main ( String [] args){ 
     
	     System.out.println("  Oh Pune");

             String str="non-veg";
	     switch(str){
	     
	         case "veg":
			 { 
			 String str1="starter";
			  switch( str1){
			         case "starter":
					 System.out.println("masala papd");
					 break;

				case " mainmenu":
					 System.out.println("Shahi paneer");
					 break;

			 
			  }
			 }
			 break;

	        case "non-veg":
			 { 
			  String str1="starter";
			  switch( str1){ 
			     case "starter":
				     System.out.println("mutton - sup");
				     break;
			     case "mainmenu":
				     System.out.println (" thali ");
				     break;

			  
			  }



			 
			 }
			 break;


	     }
     }

}
