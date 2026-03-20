/*
 here i use  java programming language for so;vet the problem 
 1. fist we take coordinates  of cab location in arraylist 
 2. pass the arraylist and customer coordinates 
 */

import java.util.ArrayList;
import java.util.List;

class tanuraj{
	//function for  find the distance
	static double finddistance(double customerX,double customerY,double  distanceX,double distanceY){
	   //we use Eucliden formula ,
		return Math.sqrt(Math.pow(distanceX-customerX,2)+Math.pow(distanceY-customerY,2));
		
	}
       static double[] findcloselocation(double customerX,double customerY,List<double[]> cablocations){
       
	       double minDistance = Integer.MAX_VALUE;
	       double[] closecab=null;


	       for(double [] cab:cablocations){
	       
		       double cabx=cab[0];
		       double caby=cab[1];
		      double distance=finddistance(customerX,customerY, cabx, caby);
		       if(distance<minDistance){
		       
			       minDistance=distance;
			       closecab=cab;
		       }
	       }
	       return closecab;
       
       }

	public static void main (String []args){
	//here we creat ArrayList to store the arrays in it
		List<double[]> cablocations=new ArrayList<>();
		// here we add the arrays in  arraylist
		cablocations.add(new double[]{0,0});
		cablocations.add(new double[]{3,4});
		cablocations.add(new double[]{1,5});
                double customerX=2;double customerY=3;
                // here we call the function of finding the closed distance from customer  and cab
		double[] nearcablocation=findcloselocation(customerX,customerY,cablocations);
		System.out.println("Near cablocations is ("+nearcablocation[0]+","+nearcablocation[1]+")");

  

	}

}
