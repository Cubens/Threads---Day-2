
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


// @author Lasse
//http://tutorials.jenkov.com/java-util-concurrent/blockingqueue.html
 
public class BlockingQueueExample {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
