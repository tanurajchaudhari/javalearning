/*
import java.util.*;
class CricPlayer{

	int jerNo=0;
	String name=null;

	CricPlayer(int jerNo,String name){
	
		this.jerNo=jerNo;
		this.name=name;
	}
}
class ArrayListDemo{

	public static void main(String[]args){
	
		ArrayList<CricPlayer> al=new ArrayList<>();
		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(7,"Dhoni"));
		al.add(new CricPlayer(45,"Rohit"));
	       
		System.out.println(al);
	}
}
*/


//Output:- it prits the adddressses of the object where jerseyno  and name is stored 


/*
import java.util.*;
class CricPlyer{

        int jerNo=0;
        String name=null;

        CricPlayer(int jerNo,String name){

                this.jerNo=jerNo;
                this.name=name;
       }
        public String toString(){
		return name;	
	}
}
class ArrayListDemo{

        public static void main(String[]args){

                ArrayList al=new ArrayList();
                al.add(new CricPlayer(18,"Virat"));
                al.add(new CricPlayer(7,"Dhoni"));
                al.add(new CricPlayer(45,"Rohit"));

                System.out.println(al);
        }
}
*/

/*
import java.util.*;
class CricPlayer{
        int jerNo=0;
        String name=null;
        CricPlayer(int jerNo,String name){

                this.jerNo=jerNo;
                this.name=name;
        }
        public String toString(){
                return jerNo+" : "+name;
        }
}
class ArrayListDemo{

        public static void main(String[]args){

                ArrayList al=new ArrayList();
                al.add(new CricPlayer(18,"Virat"));
                al.add(new CricPlayer(7,"Dhoni"));
                al.add(new CricPlayer(45,"Rohit"));

                System.out.println(al);
		al.add(1,new CricPlayer(33,"Hardik"));
		System.out.println(al);

		al.clear();
		System.out.println(al);
        }
}
*/
/*
import java.util.*;
class LinkedListDemo{

	public static void main(String[]args){
	
		LinkedList ll=new LinkedList();
		ll.add(20);
		ll.addFirst(10);
		ll.addLast(30);
		System.out.println(ll);
                 
		ll.add(2,25);
		System.out.println(ll);
	}
}
*/

//Cursurs 
//
//Iterator(Universal Cursur)
//public abstract boolean has/next();
//public abstract E next();
//public default void remove();

import java.util.*;
class IteratorDemo{
	public static void main(String[]args){
	
		ArrayList al=new ArrayList();
		al.add("Kahna");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr = al.iterator();
		while(itr.hasNext()){
		
			if("Rahul".equals(itr.next())){
			
				itr.remove();
			}
			//System.out.println(itr.next());
		}
	       System.out.println(al);
	}
}
            
               
