package week7.task1;

import java.io.IOException;

public class Subtraction extends BinaryExpression{
	protected Expression left;
	protected Expression right;
	
	public Subtraction(Expression E1,Expression E2) {
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
		return (left.toString()+" - "+right.toString() );
	}

	@Override
	public int evaluate() {
			return left.evaluate()-right.evaluate();
	}
}
