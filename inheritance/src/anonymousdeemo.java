class cycle{
    void display(){
        System.out.println("You are in cycle");
    }
}
public class anonymousdeemo {
    public static void main(String[] args) {
        cycle c = new cycle()  //anonyms class
            {
                void display(){
                System.out.println("You are in tricycle");
            }
        };
        c.display();
        cycle c1 = new cycle();
        c1.display();
        //cycle c3=()-> System.out.println("You are in dicycle");
    }
}
