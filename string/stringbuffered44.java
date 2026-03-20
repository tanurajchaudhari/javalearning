/*
class StringbufferedDemo{
  public static void main(String[]args){
    StringBuffer str1=new  StringBuffer("Tanuraj");
    
    
    
    System.out.println(System.identityHashCode(str1));
    
   
    str1.append("Chaudhari");

    System.out.println(str1);

    System.out.println(System.identityHashCode(str1));
  }
}

*/

class StringbufferedDemo{
  public static void main(String[]args){
    StringBuffer str1=new  StringBuffer();
    System.out.println(str1.capacity());
    str1.append("Tanuraj");



     System.out.println(str1.capacity());
     System.out.println(System.identityHashCode(str1));
     str1.append("Chaudhari");
     System.out.println(str1.capacity());
     str1.append("Sortapwaditalukahaveli");
     System.out.println(str1.capacity());
     System.out.println(System.identityHashCode(str1));




  }


}




