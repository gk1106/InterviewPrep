package java_prep.Alten2;

public class ThreadExample  extends Thread{
    public static void main(String[] args) {

        ThreadExample threadExample=new ThreadExample();





        threadExample.start();


    }

    @Override
    public void run() {

        for(int i=0;i<10;i++){

            System.out.println(i+"  "+Thread.currentThread().getName());

        }
    }
}
