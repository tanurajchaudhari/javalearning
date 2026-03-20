/*
import java.util.*;
class HashMapDemo{
	public static void main(String[]args){
		HashSet hs=new HashSet();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		System.out.println(hs);
		HashMap hm=new HashMap();
		hm.put("Kanha","Infosys");
		hm.put("Ashish","Barclays");
		hm.put("Badhe","Carpro");
		hm.put("Rahul","BMC");
		System.out.println(hm);
	}
}
*/

/*
import java.util.*;
class HashMapDemo{
	public static void main(String []args){
		HashMap hm=new HashMap();
                hm.put("Kanha","Infosys");
                hm.put("Ashish","Barclays");
                hm.put("Kanha","Carpro");
                hm.put("Rahul","BMC");
                System.out.println(hm);
	}
}
*/

/*
//LinkeHashMap
//LinkedHshMap preserves the insertion order of data but HashMap Doesnot preservee that orderimport java.util.*;
import java.util.*;
class HashMapDemo{
        public static void main(String []args){
                LinkedHashMap lhm=new LinkedHashMap();
                lhm.put("Badhe","Infosys");
                lhm.put("Ashish","Barclays");
                lhm.put("Kanha","Carpro");
                lhm.put("Rahul","BMC");
                System.out.println(lhm);
        }
}
*/

/*
//Methods in HashMap class
import java.util.*;
class HashMapMethods{
	public static void main(String[]args){
		HashMap hm=new HashMap();
		hm.put("Java",".Java");
		hm.put("Python",".Python");
		hm.put("Dart",".Dart");
		System.out.println(hm);
		//getm methods
		System.out.println("get methods"); 
		System.out.println(hm.get("Python"));
		//KeySet
		System.out.println("keyset methods"); 
                 System.out.println(hm.keySet());
		 //values
		System.out.println("values methods"); 
		 System.out.println(hm.values());
		 //entrySet 
                 System.out.println("entryset methods"); 
		 System.out.println(hm.entrySet());
	}
}
*/

/*
//System.out.println(ihm);
//IdentityHashMap 
import java.util.*;
class IdentityHashMapDemo{

	public static void main(String[]args){
	
		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put(new Integer(10),"Kanha");
		ihm.put(new Integer(10),"Rahul");
		ihm.put(new Integer(10),"Badhe");
	        
                System.out.println(ihm);
               
	        ihm.put(10,"Kanha");
                ihm.put(10,"Rahul");
                ihm.put(10,"Badhe");

		System.out.println(ihm);
	}

}
*/
/*
import java.util.*;
class Demo{
        String str;
	Demo(String str){
	
		this.str=str;
	
	}
        public String toString(){
	
		return str;

	
	}
	public void finalize(){
	
		System.out.println("Notify");
	
	}
}
class GCDemo{

	public static void main(String[]args){
	
		Demo obj1=new Demo("Tanuraj");
		Demo obj2=new Demo("Dattatray");
		Demo obj3=new Demo("Chaudhari");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
                
		obj1=null;
		obj2=null;

		System.gc();

		System.out.println("In Main");	
	}
}
*/



import java.util.*;
class Demo{
        String str;
        Demo(String str){

                this.str=str;

        }
        public String toString(){

                return str;
        }
        public void finalize(){

                System.out.println("Notify");

        }
}
class GCDemo{
        public static void main(String[]args){
                Demo obj1=new Demo("Tanuraj");
                Demo obj2=new Demo("Dattatray");
                Demo obj3=new Demo("Chaudhari");
               WeakHashMap hm=new WeakHashMap();
	       hm.put(obj1,2016);
	       hm.put(obj2,2019);
	       hm.put(obj3,2023);
	      System.out.println(hm);
              obj1=null;
              System.gc();
              System.out.println(hm);
              System.out.println("In Main");
        }
}


