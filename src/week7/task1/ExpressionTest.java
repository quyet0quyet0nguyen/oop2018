package week7.task1;

public class ExpressionTest {
	public static void main(String args[]){
		Expression e1 = new Square(new Numeral(10));
		Expression e2 = new Numeral(1);
		Expression e3 = new Subtraction(e1,e2);
		Expression e4 = new Multiplication(new Numeral(2),new Numeral(3));
		Expression e5 = new Addition(e3,e4);
		Expression e6 = new Square(e5);
		Expression e7 = new Numeral(1);
		Expression e8 = new Division(e6,e7);
		try {
			if (e7.evaluate()==0) {
				throw new ArithmeticException();
			} else {
				System.out.println(e8+" = "+e8.evaluate());
			}
		} catch(ArithmeticException e){
			System.out.println("Error: Can not divide by Zero");
		}	
	}
  
}
