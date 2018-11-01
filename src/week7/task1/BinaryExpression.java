package week7.task1;

public class Division extends BinaryExpression{
	protected Expression left;
	protected Expression right;
	
	public Division(Expression E1,Expression E2) {
		this.left = E1;
		this.right = E2;
	}
	
	@Override
	public Expression left() {
		return left;
	}

	@Override
	public Expression right() {
		return right;
	}

	@Override
	public String toString() {
		return ("("+left.toString()+") /"+right.toString());
	}

	@Override
	public int evaluate() {
		return left.evaluate()/right.evaluate();
	}

}
