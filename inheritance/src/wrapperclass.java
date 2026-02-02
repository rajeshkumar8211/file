public class wrapperclass {
    public static void main(String[] args){
        int i=10;//primitive data types
        float f;
        Integer i2 =Integer.valueOf(i); //boxing,wrapping
        int j=i2.intValue();
        Integer i3=20;//autoboxing
        int k=12;// autounboxing
        String s="123";
        int i4=Integer.parseInt(s);
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
