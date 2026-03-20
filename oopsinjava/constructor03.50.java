class Core2Web{
   int nocourses=10;
   String favcourse="Java with oops ";
   void display(){
   System.out.println(nocourses);
   System.out.println(favcourse);
   }
} 
class student{
  public static void main(String[]args){
  
  Core2Web obj=new Core2Web();
  Core2Web obj1=new Core2Web();

  System.out.println(System.identityHashCode(obj));
  System.out.println(System.identityHashCode(obj1));
  obj.display();

  System.out.println(obj.nocourses);
  System.out.println(obj.favcourse);
  
 } 
}
