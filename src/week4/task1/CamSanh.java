package week4.task1;

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
