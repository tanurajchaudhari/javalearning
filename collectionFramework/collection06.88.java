
/*
import java.util.*;
class  Movies implements Comparable{

	String movieName=null;
	float totColl=0.0f;

	Movies(String movieName,float totColl){
	
		this.movieName=movieName;
		this.totColl=totColl;

	
	}
	public int compareTo(Object obj){
	
		return movieName.compareTo(((Movies)obj).movieName);

	
	}
	public String toString(){
		return movieName;
	}
}
class  TreeSetDemo{
	public static void main(String[]args){
               TreeSet t=new TreeSet();
	       t.add(new Movies("GADAR2",150.00f));
	       t.add(new Movies("OGM2",120.00f));
	       t.add(new Movies("JAILER",250.00f));
	       t.add(new Movies("OMG2",120.00f));
	       System.out.println(t);
	}
}
*/
/*
import java.util.*;
class SortDemo{
	public static void main(String[]args){
		ArrayList al=new ArrayList();
		al.add("Tanuraj");
		al.add("Bhushan");
		al.add("Suyog");
		al.add("Rajveer");
		al.add("Suyog");

		System.out.println(al);
		TreeSet ts=new TreeSet(al);
		System.out.println(ts);
		Collections.sort(al);
		System.out.println(al);
	}
}
*/

/*
import java . util.*;
class Employee{
	String empName=null;
	float sal=0.0f;
	Employee(String empName,float sal){
		this.empName=empName;
		this.sal=sal;
	}
	public String toString(){
		return "{"+empName+":"+sal+"}";
	}
}
class SortByName implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){
	       	return obj1.empName.compareTo(obj2.empName);	
        }
}
class SortBySal implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2){	
		return (int)(obj1.sal-obj2.sal) ;
	}
}
class ListSorDemo{
	public static void main(String[]args){
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee("Kahna",200000.00f));
		al.add(new Employee("Ashish",250000.00f));
		al.add(new Employee("Badhe",150000.00f));
		al.add(new Employee("Rahul",175000.00f));
                al.add(new Employee("Rahul",175000.00f));
		System.out.println(al);
		Collections.sort(al,new SortByName());
		System.out.println(al);
	        Collections.sort(al,new SortBySal());
		System.out.println(al);	
	}
}
*/
/*
import java.util.*;
class movies{
	String movieName=null;
	double totColl=0.0;
	float imdbRating=0.0f;
	movies(String movieName,double totColl,float imdbRating){
		this.movieName=movieName;
		this.totColl=totColl;
		this.imdbRating=imdbRating;
	}
	public String toString(){
		return "{"+movieName+","+totColl+","+imdbRating+"}";
	}
}
class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (((movies)obj1).movieName).compareTo(((movies)obj2).movieName);
	}
}
class SortByColl implements Comparator{
	public  int compare(Object obj1,Object obj2){
		return (int) ((((movies)obj1).totColl)-(((movies)obj2).totColl));
	}
}
class SortByIMDB implements Comparator{
	public int compare(Object obj1,Object obj2){
		return (int) ((((movies)obj1).imdbRating)-(((movies)obj2).imdbRating));
	}
}
class Userlistsort{
	public static void main(String[]args){
		ArrayList al=new ArrayList();
		al.add(new movies("RHTDM",200.00,8.8f));
		al.add(new movies("VED",75.00,7.5f));
		al.add(new movies("SAIRAT",100.00,8.9f));
		al.add(new movies("BAJRAGI",500.00,9.9f));
		System.out.println(al);
                System.out.println("Sort by Name");
		Collections.sort(al,new SortByName());
                System.out.println(al);
                System.out.println("Sort by collection");
		Collections.sort(al,new SortByColl());
                System.out.println(al);
		System.out.println("Sort by imdb");
		Collections.sort(al,new SortByIMDB());
                System.out.println(al);
	}
}
*/


//sorted set methods
import java.util.*;
class SortedSetDemo{
	public static void main(String []args){
		SortedSet ss=new TreeSet();
		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");

		System.out.println(ss);
		System.out.println(ss.headSet("Kanha"));
		System.out.println(ss.tailSet("Kanha"));
		System.out.println(ss.subSet("Ashish","Rahul"));
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss);
	}
}































