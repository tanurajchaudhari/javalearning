/*
import java.util.*;
class HashSetDemo{

	public static void main(String[]args){
	
		HashSet hs=new HashSet();

                hs.add(10);
	        hs.add(20);
		hs.add(10);
		hs.add(10);
	       System.out.println(hs);
               HashSet hs1=new HashSet();
               hs1.add("Kanha");
	       hs1.add("Rahul");
	       hs1.add("Ashish");
	       hs1.add("Badhe");
	       hs1.add("Rahul");
	       hs1.add("Ashish");
               
	       System.out.println(hs1);	
	}
}
*/
/*
import java.util.*;
class HashSetDemo{

        public static void main(String[]args){

                LinkedHashSet hs=new LinkedHashSet();

                hs.add(10);
                hs.add(20);
                hs.add(10);
                hs.add(10);
               System.out.println(hs);

               LinkedHashSet hs1=new LinkedHashSet();
               hs1.add("Kanha");
               hs1.add("Rahul");
               hs1.add("Ashish");
               hs1.add("Badhe");
               hs1.add("Rahul");
               hs1.add("Ashish");

               System.out.println(hs1);
        }
}
 */

/*
import java.util.*;
class HashDemo{

	public static void main(String[]args){
	
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(new Integer(10));
		hs.add(new Integer(20));

		System.out.println(hs);	
	}
}
*/

/*
import java.util.*;
class treeSet{

	public static void main(String[]args){
		TreeSet ts=new TreeSet();
               
		ts.add("Kanha");
		ts.add("Ashish");
		ts.add("Rahul");
		ts.add("Badhe");
               
	//	System.out.println(ts); 
             
               
                ts.add(new String("Kanha"));
                ts.add(new String("Ashish"));
                ts.add(new String("Rahul"));
                ts.add(new String("Badhe"));

		System.out.println(ts);
	

	
	}
}
*/


/*
import java.util.*;
class CricPlayer{


	int jerNo=0;
	String pName=null;

	CricPlayer(int jerNo,String pName){
	
		this.jerNo=jerNo;
		this.pName=pName;
	}
}
class HashSetDemo{

	public static void main(String[]args){
	
		LinkedHashSet lhs=new LinkedHashSet();

		lhs.add(new CricPlayer(18,"virat"));
		lhs.add(new CricPlayer(7,"Ms Dhoni"));
		lhs.add(new CricPlayer(45,"Rohit"));
		lhs.add(new CricPlayer(7,"Ms Dhoni"));

		System.out.println(lhs);
}
}
*/
/*
import java.util.*;
class TreeSetDemo{

	public static void main(String []args){
	
		TreeSet ts= new TreeSet();
		ts.add("Kanha");
		ts.add("Ashish");
		ts.add("Rahul");
		ts.add ("Badhe");

		System.out.println(ts);
	}
}
*/

/*
import java.util.*;
class MyClass implements Comparable{

	String str=null;
	MyClass(String str){
	
		this. str=str;

	}
	public int compareTo(Object obj){
	
		return  str. compareTo(((MyClass)obj).str);
	
	}
	public String toString(){
	
		return str;

	}

}
class TreeSetDemo{

	public static void main(String []args){
	
		TreeSet ts=new TreeSet();
		ts.add(new MyClass ("Kanha"));
		ts.add(new MyClass ("Ashish"));
		ts.add(new MyClass ("Rahul"));
		ts.add(new MyClass ("Badhe"));

		System.out.println(ts);

	
	}

}
*/



