class Employee {
    protected String name;
    private double salary;

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
}
class Manager extends Employee{
    double bonus;
    Manager(String n,double s,double b){
        super(n,s);
        name = n;
        bonus=b;
    }
    public void setBonus(double b){
        bonus = b;
    }
    public double getSalary() {  //Method overriding
        return super.getSalary()+bonus;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee("Ram",35000);
        e1.raiseSalary(10);
        System.out.println(e1.getSalary());

        Manager m1 =new Manager("john",36000,0.0);
        m1.setBonus(20000.0);
        System.out.println(m1.getSalary());
    }
}