class stringdemo{
   public static void main(String[] args){
     String str1="Core2Web";                           //scp
     String str2=new String("Core2Web");               //heap
                                                       //heap




     String str3="Core2Web";
     String str4=new String("Core2Web");

     System.out.println(System.identityHashCode(str1));
     System.out.println(System.identityHashCode(str2));
     System.out.println(System.identityHashCode(str3));
     System.out.println(System.identityHashCode(str4));
   }

}
