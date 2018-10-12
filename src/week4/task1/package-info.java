/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
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
