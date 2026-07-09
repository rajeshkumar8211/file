package trainticket;

public class Booker_details {
            String name;
            int age;
            String alloted;
            String Breath_Preference;
            static int id=1;
            int bookerid;
            int seat_number;
    public Booker_details(String name, int age, String Breadth_Preference){
            this.name = name;
            this.age = age;
            this.Breath_Preference = Breadth_Preference;
            this.bookerid = id++;
            alloted="";
            seat_number=-1;

        }
}
