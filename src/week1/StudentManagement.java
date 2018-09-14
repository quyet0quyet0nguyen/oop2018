package week1;
import java.util.Scanner;
public class StudentManagement {
    static Student[] st = new Student[100];
    static int n=0;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        n = Integer.parseInt (input.nextLine());
        int i=0;
        for (i=0;i<n;i++) {
            st[i] = new Student();
            System.out.println("Student "+(i+1));
            System.out.println("Name: ");
            String s = input.nextLine();
            st[i].setName(s);
            System.out.println("ID :");
            s = input.nextLine();
            st[i].setId(s);
            System.out.println("Group :");
            s = input.nextLine();
            st[i].setGroup(s);
            System.out.println("Email :");
            s = input.nextLine();
            st[i].setEmail(s);
        }
        studentsByGroup();
        removeStudent("a");
        studentsByGroup();
    }

    public static boolean sameGroup(Student s1,Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    public static void studentsByGroup() {
        boolean[] a = new boolean[100];
        for (int i=0;i<n;i++) a[i]=false;
        String str="";
        for (int i=0;i<n;i++)
            if (a[i]==false) {
                str=st[i].getGroup();
                System.out.println("Cac sinh vien thuoc lop "+str+" la :");
                for (int j=i;j<n;j++)
                    if(a[j]==false&&st[j].getGroup().equals(str)) {
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
