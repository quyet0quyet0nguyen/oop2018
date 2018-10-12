package week4.task2;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}
	public Rectangle(double width,double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length,String color,boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return 2*(width+length);
	}
	public double getPerimeter() {
		return width*length;
	}
	public String toString() {
		return "width : "+width+" length : "+length+super.toString();
	}
	public static void main(String [] args) {
		Rectangle rec = new Rectangle(4,5,"blue",true);
		System.out.println(rec);
	}
}
