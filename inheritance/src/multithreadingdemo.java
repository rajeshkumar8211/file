class book implements Runnable{
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Update db");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class num extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class multithreadingdemo {
    public static void main(String[] args) throws InterruptedException {
      book b = new book();
      num n= new num();
      Runnable r =new book(){
          public void run() {
              for(int i=0;i<5;i++) {
                  System.out.println("Update db");

                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
          }
      };
      Thread t1=new Thread(r);
      t1.start();
      t1.setName("book1");
      t1.setPriority(Thread.MAX_PRIORITY);
      System.out.println(t1.getName());
      System.out.println(t1.getPriority());
      n.start();
      if(n.isAlive()){
          System.out.println("still alive");
      }
      n.join();

      System.out.println("bye");
    }
}
