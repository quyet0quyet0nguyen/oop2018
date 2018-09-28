package week2.task3;


public class Task3 {
	public static void main(String args[]) {
		Zoo z1 = new Zoo("Lion","Male","2536",true);
		Zoo z2 = new Zoo("Lion","Female","2533",true);
		Zoo z3 = new Zoo("Fox","Male","333",false);
		z1.getAnimal();
		z2.getAnimal();
		z3.getAnimal();
		System.out.println("Couple "+z1.getId()+" "+z2.getId()+":  "+ z1.couple(z2));
		System.out.println("Couple "+z1.getId()+" "+z3.getId()+": "+ z1.couple(z3));
		System.out.println(z1.getName()+" co phai gap bac si khong ?"+ z1.meetDoctor());
		System.out.println(z3.getName()+" co phai gap bac si khong ?"+ z3.meetDoctor());
		Zoo z4 = new Zoo();
		z4.copy(z2);
		z4.getAnimal();
		System.out.println();
		//
		BookStore b1 = new BookStore("SGK TA 12","1702", 12.5f ,"S1 5");
		BookStore b2 = new BookStore("STK TA 12","1703", 12.1f ,"S1 5");
		BookStore b3 = new BookStore("GBT TA 12","1704", 13f ,null);
		b1.getBook();
		b2.getBook();
		b3.getBook();
		System.out.println("Sach "+ b1.getName() + "co trong store ? "+b1.haveBook());
		System.out.println("Sach "+ b3.getName() + "co trong store ? "+b3.haveBook());
		System.out.println(b1.getName() + " va "+b2.getName()+" co cung loai sach? " + b1.sameBook(b2));
		System.out.println(b1.getName() + " va "+" dat hon sach "+b2.getName()+" "+b1.expensive(b2));
		System.out.println();
		//
		human h1 = new human("Nguyen Van A", true,"DHQGHN","read book");
		human h2 = new human("Tran Thi B", false,"KFC","read book");
		human h3 = new human("Do Tien C", true,"HNUE",null);
		h1.getInfor();
		h2.getInfor();
		h3.getInfor();
		System.out.println(h1.getName()+" va "+h2.getName()+" co cung so thich ? "+h1.sameHobby(h2));
		System.out.println(h1.getName()+" va "+h3.getName()+" co cung so thich ? "+h3.sameHobby(h1));
		System.out.println(h1.getName()+" va "+h3.getName()+" co cung noi lam viec ? "+h3.sameWork(h1));
		System.out.println(h1.getName()+" va "+h3.getName()+" co cung la hoc sinh ? "+h3.sameStudent(h2));
	}
}

class Zoo{
	private String name;
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
	public boolean meetDoctor () {
		if (this.healthy==false) return true;
		return false;
	}
	public void copy(Zoo z2) {
		name = z2.getName();
		id = z2.getId();
		sex = z2.getSex();
		healthy = z2.getHealthy();
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
	public boolean sameBook(BookStore b2) {
		if (this.name.equals(b2.getName())) return true;
		return false;
	}
	public boolean expensive(BookStore b2) {
		if (this.cost>b2.getCost()) return true;
		return false;
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
		if (work!=null) this.work = work;
		else this.work = "unKnow";
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
		if (work!=null) this.work = work;
		else this.work = "unKnow";
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
	public boolean sameWork(human h2) {
		if (work.equals("unKonw")) return false;
		else if(work.equals(h2.work)) return true;
		return false;
	}
	public boolean sameStudent(human h2) {
		if (student==true&&h2.getStudent()==true) return true;
		return false;
	}
	public void getInfor() {
		System.out.println("Name : "+ name+"\t Student :"+student+"\t Work : "+work +"\t Hobby : "+hobby);
	}
}
