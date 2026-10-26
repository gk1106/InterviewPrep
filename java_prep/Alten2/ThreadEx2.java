package java_prep.Alten2;

public class ThreadEx2 implements Runnable {
   private String TaskName;

   public ThreadEx2(String TaskName) {
       this.TaskName=TaskName;
   }

    @Override
    public void run() {


        for(int i=0;i<=20;i++) {

            System.out.println(i+" "+Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {

ThreadEx2 threadEx2=new ThreadEx2("Task A");
ThreadEx2 threadEx21=new ThreadEx2("Task B");
ThreadEx2 threadEx22=new ThreadEx2("Task C");


Thread taskA=new Thread(threadEx21);
Thread taskB=new Thread(threadEx22);
Thread taskC=new Thread(threadEx21);




taskA.start();
taskB.start();
taskC.start();

    }
}
