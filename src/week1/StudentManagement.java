package week1;
public class StudentManagement {
	static Student[] st = new Student[100];
	static int n=5;
    public static void main(String args[]) {
        st[0] = new Student("Nguyen Van A","17020992","Anguyen@gmail.com");
        st[1] = new Student("Nguyen Van B","17020991","Bnguyen@gmail.com");
        st[2] = new Student("Do Minh C","17020990","CDo@gmail.com");
        st[3] = new Student("Phan Truong D","17020999","DPhan@gmail.com");
        st[4] = new Student("Le Cuong E","17020996","ELe@gmail.com");
        st[0].setGroup("K62c-f");
        st[1].setGroup("K62c-f");
        st[2].setGroup("K62c-g");
        st[3].setGroup("K62c-g");
        st[4].setGroup("K62c-g");
        studentsByGroup();
	System.out.println("Xoa sinh vien voi id 17020999");
        removeStudent("17020999");
        studentsByGroup();
    }

    public static boolean sameGroup(Student s1,Student s2) {
    	return s1.getGroup().equals(s2.getGroup());
    }
 
   public static void studentsByGroup() {
    	boolean[] a; 
            a = new boolean[100];
    	for (int i=0;i<=n;i++) a[i]=false;
    	String str="";
    	for (int i=0;i<n;i++) 
    		if (a[i]==false) {
    			str=st[i].getGroup();
    			System.out.println("Cac sinh vien thuoc lop "+str+" la :");
    			for (int j=i;j<n;j++) 
    				if(a[j]==false&&str.equals(st[j].getGroup())) {
    					a[j]=true;
    					System.out.println(st[j].getName());
    				}
    		}
   	}
   public static void removeStudent(String id) {
	   int i=0;
	   while (i<n)
		   if (st[i].getId().equals(id)) {
			   for (int j=i;j<n-1;j++) st[j]=st[j+1];
			   i=n;
			   n--;
		   } else i++;
   }
}
