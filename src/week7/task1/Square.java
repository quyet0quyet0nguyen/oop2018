package week7.task1;

public class Square extends Expression{
	protected Expression expression;
	
	public Square(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return ("("+expression.toString()+")"+"^2");
	}

	@Override
	public int evaluate() {
		return expression.evaluate()*expression.evaluate();
	}
	
}
