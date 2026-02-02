public class InsufficientFundExpection extends Exception {
    int amount;
     InsufficientFundExpection(int amt) {
         amount = amt;
         System.out.println("you want " + amount + "rupees to withdraw");
    }
}
