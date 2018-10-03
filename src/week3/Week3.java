package week3;

public class Week3 {

    public static int max(int m, int n) {
        if (m>n) return m;
        return n;
    }

    public static int minOfArray(int[] array) {
        int i = array[0];
        for (int j = 1;j<array.length;j++)
        	if (array[j]<i) i=array[j];
		return i;
    }

    public static String calculateBMI(double weight, double height) {
    	double BMI =  weight/(height*height);
    	BMI = (double) Math.round(BMI*100.0)/100.0;
    	if (BMI <18.5) return "Thieu can";
    	else if (18.5<=BMI&&(BMI<23)) return "Binh thuong";
    	else if (23<=BMI&&(BMI<=24.99)) return "Thua can";
    	else return "Beo phi";
    }
}

