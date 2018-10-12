package week4.task1;

public class HoaQua {
	protected String shape;
	protected String color;
	public HoaQua() {
		shape = "shape";
		color = "red";
	}
	public HoaQua(String shape,String color) {
		this.shape = shape;
		this.color = color;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getShape() {
		return shape;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return (" shape : "+shape+" color : "+color);
	}
	public static void main(String[] args) {
		HoaQua hoaqua = new HoaQua();
		System.out.println(hoaqua);
	}
}
