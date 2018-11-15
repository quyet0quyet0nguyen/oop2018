package week10;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import week9.Utils;

public class Task1{
	private static List<String> list1 = new ArrayList<String>();
	public List<String> getAllFunctions(File path) throws ClassNotFoundException{
		List<String> List1 = new ArrayList<String>();
		Class classs = null;
		classs = Class.forName("week9" + '.' + "Utils");
		for (Method method : classs.getMethods())
		{
			String s = method.toGenericString();
			s = this.shortcut(s);
			List1.add(s);
		}
		return List1;
	}
	
	public String shortcut(String s) {
		int i=0;
		while (i<s.length()) {
			if (s.charAt(i)=='.') {
				int j=i;
				boolean bool = true;
				while (bool) {
					if (s.charAt(j)==' '||s.charAt(j)=='('||s.charAt(j)==',') bool = false;
					else j--;
				}
				s = s.substring(0, j+1)+s.substring(i+1, s.length());
				i=j;
			} else i++;
		}
		return s;
	}
	
	public String findFunctionByName(String name) {
		for (String s: list1) {
			if (s.indexOf(name)!=-1) return s;
		}
		return null;
	}
	
	public static void main(String args[]) {
		Task1 task1 = new Task1();
		File file = new File("src/week9/Units.java");
		try {
			list1 = task1.getAllFunctions(file);
			System.out.println(task1.findFunctionByName("findFileByName(String,String)"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

