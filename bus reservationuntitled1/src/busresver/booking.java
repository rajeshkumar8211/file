package busresver;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Booking {
    String passengername;
    int busno;
    Date date;

    Booking(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a name:");
        passengername=scanner.next();
        System.out.println("Enetr bus no:");
        busno=scanner.nextInt();
        System.out.println("Enter a date dd-MM-yyyy");
        String dateInput= scanner.next();
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
        int capacity =0;
        for (Bus bus:buses){
            if (bus.getbusno() == busno) {
                capacity = bus.getCapacity();
            }
        }
        int booked =0;
        for (Booking books:bookings){
            if (books.busno == busno && books.date.equals(date)) {
                booked++;
            }
        }
    return booked<capacity?true:false;
    }
}
