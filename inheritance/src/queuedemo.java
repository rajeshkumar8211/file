import  java.util.*;
public class queuedemo {
    public static void main(String[] args){
       PriorityQueue<Integer> q = new PriorityQueue<>();
       q.add(3);
       q.add(10);
       q.add(7);
       System.out.println(q.peek());
       System.out.println(q.peek());
       System.out.println(q.poll());
    }
}
