package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Utils {
	public static String readContentFromFile(String path) {
		String content="";
		File file = null;
		FileReader fr = null;
		BufferedReader bf = null;
		try {
			file = new File(path);
			fr = new FileReader(file);
			bf = new BufferedReader(fr);
			content = bf.readLine();
		} catch (Exception e) {
			System.out.println("Loi doc file"+e);
		} finally {
			try {
			if (bf!=null) bf.close();
			if (fr!=null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return content;
	}
	
	public static void writeContentToFile(String path) {
		File file=null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		try {
			String content = "writting to file";
			file = new File(path);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
			if (bw!=null) bw.close();
			if (fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void continuousWriteContentToFile (String path) {
		File file=null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		try {
			String content = "continuous writting to file";
			file = new File(path);
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			bw.write(content);
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
			if (bw!=null) bw.close();
			if (fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
	
	public static File findFileByName(String folderPath,String fileName) {
		File file = null;
		FilenameFilter filter = null;
		file = new File(folderPath);
		filter = new FilenameFilter() {
			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.startsWith(fileName)&& arg1.endsWith(".txt");
			}
		};
		return file;
	}
	
	public static void main(String args[]) {
		System.out.println(readContentFromFile("E:/abcd.txt"));
		writeContentToFile("E:/abcd.txt");
		System.out.println(readContentFromFile("E:/abcd.txt"));
		continuousWriteContentToFile("E:/abcd.txt");
		System.out.println(readContentFromFile("E:/abcd.txt"));
		File file = null;
		file  = findFileByName("E:/","abcd.txt");
		if (file !=null) System.out.println("file exits");
	}
}
