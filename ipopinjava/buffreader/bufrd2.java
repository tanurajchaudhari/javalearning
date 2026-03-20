/*

import java.io.*;
class PlayerInfo{
    public static void main (String []args)throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println ("Enter the batsman name :- ");
        String name =br.readLine();

	System.out.println("Enter the bowler name :- ");
	String name1=br.readLine();
        
	System.out.println("Batsman name is :- "+name);
	System.out.println("Bowler Name is :- "+ name1);


    
    
    }


}
*/


/*

import java.io.*;
class PlayerInfo{ 
          public static void main(String [] args)throws IOException {
		 BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
		 System.out.println("Enter player name:- ");
	         String name = br.readLine();
                 System.out.println("Enter  jersy number :- ");
		 int jrnum =  Integer.parseInt (br.readLine()) ;
                 System.out.println("Enter avg:- ");
		 float avg = Float.parseFloat(br.readLine());

		 System.out.println("Player name is :- "+ name);
		 System.out.println("jersey number :- "+jrnum);
		 System.out.println ("Average of the player :- "+ avg);
	  }
}
*/

/*

import java.io.*;
class PlayerInfo{   
     public static void main (String []args )throws IOException{ 
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" enter sciety name :- ");
	String bname=br.readLine();

	System.out.println(" Enter Wing :-");
	char wing = (char)br.read();
        br.skip(1);
	System.out.println("Enter flat no:- ");
	int flat=Integer.parseInt(br.readLine());

	System.out.println("Name ="+bname);
	System.out.println("Winfg ="+wing);
	System.out.println("flat number= "+flat);   
     }
}


*/

/*

import java.io.*;
class demo {
  public static void main (String [] args )throws IOException {
   BufferedReader br1 = new BufferedReader( new InputStreamReader(System.in));
   BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in));
   System.out.println("enter your name :- ") ;
   String str1= br1.readLine();
   System.out.println( "String 1:-"+ str1);
   br1.close();

   System.out.println("enter your name :- ") ;
   String str2= br2.readLine();
   System.out.println( "String 1:-"+ str2);

  }

}

*/


/*

import java.io.*;
class demo {
  public static void main (String [] args )throws IOException {
   
   InputStreamReader isr= new InputStreamReader(System.in);	  
   BufferedReader br1 = new BufferedReader( new InputStreamReader(System.in));
   
   System.out.println("enter your name :- ") ;
   String str1= br1.readLine();
   System.out.println( "String 1:-"+ str1);
   br1.close();


   char ch=(char)isr.read();
   System.out.println("string := "+ch);

  

  }

}
*/
/*
import java.io.*;
import java.util.*;

class StringDemo{

   public static void main (String [] args)throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   System.out.println("enter  society name,wing,flatno");
   String info=br.readLine();

   System.out.println(info);
   
   StringTokenizer obj = new StringTokenizer(info," ");

   String token1=obj.nextToken();
   String token2=obj.nextToken();
   String token3=obj.nextToken();

   System.out.println( "Society= "+token1);
   System.out.println("wing= "+token2);
   System.out.println("flat= "+token3);

   
   
   
   }


}
*/


/*

import java.io.*;
import java.util.*;

class StringDemo{

   public static void main (String [] args)throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   System.out.println("enter  String,character,int andfloat");
   String info=br.readLine();

   System.out.println(info);

   StringTokenizer obj = new StringTokenizer(info,",");

   String token1=obj.nextToken();
   String token2=obj.nextToken();
   String token3=obj.nextToken();
   String token4=obj.nextToken();
    
   char wing=token2.charAt(0);
   int num = Integer.parseInt(token3);
   float num2= Float.parseFloat(token4);


   System.out.println("String:="+token1);
   System.out.println("Character:="+token2);
   System.out.println("integer:="+token3);
   System.out.println("float:="+token4);

   }


}


*/



/*

import java.util.*;
class demo{
  public static void main(String [] args ){ 
  
  Scanner sc= new Scanner(System.in);

  System.out.println("Enter  player info:- ");
  String str = sc.nextLine();
  
  System.out.println(str);


  StringTokenizer st= new StringTokenizer(str," ");
  
  String token1=st.nextToken();
  String token2=st.nextToken();
  String token3=st.nextToken();

  String name=token1;
  int jerNo=Integer.parseInt(token2);
  float avg=Float.parseFloat(token3);
  
  System.out.println(name);
  System.out.println(jerNo);
  System.out.println(avg);


  }
}

*/

/*


import java.util.*;
class demo{
  public static void main(String [] args ){

  Scanner sc= new Scanner(System.in);

  System.out.println("Enter  player info:- ");
  String str = sc.nextLine();

  System.out.println(str);


  StringTokenizer st= new StringTokenizer(str," ");

  System.out.println(st.countTokens());
  
  while(st.hasMoreTokens()){
     System.out.println(st.nextToken());

  
  }


  }
}
*/




