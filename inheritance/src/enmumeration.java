enum level{
    BEGINNER("B"),INTERMEDATE("I"),ADVANCED("A");
    private String abbr;
    level(String ab){
        abbr= ab;
    }

    public String getAbbr() {
        return abbr;
    }

    public boolean compareTo() {
        return false;
    }
}
public class enmumeration {
    public static void main(String[] args){
        level l1 =level.ADVANCED;
        System.out.println(l1.toString());
        System.out.println(l1.getAbbr());
    }
}
