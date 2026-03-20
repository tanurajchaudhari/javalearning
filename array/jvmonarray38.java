 class demo{

 void fun(int arr[]){
 
 arr[1]=70;
 
 arr[2]=80;
 }
  public static void main(String [] args){
       
      int arr[]={10,20,30,40};
      System.out.println("identity hashcode of array before change the value ");
      System.out.println(System.identityHashCode(arr[0]));
      System.out.println(System.identityHashCode(arr[1]));
      System.out.println(System.identityHashCode(arr[2]));
      System.out.println(System.identityHashCode(arr[3]));

      demo obj=new demo();
      obj.fun(arr);

     for(int x:arr){
     System.out.println(x);

     } 
    System.out.println(System.identityHashCode(arr[1]));
    System.out.println(System.identityHashCode(arr[2])); 	 
     int x=70;
     int y=80;
    // System.out.println(System.identityHashCode(arr[1]));
     //System.out.println(System.identityHashCode(arr[2]));
     int a=20;
     int b=30;


     System.out.println(System.identityHashCode(x));
     System.out.println(System.identityHashCode(y));
     

     System.out.println("identity of A and B");
     System.out.println(System.identityHashCode(a));
     System.out.println(System.identityHashCode(b));
  }
}
