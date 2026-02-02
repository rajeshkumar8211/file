class outer {
    int num;

    void outerDisplay() {
        System.out.println("Outer Class");
    }

    class inner {
        int x;

        void innerDisplay() {
            System.out.println("Inner Class");
        }
    }
}
public class innerclaa {
    public static void main(String[] args){
     outer o =new outer();
     o.num=19;
     System.out.println(o.num);
     o.outerDisplay();
     outer.inner i=o.new inner();
     i.innerDisplay();
     i.x=47;
     System.out.println(i.x);
    }
}
