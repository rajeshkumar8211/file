import java.lang.reflect.*;
public class reflection {
    public static void main(String[] args){
        Employee e= new Employee("Diya",50000.0);
        Class cls =e.getClass();
        System.out.println("Cls name is"+cls.getName());
        Method[] methods=cls.getMethods();
        for (Method m:methods)
            System.out.println(m.getName());
    }
}
