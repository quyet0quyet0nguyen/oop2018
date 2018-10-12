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

public class Cam  extends HoaQua{
	protected String origin;
	protected String dayOut;
	public Cam() {
		super();
		origin = "Singapore";
		dayOut = "1/1/2018";
	}
	public Cam(String origin,String dayOut) {
		this.origin = origin;
		this.dayOut = dayOut;
	}
	public Cam(String shape,String color,String origin,String dayOut) {
		super(shape,color);
		this.origin = origin;
		this.dayOut = dayOut;
	}
	public void setOrigin(String origin){
        this.origin=origin;
    }
	public String getOrigin(){
        return this.origin;
    }
	public void setDayOut(String dayOut){
        this.dayOut=dayOut;
    }
	public String getDayOut(){
        return dayOut;
    }
	public String toString() {
		return super.toString()+" nguon goc : "+origin+" ngay ban : "+dayOut;
	}
	public static void main(String [] args) {
		Cam cam = new Cam("China","20/10/2018");
		System.out.println(cam);
	}
}

public class Tao extends HoaQua{
	protected String type;
	protected String dayOut;
	public Tao() {
		super();
		type = "tao tau";
		dayOut = "1/1/2018";
	}
	public Tao(String type,String dayOut) {
		this.type = type;
		this.dayOut = dayOut;
	}
	public Tao(String shape,String color,String type,String dayOut) {
		super(shape,color);
		this.type = type;
		this.dayOut = dayOut;
	}
	public void setType(String type){
        this.type=type;
    }
	public String getType(){
        return this.type;
    }
	public void setDayOut(String dayOut){
        this.dayOut=dayOut;
    }
	public String getDayOut(){
        return dayOut;
    }
	public String toString() {
		return super.toString()+" loai : "+type+" ngay ban : "+dayOut;
	}
	public static void main(String [] args) {
		Tao Tao = new Tao("My","20/10/2018");
		System.out.println(Tao);
	}
}

public class CamSanh extends Cam {
	protected double weight;
	protected double cost;
	public CamSanh() {
		this.weight = 0;
		this.cost = 0;
	}
	public CamSanh(double weight,double cost) {
		this.weight = weight;
		this.cost = cost;
	}
	public CamSanh(String shape,String color,String origin,String dayOut,float weight,float cost) {
		super(shape,color,origin,dayOut);
		this.weight = weight;
		this.cost = cost;
	}
	public void setWeight(float weight) {
        this.weight = weight;
    }
	public double getWeight() {
        return weight;
    }
	public void setCost(float cost) {
        this.cost = cost;
    }
	public double getCost() {
        return cost;
    }
	public String toString() {
		return super.toString()+" weight : "+weight+" cost : "+cost;
	}
	public static void main(String[] args) {
		CamSanh camsanh = new CamSanh(3.4, 23.7);
		System.out.println(camsanh);
	}
}

public class CamThanhPhong extends Cam{
	protected int amount;
	protected double cost;
	public CamThanhPhong() {
		this.amount= 0;
		this.cost = 0;
	}
	public CamThanhPhong(int amount,double cost) {
		this.amount = amount;
		this.cost = cost;
	}
	public CamThanhPhong(String shape,String color,String origin,String dayOut,int amount,float cost) {
		super(shape,color,origin,dayOut);
		this.amount = amount;
		this.cost = cost;
	}
	public void setAmount(int amount) {
        this.amount = amount;
    }
	public double getAmount() {
        return amount;
    }
	public void setCost(float cost) {
        this.cost = cost;
    }
	public double getCost() {
        return cost;
    }
	public String toString() {
		return super.toString()+" amount : "+amount+" cost : "+cost;
	}
	public static void main(String[] args) {
		CamThanhPhong camthanhPhong = new CamThanhPhong(240, 23.7);
		System.out.println(camthanhPhong);
	}

}
