package busresver;

import java.util.ArrayList;//nested package
import java.util.Scanner;
public class busdemo {
    public static void main(String[] args){
        ArrayList<Bus> buses= new ArrayList<Bus>();//ArrayList collection
        ArrayList<Booking> bookings= new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,5));
        buses.add(new Bus(3,true,4));

        Scanner scanner= new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }
        int useropt=1;
        while(useropt==1) {
            System.out.println("Enter 1 to Book and 2 to exit");
            useropt = scanner.nextInt();
            if (useropt == 1) {
                Booking book = new Booking();
                if (book.isAvailable(bookings, buses)) {
                    bookings.add(book);
                    System.out.println("your is confirmed");
                } else {
                    System.out.println("Sorry.Bus is full,Try another bus or date");
                }
            }
        }
    }
}
