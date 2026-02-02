
public class InsufficientFundException extends Throwable{
     int amount;
     InsufficientFundException(int amt) {
         amount = amt;
    }
}
