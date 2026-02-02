import java.util.*;

public class setdemo {
    public static void main(String[] args){
        HashSet<String> h=new HashSet<String>();
        h.add("ram");
        h.add("raj");
        h.add("ram");
        h.add("amma");
        h.add("boy");
        System.out.println(h);
        LinkedHashSet<String> h1=new LinkedHashSet<String>();
        h1.add("ram");
        h1.add("raj");
        h1.add("ram");
        h1.add("amma");
        h1.add("boy");
        System.out.println(h1);
        TreeSet<String> h2=new TreeSet<String>();
        h2.add("ram");
        h2.add("raj");
        h2.add("ram");
        h2.add("amma");
        h2.add("boy");
        System.out.println(h2);
    }
}
