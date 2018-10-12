package week4.task2;

public class Square extends Rectangle{
	public Square() {
		super(1.0,1.0);
	}
	public Square(double side) {
		super(side,side);
	}
	public Square(double side, String color, boolean filled){ 
        super(side, side,color,filled);                       
    }
	public double getSide() {
		return super.getLength();
		
	}
	public void setSide(double Side) {
		super.setLength(Side);
		super.setWidth(Side);
	}
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		Square vuong = new Square(6);
		System.out.println(vuong);
	}
}
