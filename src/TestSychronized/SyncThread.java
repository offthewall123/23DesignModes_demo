package TestSychronized;

public class SyncThread implements Runnable{
    private static int count;
    public SyncThread(){
        count=0;
    }

    public void run(){
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+":"+(count++));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new SyncThread(),"thread1");
        Thread thread2=new Thread(new SyncThread(),"thread2");
        thread1.start();
        thread2.start();



//        SyncThread syncThread = new SyncThread();//同一个对象
//        Thread thread1 = new Thread(syncThread, "SyncThread1");
//        Thread thread2 = new Thread(syncThread, "Counter");
//        thread1.start();
//        thread2.start();
    }
}
