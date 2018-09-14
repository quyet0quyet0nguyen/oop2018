package week1;
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    public Student(){
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }
    public Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
    }
    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getId(){
        return id;
    }
    public void setId(String i){
        id = i;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String g){
        group = g;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String e){
        email = e;
    }
    public void getInfo(){
        System.out.println("name" +name);
        System.out.println("id"+id);
        System.out.println("group"+group);
        System.out.println("email"+email);
    }
}