package week4.task1;

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
