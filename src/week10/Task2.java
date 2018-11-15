package week10;

import java.util.Random;

public class Task2 {
	public static void main(String args[]) {
		float[] a = new float[1000] ;
		Random rand = new Random();
		for (int i=0;i<1000;i++) {
			a[i] = rand.nextFloat()*1000 ;
		}
		sort(a);
		for (int i=0;i<1000;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void sort(float[] input) {

        int inputLength = input.length;
        float temp;
        boolean is_sorted;

        for (int i = 0; i < inputLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (inputLength - i); j++) {

                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    is_sorted = false;
                }

            }
            if (is_sorted) break;
        }
        
    }
}
