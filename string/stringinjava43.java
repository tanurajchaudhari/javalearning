/*
class demo{
   
	
	public static void main (String[] args ){
        String str1="Tanuraj";
	String str3="Tanuraj";
	String str2=new String("Tanuraj");
        String str4=new String("Tanuraj");
       System.out.println(System.identityHashCode(str1));
       System.out.println(System.identityHashCode(str2));

       if(str1==str3){
         System.out.println("Equal");
       
       } else{
       
       System.out.println("Not Equal");
       
       }
      
      if(str1.equals(str2)){
         System.out.println("Equal");

       } else{

       System.out.println("Not Equal");

       }

   }
}
*/
/*
class demo{
    public static void main(String[]args){
    
    String str1="Tanuraj";
    String str3="Chaudhari";
    String str5="TanurajChaudhari";
    String str2=str1+str3;
    str2.intern();
    String str4=str1.concat(str3);

    System.out.println(str2);
    System.out.println(str4);
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str4));
    System.out.println(System.identityHashCode(str5));
    
  


    }
}
*/

/*
class hashcodedemo{
 public static void main(String[] args){
  String str1="Tanuraj";
  String str2=new String("Tanuraj");
  String str3="Tanuraj";
  String str4=new String("Tanuraj");
  
  System.out.println(str1.hashCode());
  System.out.println(str2.hashCode());
  System.out.println(str3.hashCode());
  System.out.println(str4.hashCode());
 }
}
*/

/* 
Method : public sString concat(String str):
description:
-- concatinate  String ti this String i.e. Another string is concatinated with the  first string.
-  Implements new array of character  whose length is sum of str1.length and str2.length.

parameter : String
return type: String
 */
/*
class  concatedemo{
  public static void main(String [] args){
  
	  String str1="Core2";
	  String str2="Web";

	  String str3=str1.concat(str2);

	  System.out.println(str3);
  }

}
*/

/*
method : public int length():
*/

/*
class lengthdemo{
     
	public static void  main(String[] args){
     
          String str1="core2Web";
          System.out.println(str1.length());

     
     
     }
}
*/


//method :public char charAt(int index):

/*
class sharatdemo{
  public static void main(String[]args){
  
    String str="Core2Web";
    System.out.println(str.charAt(4));
    System.out.println(str.charAt(0));
    System.out.println(str.charAt(7));
  
  }

}

*/



//method : public int compareto(String str2);


/*
class comparedemo{
  public static void main(String[] args ){
  
  String str1="Ashish";
  String str2="Ashish";

  System.out.println(str1.compareTo(str2));
  }

}
*/



// method : public in compareToIgnoreCase(String str);

/*
class comparedemo{
  public static void main(String[] args ){

  String str1="SHASHI";
  String str2="shashi";

  System.out.println(str1.compareToIgnoreCase(str2));

  }
}
*/



// method : public boolean equal

/*

class demo{
  public static void main(String [] args){
  
   String str1="Shashi";
   String str2= new String ("Shashi");

   System.out.println(str1.equals(str2));
  
  }

}
*/


/*

class Tochararraydemo{

public static void main(String [] args){
     
	String str1="Tanuraj";
	char arr[]= str1.toCharArray();
        for (int i=0;i<arr.length;i++){
	  System.out.println(arr[i]);
	
	
	}
}

}
*/

