package week4.task1;

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
