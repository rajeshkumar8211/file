public class VarArgsDemo {
    static int minvalue(int...vals){
        int min=Integer.MAX_VALUE;
        for(int k:vals){
            if (k < min)
                min=k;
            }
        return min;
        }
    static double minvalue(double...vals){
        double min=Integer.MAX_VALUE;
        for(double k:vals){
            if (k < min)
                min=k;
        }
        return min;
    }


    public static void main(String[] args) {
        int m=minvalue(5,2,6);
        System.out.println(m);
        int n=minvalue(4,7,2,0,-1);
        System.out.println(n);
        double p=minvalue(7.0,8.0,-6.0);
        System.out.println(p);
        double q=minvalue();
        System.out.println(q);
    }
}