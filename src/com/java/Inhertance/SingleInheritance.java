package com.java.Inhertance;


class A{
	public void methodA() {
		System.out.println("Base class Method:  ");
	}
}

class B extends A{
	public void methodB(){
		System.out.println("Child class Method ");
	}
}
public class SingleInheritance {
    public static void main(String[] args) {
		B obj=new B();
		obj.methodA();
		obj.methodB();
	}
}


