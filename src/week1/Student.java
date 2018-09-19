package week1;
public class Student {
	private String name;
	private String id;
	private String group;
	private String email;

	public Student() {
		name = "Student";
		id = "000";
		group = "INT22041";
		email = "uet@vnu.edu.vn";
	}

	public Student(String n, String sid, String em) {
		if (n != null)
			name = n;
		else
			name = "unKnow name";
		if (sid != null)
			id = sid;
		else
			id = "unKnow id";
		if (em != null)
			email = em;
		else
			email = "unKnow email";
	}

	public Student(Student s) {
		name = s.name;
		id = s.id;
		group = s.group;
		email = s.email;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n != null)
			name = n;
		else
			name = "unKnow name";
	}

	public String getId() {
		return id;
	}

	public void setId(String i) {
		if (i != null)
			id = i;
		else
			id = "unKnow id";
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String g) {
		if (g != null)
			group = g;
		else
			group = "unKnow Group";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String e) {
		if (e != null)
			email = e;
		else
			email = "unKnow email";
	}

	public void getInfo() {
		System.out.print("name :" + name + " \t");
		System.out.print("id :" + id + " \t");
		System.out.print("group :" + group + " \t");
		System.out.println("email :" + email + " \t");
	}
}
