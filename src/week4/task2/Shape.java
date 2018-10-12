package week4.task2;

class Shape{
	protected String color;
	protected boolean filled;
	public Shape() {
		color = "red";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return (" color : "+color+" filled : "+filled);
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		System.out.println(shape);
	}
}
