/*
import java.io.*;
class FileDemo{

	public static void main(String[]ars)throws IOException{
	
		FileWriter fw= new FileWriter("Incubators.txt");
                fw.write("Flutter");
		fw.write("Frontend");
		fw.write("Backend");
	        
		fw.close();

	}


}
*/

/*
import java.io.*;
class Filedemo{

	public static void main(String[]args)throws IOexception{
	
		File f=new File("Incubators.txt");
		FileWriter fw=new FileWriter(F,true);
		fw.write("testing\n");
		fw.write("Devops\n");
		fw.write("SalesForce\n");
	        fw.close();

	}

}
*/

/*
import java.io.*;

class FileReaderDemo{

	public static void main(String[]args)throws IOException {
	
	
		FileReader fr=new FileReader("Incubator.txt");
		int data =fr.read();
		 while(data!=-1){
		 
			 System.out.print((char)data);
			 data=fr.read();
		 
		 }
		 fr.close();

	
	}

}


*/

//Serializtion And deserialization
//
import java.io.*;
class Employee implements Serializable{

	int empId;
	String empName;
	Employee(int empId,String empName){
	
		this.empId=empId;
		this. empName=empName;
	}
}
class  SerialDemo{

	public static void main(String[]args)throws Exception{
	
		FileOutputStream fos=new fileOutputStream("EmployyeData.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		Employee obj1=new Employee (1,"Kanha");
		Employee obj2=new Emplyoee(2,"Rahul");

		oos.writeObject(obj1);
		oos.writeObject(obj2);

		oos.close();
		fos.close();

	
	
	}

}

class DeserialDemo{

	public static void main(String[]args){
	
		fileInputStream fis=new FileInputStream("Employee.txt");

		ObjectInputStream ois =new ObjectInputStream(fis);

		Employee fileObj1=(Employee)ois.readObject();
		Employee fileObj2=(Employee)ois.readObject();
	        
		System.out.println(fileObj1.empId);
		System.out.println(fileObj1.empName);
		System.out.println(fileObj2.empId);
		System.out.println(fileObj2.empName);
	
	}

}



















