import java.util.Scanner;
public class Main {
    static int sumdigit(int n[]){
        int i,sum=0;
        for(i=0;i<n.length;i++){
            sum +=n[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int i,n[] = new int[2];
            Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        for(i=0;i<n.length;i++){
            n[i]=scanner.nextInt();
        }
        int s=sumdigit(n);
        System.out.println("The sum of digit "+s);
    }
}