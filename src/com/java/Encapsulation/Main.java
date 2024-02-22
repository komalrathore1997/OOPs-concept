package com.java.Encapsulation;

public class Main {
   public static void main(String[] args) {
	Test obj=new Test();
	System.out.println("first:"+obj.x +""+obj.y);
//	System.out.println(fun());
	
//	compile time error because main method is static and fun() is not static 
}
 int fun() {
	
	return 20;
}
}

class Test{
	protected int x,y;
}
