package week11;
import java.util.ArrayList;
public class Task2 {
	public static <T extends Comparable> T Min(ArrayList<T> a) {
		T min=a.get(0);
		for (T i: a) {
			if (min.compareTo(i)>0) min = i;
		}
		return min;
	}
	public static void main(String args[]) {
		ArrayList <Integer> a = new ArrayList();
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(100);
		System.out.println(Min(a));
		
	}
}
