package trainticket;

import java.util.*;
public class Ticket_Details {
    static int availablelowerbreadth =1;
    static int availablemiddlebreadth =1;
    static int availableupperbreadth =1;
    static int availableraclist =1;
    static int availablewaitinglist =1;

    static Queue<Integer>waitinglist = new LinkedList<>();
    static Queue<Integer>raclist =new LinkedList<>();
    static List<Integer>bookedTicketlist = new ArrayList<>();

    static List<Integer> lowerbreathpositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> middlebreathpositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperbreathpositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> racpositions = new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitinglistpositions = new ArrayList<>(Arrays.asList(1));

    static Map<Integer,Booker_details> bookers =new HashMap<>();

    public void booker(Booker_details bd,int breadthinfo ,String allotedbreadth){
        bd.seat_number=breadthinfo;
        bd.alloted=allotedbreadth;
        bookers.put(bd.bookerid,bd);
        bookedTicketlist.add(bd.bookerid);
        System.out.println("--------------------------Booked Successfully");
    }
    public void raclist(Booker_details bd,int breadthinfo,String allotedbreadth){
        bd.seat_number=breadthinfo;
        bd.alloted=allotedbreadth;
        bookers.put(bd.bookerid,bd);
        raclist.add(bd.bookerid);
        racpositions.remove(0);
        availableraclist--;
        System.out.println("--------------------------added to RAC Successfully");
    }
    public void waitinglist(Booker_details bd,int breadthinfo ,String allotedbreadth){
        bd.seat_number=breadthinfo;
        bd.alloted=allotedbreadth;
        bookers.put(bd.bookerid,bd);
        waitinglist.add(bd.bookerid);
        waitinglistpositions.remove(0);
        availablewaitinglist--;
        System.out.println("--------------------------added to Waiting List Successfully");
    }
    public void cancel_booking(int bookerid){
        Booker_details b =bookers.get(bookerid);
        bookers.remove(Integer.valueOf(bookerid));
        bookedTicketlist.remove(Integer.valueOf(bookerid));
        int bookedposition = b.seat_number;
        if(b.alloted.equals("L")){
            availablelowerbreadth++;
            lowerbreathpositions.add(bookedposition);
        } else if(b.alloted.equals("M")){
            availablemiddlebreadth++;
            middlebreathpositions.add(bookedposition);
        } else if(b.alloted.equals("U")){
            availableupperbreadth++;
            upperbreathpositions.add(bookedposition);
        }
    }
    public void Available_Ticket(){
        System.out.println("Available Lower Breadth :"+availablelowerbreadth);
        System.out.println("Available Middle Breadth :"+availablemiddlebreadth);
        System.out.println("Available Upper Breadth :"+availableupperbreadth);
        System.out.println("Available RAC List :"+availableraclist);
        System.out.println("Available Waiting List"+availablewaitinglist);
    }
    public void Booked_Ticket(){
        if(bookers.size()==0){
            System.out.println("There is no booked tickets");
            return;
        }
        for (Booker_details b : bookers.values()){
            System.out.println("Booker Id :"+b.bookerid);
            System.out.println("Booker Name : "+b.name);
            System.out.println("Booer Age : "+b.age);
            System.out.println("Status :"+b.seat_number+b.alloted);
        }
    }
}
