package Threading;

public class BasicThreads extends Thread{
    public void run(){
        System.out.println("thread is running......");
    }
}

class Test extends BasicThreads{
    public static void main(String[] args) {
        BasicThreads bt = new BasicThreads();
        bt.start();
    }
}
