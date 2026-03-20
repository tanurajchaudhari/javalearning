/*
class outer{

	class inner {
	
		void fun2(){
		
			System.out.println("Fun 2 inner");
		
		}	
	
	}
	void fun1(){
	
		System.out.println("Fun 1 outer");
	
	
	}

}

class client{

    public static void main(String[]args){
    
    
	    outer obj=new outer();
	    obj.fun1();

	    outer.inner obj1=obj.new inner();

	    obj1.fun2();

    }


}
*/


class outer{

	int x=10;
	int y=20;
        class inner {

                void fun2(){

                        System.out.println("Fun 2 inner");
			System.out.println(x);
			System.out.println(y);

                }
        }
        void fun1(){

                System.out.println("Fun 1 outer");
        }
}

class client{

    public static void main(String[]args){


            outer obj=new outer();
            obj.fun1();

            outer.inner obj1=obj.new inner(); 

            obj1.fun2();
    }
}

