package week2.task2;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public static void main (String args[]) {
		Fraction fra1 = new Fraction(5,6);
		Fraction fra2 = new Fraction(25,30);
		Fraction fra3 = new Fraction(0,1);
		fra3 = fra1.multiply(fra2);
		fra3.getFraction();
	}
	
    public Fraction(int numerator, int denominator) {
    	this.numerator = numerator;
    	this.denominator = denominator;
    }
    
    public void getFraction() {
    	if (this.denominator==0) 
    		System.out.println("Khong xac dinh");
    	else if (this.denominator==1) 
    		System.out.println(this.numerator);
    	else 
    		System.out.println(this.numerator+"/"+this.denominator);
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
