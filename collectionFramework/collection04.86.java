/*
import java.util.*;
class  Vectordemo{
	public static void main(String[]args){
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		System.out.println(v);
	}
}
*/
/*
import java.util.*;

class StackDemo{

	public static void main(String[]args){
	
		Stack s=new Stack();

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
	        s.pop();
                System.out.println(s.peek());
		System.out.println(s);
	}
}
*/

/*
import java.util.*;
import java.util.*;

class CursurDemo{

        public static void main(String[]args){

                ArrayList al=new ArrayList();

                al.add(10);
                al.add(20.5);
                al.add(30.5f);
                al.add("Tanuraj");
                //for each
               for(var x:al){

                       System.out.println(x.getClass().getName());
		       System.out.println(x.getClass());

               }
               //Iterator
               Iterator cursur=al.iterator();
        }


}
*/



import java.util.*;
class CursurDemo{

	public static void main(String[]args){
	
        	ArrayList al=new ArrayList();

		al.add(10);
		al.add(20.5);
		al.add(30.5f);
		al.add("Tanuraj");
               //for each
	       for(var x:al){
	       
		       System.out.println(x +" = "+x.getClass().getName());
	       
	       }
	       
	       //Iterator
	       Iterator cursor=al.iterator();
               while(cursor.hasNext()){
	       
		       if("Tanuraj".equals(cursor.next()))
			       cursor.remove();
	       
	       }
                   
	       for(var x:al){

                       System.out.println(x +" = "+x.getClass().getName());

               }               
	       //listIterator
	       ListIterator litr=al.listIterator();
	       //System.out.println(litr.getClass().getName());
                 while(litr.hasNext()){
		 
			 System.out.println(litr.next());
		 } 
		 while(litr.hasPrevious()){
		 
			 System.out.println(litr.previous());
		 }
		//

                 //Enumeration   

                Vector  al2=new Vector();

                al2.add("sunny");
                al2.add("abba");
                al2.add("om");
                al2.add("sanket"); 
	        

	       Enumeration cursor2=al2.elements();
               System.out.println(cursor2.getClass().getName());

	      while(cursor2.hasMoreElements()){
	      
		      System.out.println(cursor2.nextElement());
	      
	      } 
	}
}
void main(){

	int x=10;
	double y=20.5;
	num a= 30;
	num b=40.5;
	print(x);
	print(y);
	print(a);
	print(b);
}








































