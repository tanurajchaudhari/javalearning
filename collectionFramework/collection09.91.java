/*
import java.util.*;
class QueueDemo{

	public static void main(String[]args){
	
		Queue que=new LinkedList();
		que.offer(10);
	        que.offer(20);
		que.offer(50);
		que.offer(30);
		que.offer(40);
                System.out.println("Print que");
		System.out.println(que);
		System.out.println("Print que.poll()");
		que.poll();
		System.out.println("Print que");
	        System.out.println(que);
		System.out.println("que.remove()");
		que.remove();
		System.out.println("Print que");
		System.out.println(que);
		System.out.println("Print que.peek()");
		System.out.println(que.peek());
		System.out.println("Print que.element()");
		System.out.println(que.element());
		System.out.println("Print que");
		System.out.println(que);
	
	}
}
*/
/* 
import java.util.*;
class Pqueue{
	public static void main(String[]args){
		PriorityQueue pq=new PriorityQueue();
		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);
	       System.out.println(pq);
	}
}
*/

/*
import java.util.*;
class PQueueDemo{

	public static void main(String[]args){
	
		PriorityQueue pq=new PriorityQueue();
		pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Rajesh");
		pq.offer("Badhe");
                System.out.println(pq);	
	}
}
*/

/*
import java.util.*;
class Project implements Comparable{
	String pName=null;
	int NoEmp=0;
	float Duration=0;
	Project (String pName,int NoEmp,float duration){
		this.pName=pName;
		this.NoEmp=NoEmp;
		this.Duration=Duration;
	}
	public String toString(){
		return "{"+pName+":"+NoEmp+":"+Duration+"}";
	}
        public  int compareTo(Object obj){
		return pName.compareTo(((Project)obj).pName);
	} 
}
class Demo{
	public static void main(String[]args){
		PriorityQueue pq=new PriorityQueue();
		pq.offer(new Project("Facebook",50,12.5f));
                pq.offer(new Project("Instagram",80,11.5f));
		pq.offer(new Project("Snapchat",70,7.5f));
		pq.offer(new Project("Whatsapp",30,8.5f));
                System.out.println(pq);
	}
}

*/
/*
import java.util.PriorityQueue;
class  Project implements Comparable{

	String projName=null;
	int teamSize=0;
	float duration=0f;
	Project(String projName,int teamSize,float duration){
	
		this.projName=projName;
		this.teamSize=teamSize;
		this.duration=duration;

	}
	@Override
	public int compareTo(Object o){
	
		return projName.compareTo(((Project)o).projName);
	}
	
	public String toString(){
	
		return  "{" + projName + " : "+teamSize + " : "+ duration+"}";
	}
}
class user{

	public static void main(String[]args){
	
		PriorityQueue pq=new PriorityQueue();
		pq.add(new Project("Mission mars",20,20.5f));
		pq.add(new Project("Aditya",15,1.5f));
		pq.add(new Project("Space craft",18,3.0f));
		pq.add(new Project("LeetCode challenge",10,3.5f));
		System.out.println(pq);
	}
}
*/

/*
import java.util.Comparator;
import java.util.PriorityQueue;
class  Project {

        String projName=null;
        int teamSize=0;
        float duration=0f;
        Project(String projName,int teamSize,float duration){

                this.projName=projName;
                this.teamSize=teamSize;
                this.duration=duration;

        }
        

        public String toString(){

                return  "{" + projName + " : "+teamSize + " : "+ duration+"}";
        }
}
class SortedByDuration  implements Comparator{

	@Override
	public int compare(Object o1, Object o2){
	
		return (int)(((Project)o1).duration)-(int)(((Project)o2).duration);
	}
}

class user{
        public static void main(String[]args){
                PriorityQueue pq=new PriorityQueue(new SortedByDuration());
                pq.add(new Project("Mission mars",20,20.5f));
                pq.add(new Project("Aditya",15,1.5f));
                pq.add(new Project("Space craft",18,3.0f));
                pq.add(new Project("LeetCode challenge",10,3.5f));
                System.out.println(pq);
        }
}
*/

/*
import java.util.*;

class Project {

        String pName=null;
        int NoEmp=0;
        int Duration=0;

        Project (String pName,int NoEmp,int duration){

                this.pName=pName;
                this.NoEmp=NoEmp;
                this.Duration=Duration;
        }
        public String toString(){

                return "{"+pName+":"+NoEmp+":"+Duration+"}";

        }
    



}
class SortByDuration implements Comparator{

	public int compare(Object obj1,Object obj2){
	
		return  (((Project)obj1).Duration)-(((Project)obj2).Duration);

	
	}

}
class Demo{

        public static void main(String[]args){

                PriorityQueue pq=new PriorityQueue();
                pq.offer(new Project("Facebook",50,12));
                pq.offer(new Project("Instagram",80,11));
                pq.offer(new Project("Snapchat",70,7));
                pq.offer(new Project("Whatsapp",30,8));

                System.out.println(pq);



        }

}

*/















