import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class collectiondemo {
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println(alist);
        System.out.println(alist.get(3));
        for (int i:alist) {
            System.out.println(i);
        }
        Iterator<Integer>  i = alist.iterator();
        System.out.println("using iterator");
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //LinkedList<String> s1 = new LinkedList<String>();
    }
}
