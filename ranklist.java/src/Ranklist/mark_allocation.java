package Ranklist;

import java.util.*;

public class mark_allocation {

    static Map<Integer,student> student_rank_list =new HashMap<>();
    public int rank_allocate(student s) {
        student_rank_list.put(s.register_no, s);
        List<student> list = new ArrayList<>(student_rank_list.values());
        list.sort((a, b) -> b.total - a.total);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).rank = i + 1;
        }
        System.out.println("Your Rank is " + s.rank);
        return s.rank;
    }
    public void student_list(String sd,int d){
        if(student_rank_list.isEmpty()){
            System.out.println("There no Student in this class");
        }
        else {
            for (student sr : student_rank_list.values()) {
                if (sr.name.equals(sd) || sr.total == d || sr.register_no == d || sr.rank == d) {
                    System.out.println("Name : " + sr.name);
                    System.out.println("Register_no :" + sr.register_no);
                    System.out.println("Total :" + sr.total);
                    System.out.println("Rank :" + sr.rank);
                }
            }
        }
    }
    public void full_student(){
        for (student sr : student_rank_list.values()) {
                System.out.println("Name : " + sr.name);
                System.out.println("Register_no :" + sr.register_no);
                System.out.println("Total :" + sr.total);
                System.out.println("Rank :" + sr.rank);
        }
    }
}
