/*
class outer{
	outer(){
	
		System.out.println("In outer constructor");
	}
	void m1(){
		System.out.println("In m1 ouoter");
		class inner{
			inner(){
			
				System.out.println("In inner constructor");
			}
			void m1(){
				System.out.println("In m1 inner");
		}
		}
            inner obj=new inner();
	    obj.m1();
	}
	void m2(){
		System.out.println("In m2 outer");
	}
}
class client{
	public static void main(String[]args){
		outer obj=new outer();
		obj.m1();
		obj.m2();
	}
}

*/

class outer{
        Object m1(){
                System.out.println("In m1 ouoter");
                class inner{
			inner(){
			
				System.out.println("In inner  constructor ");
			}
                        void m1(){
                                System.out.println("In m1 inner");
                        }
                }
              inner objinner = new  inner();
	      objinner.m1();
              return objinner;
           //return new inner();
        }
        void m2(){
                System.out.println("In m2 outer");
        }
}
class client{
        public static void main(String[]args){

                outer obj=new outer();
               // obj.m1().m1();
                obj.m1(); 
        }
}

