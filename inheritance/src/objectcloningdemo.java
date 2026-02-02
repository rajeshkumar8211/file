import java.util.Date;
import java.util.Scanner;

class Department implements Cloneable{
    String name;
    int id;
    Department(int id ,String n){
        this.id =id;
        name=n;
    }
    Department(){
        this.id=id;
        this.name=this.name;
    }
    Department(Department d){
        this.id=d.id;
        this.name=d.name;
    }
    void display(){
        System.out.println("DEPT ID:" + id);
        System.out.println("DEPT NAME:" + name);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student implements Cloneable{
    int id;
    String name;
    Date dob;
    Department  dept;
    Student(int id,String name,Department dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    Student (Student s){
        this.id = s.id;
        this.name= s.name;
        this.dept=s.dept;

    }
    void display(){
        System.out.println("STUD ID:" + id);
        System.out.println("STUD NAME:" + name);
        dept.display();
    }

    protected Object clone() throws CloneNotSupportedException {
        Student s =(Student) super.clone();
        s.dept= (Department) s.dept.clone();
        //s.dob=(Date) s.dob.clone();
        return s;
    }
}
public class objectcloningdemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department d1= new Department(1,"Physics");
        Student s1 = new Student(1,"Rajesh",d1);
        Student s2= (Student)s1.clone();
        Student s3 = new Student(s1);
        d1.name="Social" ;
        //d1.name="Maths";
        s1.name="Senthil";
        s3.id=3;
        s1.display();
        s2.display();
        s3.display();
    }
}
