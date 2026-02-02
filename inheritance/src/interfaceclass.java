/*
Interface - what to do but how to do
 */
/*
functional interface determined by only one abstract method
& functional inerface is used for lmbda function
 */
interface rideable{  //SINGLE Interface -
    // SAM interface is also called functional interface
     int MAX_SPEED=90;
     void ride();  //abstract method
     default void display(){
         System.out.println("your in ridiable interface");
     }
}

class car implements rideable{
    public void ride(){
        System.out.println("You are riding a car");
    }
}
class bike implements rideable{
    public void ride(){
        System.out.println("You are riding a bike");
    }
}
class mechanic{
    void check(rideable r){
        System.out.println("Checking");
        r.ride();
    }
}

public class interfaceclass {
    public static void main(String[] args){
        mechanic m= new mechanic();
        car c = new car();
        bike b =new bike();
        c.display();
        m.check(c);
        m.check(b);
        c.ride();
        rideable r2 = new rideable() {
            public void ride() {
                System.out.println("you are riding a vintage car");
            }
        };
        r2.ride();
        // lambda expression
        rideable r3 =() -> System.out.println("you are riding a conventible car");
        r3.ride();
    }
}
