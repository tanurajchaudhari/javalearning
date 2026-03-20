import arithfun.addition;
import java.util.Scanner;

class client{

	public static void main(String[]args){
	
	
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();

		addition obj=new addition(x,y);
		System.out.println(obj.add());

	
	}


}











