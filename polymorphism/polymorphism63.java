/*
class ipl {

	void match_info(String team1,String team2){
	
		System.out.println(team1+" vs "+ team2);
	

	
	}
	void match_info(String team1,String team2,String venue){
	
	
		System.out.println(team1+"vs"+team2);
		System.out.println("venue="+venue);
	        

	
	}



}
class client{

	public static void main(String[]args){
	
	
	ipl ipl2023=new ipl();

	ipl2023.match_info("Mi","csk");
	ipl2023.match_info("mi","csk","wankedestadium");
	
	
	
	
	}



}

*/
/*

class match{

	void matchtype(){
	
	
		System.out.println("T20/OneDay/Test");
	
	
	}




}

class iplmatch extends match{

	void matchtype(){
	
		System.out.println("T20");
	
	
	
	}
                          




}

class testmatch extends match{


	void matchtype(){
	
		System.out.println("Test");
	
	
	}



}


class client{

	public static void main(String[]args){
	
		match type1=new iplmatch();
		type1.matchtype();
               
		match type2 =new testmatch() ;
		type2.matchtype();

	
	
	 
	} 



}
*/
/*
class demo{

	void fun(int x, float y){
	
	
		System.out.println("integr- float  para");
	
	} 
	void fun(float x,int y){
	
	  System.out.println("float- integer  para");
	
	
	}





}



class client{

	public static void main(String[]args){
	
		demo obj=new demo();
                //obj.fun('A');
	       obj.fun(10, 20);
	
	
	}


}
*/

/*
class Demo{

 void fun(String str){
 
	 System.out.println("String");
 
 
 }
 void fun(StringBuffer str1){
 
 
	 System.out.println("Stringbuffer");
 
 
 }


}


class client{

	public static void main(String[]args){
        
	       String str1=null;

               StringBuffer sb=null;



	 Demo obj=new Demo();
	 obj.fun("Core2Web");
	 obj.fun(new StringBuffer("Core2web"));
	 obj.fun(null);
	
	
	
	}




}
*/

/*
class demo{


	void fun(object obj){
	
		System.out.println("object");
	
	
	}

	void fun(String str1){
	
		System.out.println("String");
	
	
	
	}


}

class client {

	public static void main(String []args){
	
	demo obj=new demo();
	obj.fun("Core2web");

	obj.fun(new StringBuffer("Core2Web"));
	obj.fun(null);


	
	}



}
*/

/*
class  parent{

	Object fun(){
	        

		Object obj=new Object();
                return obj;
		//return new 
		        
		
	
	} 
        



}

class child extends parent{

	String fun(){
	
		return new String();
	}

 



}


*/


class parent{

       public  void fun(){
	
		System.out.println("parent fun ");

	
	
	}

}
class child extends parent{

	void fun(){
	
		System.out.println("child fun ");
	
	
	}

}

class client{

	public static void main(String[]args){
	
	parent obj=new child();
	obj.fun();
	
	
	}


}

