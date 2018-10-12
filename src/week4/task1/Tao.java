package week4.task1;

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
