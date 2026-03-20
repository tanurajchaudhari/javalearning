/*
class sbdemo{

    public static void main(String[]args){
     
	    StringBuffer sb=new StringBuffer(100);

            System.out.println(sb.capacity());
            System.out.println(sb);

            sb.append("shashi");
            System.out.println(sb.capacity());
            System.out.println(sb);

            sb.append("Bagal");
            System.out.println(sb.capacity());
            System.out.println(sb);

            sb.append("Core2web");
            System.out.println(sb.capacity());
            System.out.println(sb); 
    }

}
*/



class demo{
  public static void main(String[]args){
  
  String str1="Shashi";
  String str2=new String("Bagal");
  StringBuffer sb=new StringBuffer("Core2Web");

  String str4=str1.append(str2);

  System.out.println(str1);
  
  
  }


}

