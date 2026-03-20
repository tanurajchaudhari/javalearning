/*
class accessDemo{
	  int x=10;
	 static  int y=20;

	  void fun(){
	  
	  System.out.println(x);
	  System.out.println(y);

	  }
}
class maindemo{
      
      
     public static void main(String[]args){
      
      
      accessDemo obj=new accessDemo();

      obj.fun();

      System.out.println(obj.x);
      System.out.println(obj.y);

      //System.out.println(x);
      System.out.println(accessDemo.y);
      }
}
*/

/*
class employee{
          int emid=10;
          String str="Tanuraj";

          void empinfo(){

          System.out.println("Id:- "+emid);
          System.out.println("Name:- "+str);
          }
}
class maindemo{
     public static void main(String[]args){
      employee emp1=new employee();
      emp1.empinfo();
      System.out.println(emp1.emid);
      System.out.println(emp1.str);

      }
}
*/
/*
class employee{
          int emid=10;
          String str="Tanuraj";
          static int y=50;
          void empinfo(){
          System.out.println("Id:- "+emid);
          System.out.println("Name:- "+str);
          System.out.println("Y:- "+y);
          }
}
class maindemo{
     public static void main(String[]args){
      employee emp1=new employee();
      employee emp2=new employee();

     emp1.empinfo();
     emp2.empinfo();
     
     emp2.emid=20;
     emp2.str="Rahul";
//     emp2.y=5000;
     employee.y=54321;
     System.out.println("******************************************************");
     emp1.empinfo();
     emp2.empinfo();
      }
}
*/

