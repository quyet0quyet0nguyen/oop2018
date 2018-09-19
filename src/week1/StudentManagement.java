package week1;
public class StudentManagement {
	static Student[] st = new Student[100];
	static int n = 6;

	public static void main(String args[]) {
		// set info for 4 students
		for (int i = 0; i < n; i++)
			st[i] = new Student();
		st[0] = new Student("Nguyen Van A", "17020992", "Anguyen@gmail.com");
		st[1] = new Student("Nguyen Van B", "17020991", "Bnguyen@gmail.com");
		st[2] = new Student("Do Minh C", "17020990", "CDo@gmail.com");
		st[3] = new Student("Phan Truong D", "17020999", "DPhan@gmail.com");
		st[4] = new Student("Le Cuong E", "17020996", "ELe@gmail.com");
		st[0].setGroup("K62c-f");
		st[1].setGroup("K62c-f");
		st[2].setGroup("K62c-g");
		st[3].setGroup(null);
		st[4].setGroup(null);
		// set new student st[5] is a copy of st[1];
			st[5] = new Student(st[1]);
			st[5].setName("Nguyen Thi F");
		// cout list info student
			for (int i = 0; i < n; i++)
				st[i].getInfo();
		// test 2 students is the same group?
			System.out.println(sameGroup(st[0],st[3]));
			System.out.println(sameGroup(st[3],st[4]));
		// cout students by Group (alphabet)
		studentsByGroup();
		// remove student in array by id
		removeStudent(null);
		for (int i = 0; i < n; i++)
			st[i].getInfo();
		System.out.print("\n");
		removeStudent("17020999");
		for (int i = 0; i < n; i++)
			st[i].getInfo();

	}

	public static boolean sameGroup(Student s1, Student s2) {
		return s1.getGroup().equals(s2.getGroup());
	}

	public static void studentsByGroup() {
		boolean[] a;
		a = new boolean[100];
		for (int i = 0; i <= n; i++)
			a[i] = false;
		String str;
		for (int i = 0; i < n; i++)
			if (st[i].getGroup() != null)
				if (a[i] == false) {
					str = st[i].getGroup();
					System.out.println("Cac sinh vien thuoc lop " + str + " la :");
					for (int j = i; j < n; j++)
						if (a[j] == false && str.equals(st[j].getGroup()) && st[j].getGroup() != null) {
							a[j] = true;
							System.out.println(st[j].getName());
						}
				}
	}

	public static void removeStudent(String id) {
		if (id == null) id = "unKnow id";
		int i = 0;
		while (i < n)
			if (st[i].getId().equals(id)) {
				for (int j = i; j < n - 1; j++)
					st[j] = st[j + 1];
				n--;
			} else
				i++;
	}
}
