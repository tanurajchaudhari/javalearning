/*
import java.util.*;
class TreeMapDemo{
	public static void main(String[] args){
		TreeMap tm=new TreeMap();
		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("Sl","SriLamka");
		tm.put("Aus","Australia");
		tm.put("Bang","Bangladesh");
                System.out.println(tm);
	}
}

*/
/*
import java.util.*;
class Platform implements Comparable{
	String str=null;
	int  FoundYear=0;
	Platform(String str,int FoundYear){
		this.str=str;
		this.FoundYear=FoundYear;
	
	}
	public String toString(){
	
		return "{"+str+":"+FoundYear+"}";
	}
        public int compareTo(Object obj){
	
		return this.FoundYear-((Platform)obj).FoundYear;
	
	}
}
class TreeMapDemo{
	public static void main(String[]args){
		TreeMap tm=new TreeMap();
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2013),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("ChatGPt",2022),"OpenAI");
		System.out.println(tm);
	}
}
*/

/*
//using comparator 
import java.util.*;
class Platform{

	String str=null;
	int FoundYear=0;

	Platform(String str,int FoundYear){
	
		this.str=str;
		this.FoundYear=FoundYear;
	} 
	public String toString(){
		return "{"+str+":"+FoundYear+"}";
	} 
}
class  SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
	
		return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}
class TreeMapDemo{
	public static void main(String[]args){
		TreeMap tm=new TreeMap(new SortByName());              // use sortbyname is pass
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2013),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("ChatGPT",2022),"OpenAI");
		//Collections.sort(tm);    it is not working on treeMap
		System.out.println(tm);
	}
}
*/

/*
//SortedMapt

import java.util.*;
class SortedMapDmeo{

	public static void main(String[]args){
	
		SortedMap sm=new TreeMap();

                sm.put("Ind","India");
                sm.put("Pak","Pakistan");
                sm.put("Sl","SriLamka");
                sm.put("Aus","Australia");
                sm.put("Bang","Bangladesh");
                System.out.println(sm);
	        //subMap
	        System.out.println("Submap Aus , pak");
		System.out.println(sm.subMap("Aus","Pak"));
                //headMap

	        System.out.println("headmap  pak");
		System.out.println(sm.headMap("Pak"));
		//tailMap

	        System.out.println("tailmap  pak");
		System.out.println(sm.tailMap("Pak"));
		//firstKey
		
	        System.out.println("firstkey");
		System.out.println(sm.firstKey());
		//lastKey
		
	        System.out.println("lastkey");
		System.out.println(sm.lastKey());
		//keySet

	        System.out.println("keyset ");
		System.out.println(sm.keySet());
		//values

	        System.out.println("values ");
		System.out.println(sm.values());
		//entrySet

	        System.out.println("entryset");
		System.out.println(sm.entrySet());
	}

}
*/

/*
//Iterating over map
import java.util.*;
class IteratorMapDemo{
	public static void main(String[]args){
	
		SortedMap sm=new TreeMap();
		
		sm.put("Ind","India");
                sm.put("Pak","Pakistan");
                sm.put("Sl","SriLamka");
                sm.put("Aus","Australia");
                sm.put("Bang","Bangladesh");

		Set<Map.Entry>data=sm.entrySet();
		System.out.println(data);
		Iterator<Map.Entry> itr=data.iterator();
		while(itr.hasNext()){
		    // System.out.println(itr.next());
			Map.Entry abc=itr.next();
			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}
*/

/*
// Hashtable +Dictionary
import java.util.*;
class HashtableDemo{
	public static void main(String[]args){
	
		Hashtable ht=new Hashtable();
		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(18,"Virat");
		ht.put(1,"KlRahul");
		ht.put(45,"Rohit");
		System.out.println(ht);	
	}
}
*/


/*
import java.util.*;
class DictionaryDemo{

        public static void main(String[]args){

                Dictionary D=new Hashtable();
                D.put(10,"Sachin");
                D.put(7,"MSD");
                D.put(18,"Virat");
                D.put(1,"KlRahul");
                D.put(45,"Rohit");
                System.out.println(D);
                
		//keys
		Enumeration eitr1= D.keys();
		while(eitr1.hasMoreElements()){
		
			System.out.println(eitr1.nextElement());

		
		}
		//Elements
		Enumeration eitr2=D.elements();
		while(eitr2.hasMoreElements()){
		
			System.out.println(eitr2.nextElement());

		}
		//get
		System.out.println(D.get(10));
                //D.remove
		D.remove(1);
		System.out.println(D);

        }
}
*/

/*
//Properties
import java.util.*;
import java.io.*;
 class PropertiesDemo{

	 public static void main(String[]args)throws IOException{
	 
		 Properties obj=new Properties();

		 FileInputStream fobj= new FileInputStream("friends.properties");
		 obj.load(fobj);
		 System.out.println(obj);
		 String name=obj.getProperty("Abhay");
		 System.out.println(name);
                 
		 obj.setProperty("Tanuraj","Amazon");
		 System.out.println(obj);

		 FileOutputStream outobj = new FileOutputStream("friends.properties");
		 obj.store(outobj,"Updated By Tanuraj");	 
	 }
 }
*/


//NavigableSet 
//
import java.util.*;
class NavigableSetDemo{
	public static void main(String[]args){
		NavigableSet ns=new TreeSet();
		ns.add(10);
		ns.add(13);
		ns.add(15);
		ns.add(22);
		ns.add(27);
		System.out.println(ns);
		//E lower(E)
		System.out.println(ns.lower(15));
                //flower
		System.out.println(ns.floor(15));
                //ceiling
		System.out.println(ns.ceiling(15));
		//higher
		System.out.println(ns.higher(15));
		//pollfirst
		//System.out.println(ns.pollFirst());
		//pollLast
		//System.out.println(ns.pollLast());
		//Iterator();
		//System.out.println(ns.lower(15));
		//System.out.println(ns);
		//descendingSet()
		System.out.println(ns.descendingSet());
		//Iterator
		Iterator itr=ns.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//deacendingIterator
                Iterator itr1=ns.descendingIterator();
                while(itr1.hasNext()){
                        System.out.println(itr1.next());
                }
		//subSet()
		System.out.println(ns.subSet(10,true,22,false));
		//headSet()
 		System.out.println(ns.headSet(22,true));
                //tailSet()
		System.out.println(ns.tailSet(22,true));
                //subSet
		System.out.println(ns.subSet(10,22));
                //headSet()
		System.out.println(ns.headSet(15));
		//tailSet
		System.out.println(ns.tailSet(15));
	}

}










