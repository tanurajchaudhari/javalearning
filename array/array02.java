/*
class demo{
   public static void main(String [] args){
      int arr[]=new int[4];

      arr[0]=10;
      arr[1]=10;
      arr[2]=10;
      arr[3]=10;
      


      int arr2[]={20,20,20,20};

      int arr3[]=new int[]{30,30,30,30};


      //erro
    int arr4[]=new int[4]{40,40,40,40};

   }

}
*/



/*
class demo{
   public static void main(String [] args){
   
     int arr1[]={10,20,30,40};
     
     char arr2[]={'A','B','C'};

     float arr3[]={10.5f,20.5f};

     boolean arr4[]={true,false,true};
     //Integer
     System.out.println(arr1[0]);
     System.out.println(arr1[1]);
     System.out.println(arr1[2]);
     System.out.println(arr1[3]);
     
     //char array
      System.out.println(arr2[0]);
      System.out.println(arr2[1]);
      System.out.println(arr2[2]);
     // System.out.println(arr2[3]);
     
      //float arrya
      System.out.println(arr3[0]);
      System.out.println(arr3[1]);
      // runtime error
      // array index outofbound Exception

      //System.out.println(arr3[2]);
      //System.out.println(arr3[3]);
      

      //boolean array
        

      System.out.println(arr4[0]);
      System.out.println(arr4[1]);
      System.out.println(arr4[2]);
   }


}

*/

/*
class arraydemo{
    public static void main (String [] args){
       int arr1[]={10,20,30,40,50};
       for(int i =0;i<=4;i++ ){
          
	       System.out.println(arr1[i]);
       }
    }
} 

*/


import java .io.*;
class arraydemo{
  public static void main(String [] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter te length of array:- ");
    
    int len=Integer.parseInt(br.readLine());

    int arr1[]=new int[len];
    for (int i=0;i<len;i++){
       arr1[i]=Integer.parseInt(br.readLine());    
    } 
    System.out.println("Printingth array:-");
    for (int i=0;i<len;i++){
     System.out.println(arr1[i]);
    
    }
  }

}

