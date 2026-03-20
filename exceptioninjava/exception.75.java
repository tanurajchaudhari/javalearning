/*
import java.io.*;

class Input{

	public static void main(String[]ags)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str= br.readLine();
		System.out.println(str);

          	br.close();
		

   		String str2= br.readLine();
		System.out.println(str2);
	}
}  
*/
/*
//ArithmeticException
class Demo{

	public static void main(String[]args){
	
		System.out.println("Start main");
		try{
		
			System.out.println(10/0);
		
		
		}catch (ArithmeticException obj ){
		
			System.out.println("Exception occured");
		
		
		}
		System.out.println("End main");
	}
}
*/
/*

import java.io.*;
class ExceptionDemo{

	public static void main(String[]args)throws IOException, NumberFormatException{
	
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str =br.readLine();
		System.out.println(str);
		int data;
		try{

		   data=Integer.parseInt(br.readLine());

		} catch(NumberFormatException obj){
		
			System.out.println("PleaseEnter Integer Data ");
		        data=Integer.parseInt(br.readLine());
		
		
		}
		System.out.println(data);


	}                                                 
}
*/


import java.io.*;
class ExceptionDemo{

        public static void main(String[]args)throws IOException, NumberFormatException{


                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String str =br.readLine();
                System.out.println(str);
                int data;
                try{

                   data=Integer.parseInt(br.readLine());

                } catch(NumberFormatException obj){

                        System.out.println("PleaseEnter Integer Data ");
                        data=Integer.parseInt(br.readLine());


                }
                System.out.println(data);


        }
}
/*
class interuptException{

	public static void main(String[]args){
	
		for(int i=0;i<10;i++){
		
			System.out.println("In loop");
			Thread.sleep(5000);
		}
	
	}
}
*/
/*
class InterruptExceptionDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("In loop");
            try {
                Thread.sleep(5000); // Pause for 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
*/
