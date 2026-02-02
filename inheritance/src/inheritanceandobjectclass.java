import java.util.*;
class Employee implements Comparable<Employee> {
    protected String name;
    private    double salary;
    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (obj==null)
            return false;
        if (this.getClass() !=obj.getClass())
            return false;

        Employee e=(Employee)obj;
        return this.name.equals(e.name) && this.getSalary()==e.getSalary();
    }


    Employee(String n, double s) { //base class
        name = n;
        salary = s;
    }

    Employee() {
        name = " ";
        salary = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }

    void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public int compareTo(Employee e) {
        if (salary==e.salary)
            return 0;
        if (salary<e.salary)
            return -1;
        return +1;
    }
}
class Manager extends Employee{
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        bonus=b;
    }
    public void setBonus(double b){
        bonus = b;
    }
    public double getSalary() {  //Method overriding
        return super.getSalary()+bonus;
    }

    public boolean equals(Object obj) {
        if (this==obj)
            return true;
        if (obj==null)
            return false;
        if (this.getClass()!= obj.getClass())
            return false;
        Manager m =(Manager)obj;
        return this.name.equals(m.name)&& this.getSalary()==m.getSalary()&& this.bonus == m.bonus;
    }

}
public class inheritanceandobjectclass {
    public static void main(String[] args) {
        Employee e1= new Employee("Ram",35000);
        //e1.raiseSalary(10);
        //System.out.println(e1.getSalary());
        Employee e3= new Employee("Ram",35000);
        //System.out.println(e1.equals(e3));
        Manager m1 =new Manager("john",36000,0.0);
        m1.setBonus(20000.0);
        Manager m2 =new Manager("john",36000,0.0);
        m2.setBonus(20000.0);
        Manager m3= new Manager("john",36000,20000.0);
        //System.out.println(m1.equals(m3));
        //System.out.println(m1.getSalary());
        Employee e4=e3;
        //System.out.println(e4.equals(e3));
        int [] arr = new int[50];
        Employee [] employees=new Employee[4];
        employees[3]=new Employee("Rajesh",30000);
        employees[2]=new Employee("Manoj",35000);
        employees[1]=new Employee("Viji",40000);
        employees[0]=new Manager("Senthil",50000,0.0);
        for (Employee e:employees) {
            System.out.println(e.getName() + "  " + e.getSalary());
        }
        Arrays.sort(employees);
        for (Employee e:employees) {
            System.out.println(e.getName() + "  " + e.getSalary());
        }
    }
}