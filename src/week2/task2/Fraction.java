package week2.task2;

import java.lang.Math;

public class Fraction {
	private int numerator;
	private int denominator;
	
    public Fraction(int numerator, int denominator) {
    	this.numerator = numerator;
    	this.denominator = denominator;
    }
    
    public static Fraction simplify(Fraction fra) {
    	boolean task = true;
    	if (fra.numerator!=0) {
    	if (fra.numerator*fra.denominator<0) task = false;
    	fra.numerator = Math.abs(fra.numerator);
    	fra.denominator = Math.abs(fra.denominator);
    	int a = fra.numerator;
    	int b = fra.denominator;
        while (a!=b) if (a>b) a=a-b; else b=b-a;
        fra.numerator /= a;
        fra.denominator /= b;
        if (task == false ) {
        	fra.numerator = -fra.numerator;
        } 
    	}
        return fra;
    }

    public Fraction add(Fraction other) {
        Fraction fra = new Fraction(0,0);
        fra.denominator = this.denominator * other.denominator;
        fra.numerator = this.numerator*other.denominator+this.denominator*other.numerator;
    	return simplify(fra);
    }

    public Fraction subtract(Fraction other) {
    	Fraction fra = new Fraction(0,0);
        fra.denominator = this.denominator * other.denominator;
        fra.numerator = this.numerator*other.denominator-this.denominator*other.numerator;
    	return simplify(fra);
    }

    public Fraction multiply(Fraction other) {
    	Fraction fra = new Fraction(0,0);
        fra.denominator = this.denominator * other.denominator;
        fra.numerator = this.numerator*other.numerator;
    	return simplify(fra);
    }

    public Fraction divide(Fraction other) {
    	Fraction fra = new Fraction(0,0);
        fra.denominator = this.denominator * other.numerator;
        fra.numerator = this.numerator*other.denominator;
    	return simplify(fra);
    }
    public boolean equals(Fraction other) {
    	Fraction fra = new Fraction(0,0);
    	fra = this.divide(other);
    	if (fra.numerator==1) return true;
    	else return false;
    } 
}
