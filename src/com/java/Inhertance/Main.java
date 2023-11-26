package com.java.Inhertance;

public class Main {

	public static void main(String[] args) {
//         Box b=new Box();
//		   Box b2=new Box(b);
//         System.out.println(b.h+" "+b.l+" "+b.w);
		
		
		BoxWeight bw=new BoxWeight();
		BoxWeight box4=new BoxWeight(2,3,45,5);
		System.out.println(bw.h +" "+ bw.weight);
		
		Box box5=new BoxWeight(2,4,5,6);
		System.out.println(box5);
//		it is type of a reference variable not the type of object
//		that determines what member can be access
		
		
//		there are many variable in both parent and child class
//		you are given access to variable that are in the ref type i.e. BoxWeight
//		hence, you should have access to weight variable
//		this also means, that the once you are tying to access should be initialized
//		but here, when the obj itself is of type parent class, how u will call the constructor child class
//		BoxWeight box6=new Box(2,3,4);
		
	}

}
 

// although the subclass include the member of super class 
// will not able to access private member

// parent class does not access child class