package com.java.Encapsulation;

public class Main1 {
   public static void main(String[] args) {
	   Base x=new Base();
	   Base y=new DerivedClass();
	   DerivedClass z=new DerivedClass();
	   DoPrint(x);
	   DoPrint(y);
	   DoPrint(z);
	   
}

private static void DoPrint(Base o) {
	o.print();
	
}
}
class Base{
	public void print() {
		   System.out.println("Base");
	}
}


class DerivedClass extends Base{
	public void print() {
		   System.out.println("Derived");
	}
}

//base, derived,derived
