class demo{

	void fun(int x){
	
		System.out.println(x);
	
	}
	void fun(float x){
	
		 System.out.println(x);
	
	}

	void fun(demo obj){
	
		 System.out.println(obj);
	
	
	
	}
	public static void main(String[]args){
	
		demo obj=new demo();

		obj.fun(10);
		obj.fun(10.5f);

		demo obj1=new demo();
		obj1.fun(obj);

	
	
	}



}
