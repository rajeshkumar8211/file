public class Twoarray {
    public static void main(String[] args) {
        int a[]={10,3,5,12,17,22};
        int[] b = new int[a.length];
        int[] c =new int [a.length];
        int bCount=0;
        int cCount=0;
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                b[bCount++] = a[i];
            }
            else
            {
                c[cCount++]= a[i];
            }
        }
        System.out.println("odd numbers:");
        for(i=0;i<cCount;i++)
        {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        System.out.println("even numbers:");
        for(i=0;i<bCount;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}