package week2.task3;


public class Task3 {
	public static void main(String args[]) {
		Zoo z1 = new Zoo("Lion","Male","2536",true);
		Zoo z2 = new Zoo("Lion","Female","2533",true);
		Zoo z3 = new Zoo("Fox","Male","333",true);
		z1.getAnimal();
		z2.getAnimal();
		z3.getAnimal();
		System.out.println("Couple "+z1.getId()+" "+z2.getId()+":  "+ z1.couple(z2));
		System.out.println("Couple "+z1.getId()+" "+z3.getId()+": "+ z1.couple(z3));
		System.out.println();
		//
		BookStore b1 = new BookStore("SGK TA 12","1702", 12.5f ,"S1 5");
		BookStore b2 = new BookStore("STK TA 12","1703", 12.5f ,"S1 5");
		BookStore b3 = new BookStore("GBT TA 12","1704", 12.5f ,null);
		b1.getBook();
		b2.getBook();
		b3.getBook();
		System.out.println("Sach "+ b1.getName() + "co trong store ? "+b1.haveBook());
		System.out.println("Sach "+ b3.getName() + "co trong store ? "+b3.haveBook());
		System.out.println();
		//
		human h1 = new human("Nguyen Van A", true,"DHQGHN","read book");
		human h2 = new human("Tran Thi B", false,"KFC","read book");
		human h3 = new human("Do Tien C", true,"HNUE",null);
		h1.getInfor();
		h2.getInfor();
		h3.getInfor();
		System.out.println(h1.getName()+" va "+h2.getName()+" co cung so thich ?"+h1.sameHobby(h2));
		System.out.println(h1.getName()+" va "+h3.getName()+" co cung so thich ?"+h3.sameHobby(h2));
		
	}
}

class Zoo{
	String name;
	private String sex;
	private String id;
	private boolean healthy;
	public Zoo() {
		name = "user name";
		sex = " user sex";
		id = "user id";
		healthy = true;
	}
	public Zoo(String name,String sex,String id,boolean health) {
		this.name = name;
		this.sex = sex;
		this.id = id;
		this.healthy = health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setHealthy(boolean health) {
		healthy = health;
	}
	public boolean getHealthy() {
		return healthy;
	}
	public boolean couple(Zoo z2) {
		if(this.name.equals(z2.name)==true)
			if (this.healthy==true&&z2.healthy==true)
				if ((this.sex.equals("Male")==true&&z2.sex.equals("Female")==true)||
					(this.sex.equals("Female")==true&&z2.sex.equals("Male")==true))
					return true;
		return false;
	}
	public void getAnimal() {
		System.out.println("Name : "+ name+"\t Sex : "+sex+"\t id : "+ id +"\t health :"+ healthy);
	}
}

class BookStore {
	private String name;
	private String id;
	private float cost;
	private String address;
	public BookStore() {
		name = "user name";
		cost = 0;
		id = "user id";
		address = "S1-01";
	}
	public BookStore(String name,String id,float cost,String address) {
		this.name = name;
		this.id = id;
		this.cost = cost;
		if (address!=null) this.address =address;
		else this.address = "No Book";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getCost( ) {
		return cost;
	}
	public void setAddress(String address) {
		if (address!=null) this.address = address;
		else this.address = "No Book";
	}
	public String getAddress() {
		return address;
	}
	public void getBook() {
		System.out.println("Name : "+ name +"\t id : "+ id +"\t cost : "+cost+" dong\t address : "+ address);
	}
	public boolean haveBook() {
		if (address.equals("No Book")) return false;
		return true;
	}
}

class human{
	private String name;
	private boolean student;
	private String work;
	private String hobby;
	public human (){
		name = "no Name";
		student = true;
		work = "unKnow";
		hobby = "unKnow";
	}
	public human (String name, boolean student, String work, String hobby) {
		this.name = name;
		this.student = student;
		this.work = work;
		if (hobby != null) this.hobby = hobby;
			else this.hobby = "unKnow";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	public boolean getStudent() {
		return student;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getWork() {
		return work;
	}
	public void setHobby(String hobby) {
		if (hobby != null) this.hobby = hobby;
		else this.hobby = "unKnow";
	}
	public String getHobby() {
		return hobby;
	}
	public boolean sameHobby(human h2) {
		if (hobby.equals("unKonw")) return false;
		else if(hobby.equals(h2.hobby)) return true;
		return false;
	}
	public void getInfor() {
		System.out.println("Name : "+ name+"\t Student :"+student+"\t Work : "+work +"\t Hobby : "+hobby);
	}
}
