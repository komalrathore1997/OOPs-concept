package com.java.Inhertance;

public class BoxWeight extends Box{
    double weight;
    
    public BoxWeight(){
    	this.weight=-1;
    }

	public BoxWeight(Box old) {
		super(old);
		// TODO Auto-generated constructor stub
	}

	public BoxWeight(double l, double h, double w,double weight) {
		super(l, h, w); //what is this? call the parent class constructor
         // use to initialize values parent in parent class
		this.weight=weight;
		
	}
    
    
}
