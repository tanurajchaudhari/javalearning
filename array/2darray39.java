
/*
class demo{
   public static void main(String [] args){
   
   int arr1[][]=new int[2][3];
   arr1[0][0]=2;
   arr1[0][1]=4;
   arr1[0][2]=6;
   arr1[1][0]=12;
   arr1[1][1]=14;
   arr1[1][2]=16;
   for (int i=0;i<2;i++){
      for (int j=0;j<3;j++){
        System.out.print(arr1[i][j]+"\t");
      
      
      }
      System.out.println();
         
   }               
   
   }
}
*/

/*
class demo{
   public static void main(String[] args){
    int arr[][] =new int[2][2] ;
    
   int arr2[] =new int[2];

   System.out.println(arr.length);//2 or 4
   System.out.println(arr2.length);//2 or 2
       
   
   }


}
*/
/*
class demo{
  public static void main(String[]args){
     int arr1[][]= new int[2][2];
  arr1[0][0]=2;
  arr1[0][1]=4;
  arr1[1][0]=12;
  arr1[1][1]=14;
  System.out.println(arr1[1][1]);
  System.out.println(arr1[0]);
  System.out.println(arr1[1]);
  System.out.println(arr1);

  }

}
*/

import java.util.Scanner;
class demo{
  public static void main(String [] args){ 

  int arr1[][]={{10,20,30,40},{10,20,30},{10,20}};
  System.out.println("Enter the data: -");
  for (int i=0;i<arr1.length;i++){
    for(int j=0;j<arr1[i].length;j++){
    System.out.print(arr1[i][j]+" ");
    
    }
    System.out.println();


  }
  }

}


