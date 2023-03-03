package Student;

public class fullname {
    private String fullname;
    private String lastname;
    private int  age;

    public fullname(String Fullname, String lastname, int age){
        this.fullname = Fullname;
        this. lastname = lastname;
        this.age = age;
    }
    public String getfullname(){
        return this.fullname;
    }
    public void setfullname(String fullname){
        this.fullname=fullname;
    }
    public void getLastname(String lastname){
        this.lastname=lastname;
    }
    public  String setLastname(){
        return this.lastname;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
