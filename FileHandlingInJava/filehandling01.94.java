/*
import java.io.*;
class fileDemo{

	public static void main(String[]args)throws IOException{
	
		File fobj1=new File("Core2Web");
		fobj1.createNewFile();
		System.out.println(fobj1.isFile());
		File fobj2=new File("Incubator");
		fobj2.mkdir();
                File fobj3=new File("Incubator","code1");
		fobj3.createNewFile();
		File fobj4=new File(fobj2,"code2");
		fobj4.createNewFile();
                  

               

	
	}

}
*/


/*
import java.io.*;
class fileDemo{

	public static void main(String[]args)throws IOException{
	
		File fobj1=new File("Incubator.txt");
                fobj1.createNewFile();
		System.out.println(fobj1.getName());
                System.out.println(fobj1.getParent());
	        System.out.println(fobj1.getPath());
	        System.out.println(fobj1.getAbsolutePath());
	        System.out.println(fobj1.canRead());
	        System.out.println(fobj1.canWrite());
	        System.out.println(fobj1.isDirectory());
	        System.out.println(fobj1.isFile());	
	
	}

}
*/
import java.io.*;
class fileDemo{

	public static void main(String[]args){
	
		File fobj=new File("/home/tanuraj2002/JAVAONLINUX/FileHandlingInJava");
		System.out.println(fobj.exists());
		String[] Files=fobj.list();
		int countfile=0;
		int countfoldr=0;

		for(String str: Files){
		
			File f=new File(str);
			if(f.isFile()){
			
				countfile++;
			}else{
			
				countfoldr++;

			}
			

		
		}
		        System.out.println("filecount:-"+countfile);
                        System.out.println("foldrcount:- "+countfoldr);
	
	}

}













