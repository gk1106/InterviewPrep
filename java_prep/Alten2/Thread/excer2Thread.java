package java_prep.Alten2.Thread;

public class excer2Thread extends Thread {
    private  int count=0;

    @Override
    public void run() {
        for(int i=1;i<=50;i++){
            count++;
            System.out.println(count);

        }
    }

    public static void main(String[] args) {

        try{
            excer2Thread excer2Thread = new excer2Thread();
            excer2Thread.start();
            excer2Thread.join();
           // excer2Thread.run();
            excer2Thread.sleep(20000);
//sleep method pause our thread
            excer2Thread exc3=new excer2Thread();
            exc3.start();
            exc3.join();
            //exc3.run();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
