import java.util.*;
class Student{
    String name;
    int rollno;
    static int[] mark;
    int total;

    public Student(String name, int rollno, int[] mark) {
        this.name=name;
        this.rollno=rollno;
        this.mark=mark;
        this.total=total();

    }

    public int total(){
        int i,sum=0;
        for(i=0;i<mark.length;i++){
            sum+=mark[i];
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a size:");
        size=sc.nextInt();
        int[] mark = new int[size];
        System.out.println("Enter a name:");
        String  name =sc.next();
        System.out.println("Enter a rollno");
        int rollno= sc.nextInt();
        for(int i=0;i<mark.length;i++){
            int m;
            m=i+1;
            System.out.println("Enter a mark"+ m);
            mark[i]=sc.nextInt();
        }
        Student s = new Student(name,rollno,mark);
        System.out.println("total marks:"+s.total);
    }
}