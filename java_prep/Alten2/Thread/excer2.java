package java_prep.Alten2.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class excer2 implements Runnable {

  AtomicInteger count = new AtomicInteger(0);
    //int count=0;

    @Override
    public void run() {

        for(int i=1;i<=50;i++){
            System.out.println(count.incrementAndGet());
//            count++;
//            System.out.println(count);
        }

    }

    public static void main(String[] args)  {
        try{
            excer2 excer2 = new excer2();

            Thread t1=new Thread(excer2);
            Thread t2=new Thread(excer2);
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }catch(InterruptedException e){
           System.out.println(e);
        }


    }


}
