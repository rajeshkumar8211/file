package trainticket;

import java.util.*;

public class booking{
    public static void Ticket_Booking(Booker_details bd){
            Ticket_Details td = new Ticket_Details();
            if (Ticket_Details.availablewaitinglist ==0){
                System.out.println("Tickects are filled");
                return;
            } 
            if (bd.Breath_Preference.equals("L")&&Ticket_Details.availablelowerbreadth >0 
                    || bd.Breath_Preference.equals("M")&&Ticket_Details.availablemiddlebreadth > 0 
                    || bd.Breath_Preference.equals("U")&&Ticket_Details.availableupperbreadth>0) {
                System.out.println("Preferred Breadth Is Available");
                if (bd.Breath_Preference.equals("L")) {
                    System.out.println("Lower Is Given");
                    td.booker(bd, Ticket_Details.lowerbreathpositions.remove(0), "L");
                    Ticket_Details.availablelowerbreadth--;
                } else if (bd.Breath_Preference.equals("M")) {
                    System.out.println("Middle Breadth Is Given");
                    td.booker(bd, Ticket_Details.middlebreathpositions.remove(0), "M");
                    Ticket_Details.availablemiddlebreadth--;
                } else if (bd.Breath_Preference.equals("U")) {
                    System.out.println("Upper Breadth Is Given");
                    td.booker(bd, Ticket_Details.upperbreathpositions.remove(0), "U");
                    Ticket_Details.availableupperbreadth--;
                }
            }
            else if (Ticket_Details.availablelowerbreadth>0){
                    System.out.println("Lower Is Given");
                    td.booker(bd,Ticket_Details.lowerbreathpositions.remove(0),"L");
                    Ticket_Details.availablelowerbreadth--;
                } 
            else if (Ticket_Details.availablemiddlebreadth > 0) {
                    System.out.println("Middle Breadth Is Given");
                    td.booker(bd,Ticket_Details.middlebreathpositions.remove(0),"M");
                    Ticket_Details.availablemiddlebreadth--;
                }
            else if (Ticket_Details.availableupperbreadth > 0) {
                    System.out.println("Upper Breadth Is Given");
                    td.booker(bd,Ticket_Details.upperbreathpositions.remove(0),"U");
                    Ticket_Details.availableupperbreadth--;
                }
            else if (Ticket_Details.availableraclist > 0) {
                    System.out.println("Added RAC List");
                    td.raclist(bd,Ticket_Details.racpositions.get(0),"RAC");

                }
            else if (Ticket_Details.availablewaitinglist > 0) {
                    System.out.println("Added Waiting List");
                    td.waitinglist(bd,Ticket_Details.waitinglistpositions.get(0),"WL");
            }
    }
    public static void Cancel_Ticket(int idno){
        Ticket_Details td = new Ticket_Details();
        if(!td.bookers.containsKey(idno)){
            System.out.println("Details Is Unknown");
        }
        else{
            td.cancel_booking(idno);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println(" 1.Book_Ticket \n 2.Cancel_Ticket \n 3.Available Ticket \n 4.Booked_Ticket \n 5.Exit");
        boolean loop = true;
        while (loop) {
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    String name;
                    int age;
                    String Breath_Preference;
                    System.out.println("Enter your name:");
                    name = sc.next();
                    System.out.println("Enter your age:");
                    age = sc.nextInt();
                    System.out.println("Enter your Breadth_Preference:(U/M/L)");
                    Breath_Preference = sc.next();
                    Booker_details bd = new Booker_details(name, age, Breath_Preference);
                    Ticket_Booking(bd);
                }
                break;
                case 2: {
                    System.out.println("Enter your id:");
                    int idno= sc.nextInt();
                    Cancel_Ticket(idno);
                    break;
                }
                case 3: {
                    Ticket_Details t = new Ticket_Details();
                    t.Available_Ticket();
                }
                break;
                case 4: {
                    Ticket_Details t = new Ticket_Details();
                    t.Booked_Ticket();
                }
                break;
                case 5: {
                    loop=false;
                    System.exit(0);
                }
            }
        }
    }
}