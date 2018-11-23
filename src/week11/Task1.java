package week11;

import java.util.ArrayList;

public class Task1 {
	public static <T extends Comparable> ArrayList sapxep(ArrayList<T> a) {
		T c;
		a.sort(null);
		return a;
	}
	public static void main(String args[]) {
		ArrayList <Integer> a = new ArrayList();
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(0);
		sapxep(a);
		for (int i:a) {
			System.out.println(a.get(i));
		}
		
	}
}
