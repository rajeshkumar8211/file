
class account{
    double balance;
    account(double bal){
        balance=bal;
    }

     int withdraw(int bal,int withdrawamt){
        try {
            if (bal>withdrawamt){
                System.out.println("you can withdraw");
            }
            else{
                throw new InsufficientFundExpection(withdrawamt-bal);
            }
        }
        catch(InsufficientFundExpection e){
            System.out.println("you not have sufficient amount");
        }
         return bal;
     }
}
public class exceptionhandlingdemo {
    public static void main(String[] args){
        int a=10,b=0;
        int c=0;
        try {
            c=a/b;//throw
        }
        catch (ArithmeticException |NullPointerException e) {
            System.out.println("Error has occured");
        }
        catch (Exception e) {
            System.err.println("exception occured");
        }
        System.out.println(c);
        System.out.println("End of program");
        /*int i=0;
        try(Scanner scanner=new Scanner(System.in)) {
            i = scanner.nextInt();
        }*/
       // System.out.println(i);
        account ac = new account(1500);
        ac.withdraw(1500,3000);
        /*double bal=500,withdraw=1500;
        try {
            if (bal<withdraw){
                throw new InsufficientFundException(withdraw-bal);
            }
        }
        catch (InsufficientFundException e) {
            System.out.println("not money");
        }*/
    }
}
