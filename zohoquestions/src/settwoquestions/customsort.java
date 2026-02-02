package settwoquestions;

public class customsort {
    public static void main(String args[]){
        int i,max,sec=0;
        int a[]={1,8,3,6,4};
        max=a[0];
        for(i=1;i<a.length;i++)
        {
            if(max < a[i])
            {
                max=a[i];
                System.out.println("Largest number:"+max+"the index"+i);
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(max > a[i])
            {
                sec=a[i];
                if(sec>a[i]&&sec<max)
                {
                    System.out.println("Second largest number:" + sec);
                }
            }
        }
        /*for(int j =0;j<a.length;j++)
        {
            if(sec>a[j]&&sec<max)
            {
                System.out.println("third largest number:"+sec);
            }
        }*/

    }
}
