

abstract class Member{
    private String name;
    abstract void welcomeMessage();
}
class Student extends Member{
    void welcomeMessage(){
        System.out.println("Hello student");
    }
}
class Teacher extends Member{
    void welcomeMessage(){
        System.out.println("Hello teacher");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Student s1=new Student();
        Teacher t1=new Teacher();

        Member[] m = new Member[4];
        m[0]=new Student();
        m[1]= new Student();
        m[2]=new Teacher();

        for (Member m1:m){
            m1.welcomeMessage();
        }
    }
}