/*
class Tochararraydemo{
     static int mystrlen(String str){
     
     char arr[]=str.toCharArray();
     int count=0;
     for(int i=0;i<arr.length;i++){
      
        count++;
      
      
      }
     return count;
     
     
     
     }




public static void main(String [] args){

        String str1="TanurajChaudhari";
        char arr[]=str1.toCharArray();
        for (int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
          

        } 
	System.out.println(str1.length());
        int len=mystrlen(str1);
        System.out.println(len);
        
}

}

*/


/*

import java.util.Scanner;
class demo{
     static int mystrlen(String str){

     char arr[]=str.toCharArray();
     int count=0;
     for(int i=0;i<arr.length;i++){
        count++;
      }
     return count;
     }
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  String str1=sc.next();
  String str2=sc.next();
  if(mystrlen(str1)==mystrlen(str2)){
   System.out.println("String lengths  are same  ");
  } else{
    System.out.println("String lengths are not same");
  }
  }
}

*/


/*
method:public int indexof(int ch,int fromIndex) 

*/
/*
class Indexofdemo{
   public static void main(String []args){
    String str1="Tanuraj";

    System.out.println(str1.indexOf('a',0));
    System.out.println(str1.indexOf('a',1));
    System.out.println(str1.indexOf('a',2));
    System.out.println(str1.indexOf('a',3));
   
   }
}
*/

/*
method : public int lastIndexOf(int ch,int fromindex)
*/
/*
class Lastindexofdemo{
  public static void main(String[] args){
  
   String str1="Tanuraj";
   System.out.println(str1.lastIndexOf('a',4));
  
  
  }



}
*/
/*
 *method : public String replace (Char oldchar,char newchar );

 */

/*
class Substringdemo{
  public static void main(String[]args){
  
  String str1="Core2Web";

  System.out.println(str1.substring(4));
  System.out.println(str1.substring(0,4));
  }
}
*/



