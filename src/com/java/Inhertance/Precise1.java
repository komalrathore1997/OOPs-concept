package com.java.Inhertance;

public class Precise1 {
    public static void main(String[] args) {
		AA a=new BB();
//		a.m2();
		a.m1();
	}
}

class AA{
	void m1() throws ArrayIndexOutOfBoundsException {
		System.out.println("In m1 A");
	}
}

class BB extends AA{
	void m1() throws IndexOutOfBoundsException{
		System.out.println("In m1 B");
	}
	
	void m2() {
		System.out.println("In m1 B");
	}
}

