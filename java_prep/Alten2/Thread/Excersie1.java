package java_prep.Alten2.Thread;

public class Excersie1 implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        try {

            Thread t1 = new Thread(new Excersie1(), "Thread-A");
            Thread t2 = new Thread(new Excersie1(), "Thread-B");

            t1.start();
            t2.start();
            t1.join();


            t2.join();

        }catch (InterruptedException e){

            System.out.println(e);
        }
    }




}
