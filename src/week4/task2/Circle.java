package week4.task2;

public class Circle extends Shape{
	protected double radius;
	protected final double Pi = 3.1415926535897;
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 2*Pi*radius;
	}
	public double getPerimeter() {
		return Pi*radius*radius;
	}
	public String toString() {
		return "Radius : "+radius+super.toString();
	}
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		System.out.println(circle+" Area : "+ circle.getArea()+" Perimeter : "+circle.getPerimeter());
	}
}
