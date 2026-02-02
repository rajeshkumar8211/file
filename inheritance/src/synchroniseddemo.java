
class table extends Thread {
    synchronized void printtable(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class synchroniseddemo {
    public static void main (String[] ags){
        table t= new table();
        t.printtable(5);
        t.printtable(10);
    }
}