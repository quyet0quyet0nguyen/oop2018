package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.reflect.Array;

public class Task2 {
	public static void main(String args[]) {
		try {
		//NullPointer(null);
		int a[] = {1,2,3,4};
		//ArrayIndexOutOfBound(a);
		//DivisionArithmetic(5,0);
		//ClassCast();
		IOException();
		//FileNotFoundException();
		} catch (NullPointerException e) {
			System.out.println("Error: number may not have been initialized");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: array has been accessed with an illegal index."
					+ " The index is either negative or greater than or equal to the size of the array");
		} catch (ArithmeticException e) {
			System.out.println("Error: an exceptional arithmetic condition has occurred");
		} catch (ClassCastException e) {
			System.out.println("Error: code has attempted to cast an object to a subclass of which it is not an instance");
		} catch (java.io.IOException e) {
			System.out.println("Error: an I/O exception of some sort has occurred."
					+ " This class is the general class of exceptions produced by failed or interrupted I/O operations.");
		}
                try{
                    FileNotFoundException();
                } catch (java.io.FileNotFoundException e){
                    System.out.print("Error: File not found");
                }
	}
	
	public static void NullPointer(Object obj) throws java.lang.NullPointerException{
			if (obj == null)
				throw new NullPointerException();
	}
	
	public static void ArrayIndexOutOfBound(int a[]) throws java.lang.ArrayIndexOutOfBoundsException{
		int i=-1;
			if ((i>4)||(i<0)) {
				throw new ArrayIndexOutOfBoundsException();
			}
	}
	
	public static double DivisionArithmetic(int a,int b) throws java.lang.ArithmeticException{
			if (b==0) {
				throw new ArithmeticException();
			} 	else return a/b;
	}
	
	public static void ClassCast() throws java.lang.ClassCastException{
			Object x = new Integer(0);
		    System.out.println((String)x);
	}
	
	public static void IOException() throws java.io.IOException {
		String filepath = "C:\\Users\\nikos\\Desktop\\TestFiles\\testFile2.txt";
		BufferedReader br = null;
		br = new BufferedReader(new FileReader(filepath));
		br.close();
                br.read(); 

	}
	
	public static void FileNotFoundException() throws java.io.FileNotFoundException {
		FileInputStream in = null;
	    in = new FileInputStream("input.txt"); 
	}
}
