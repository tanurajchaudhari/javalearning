
/*
class player{

	private int jerNo=18;
        private String name=null;

	player(int jNo,String pName){
	        jerNo=jNo;
		name=pName;
		System.out.println("In constructor");
		
	} 
	void info(){

	
		System.out.println(jerNo+"  =  "+name);
	
	
	}


} 
class client{
 
	public static void  main(String[]args){
	
		player obj1=new player(7,"MSD");
		obj1.info();
               
	    	player obj2=new player(45,"Rohit");
		
                obj2.info();
	  
	        player obj3=new player(18,"virat");
                obj3.info();
	}


}
*/
/*
class player{

        private int jerNo=18;
        private String name=null;

        player(int jerNo,String name){
                this.jerNo=jerNo;
                this.name=name;
                System.out.println("In constructor");

        }
        void info(){


                System.out.println(jerNo+"  =  "+name);


        }


}
class client{

        public static void  main(String[]args){

                player obj1=new player(7,"MSD");
                obj1.info();

                player obj2=new player(45,"Rohit");

                obj2.info();

                player obj3=new player(18,"virat");
                obj3.info();
        }


}
*/
/*

class player{

        private int jerNo=18;
        private String name=null;

        player(int jerNo,String name){
		
                this.jerNo=jerNo;
                this.name=name;
                System.out.println("In constructor");

        }
        void info(){


                System.out.println(jerNo+"  =  "+name);


        }


}
class client{

        public static void  main(String[]args){

                player obj1=new player(7,"MSD");
                obj1.info();

                player obj2=new player(45,"Rohit");

                obj2.info();

                player obj3=new player(18,"virat");
                obj3.info();
        }


}

*/

/*

class player{

        private int jerNo=100;
        private String name="tanuraj";

        player(int jerNo,String name){
		
		//System.out.println("In constructor");
		System.out.println(this.name);
		System.out.println(System.identityHashCode(this.name));
		System.out.println(name);
                System.out.println(System.identityHashCode(name));
		
		this.jerNo=jerNo;
                this.name=name;
                System.out.println("in constructor");
                
		System.out.println(this.name);
                System.out.println(System.identityHashCode(this.name));
                                                     
		System.out.println(name);
		System.out.println(System.identityHashCode(name));
                 
        }
        void info(){
                System.out.println(jerNo+"  =  "+name);
                System.out.println("************************************************");
        }
}
class client{

        public static void  main(String[]args){

                player obj1=new player(7,"MSD");
                obj1.info();
             
                player obj2=new player(45,"Rohit");

                obj2.info();

                player obj3=new player(18,"virat");
                obj3.info();
	}

}
*/

