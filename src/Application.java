import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {

    public void main(String[] args) throws InterruptedException {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        ExecutorService executorService = Executors.newWorkStealingPool();//10

       for(int i = 0; i < 30; i++) {//Process
           executorService.execute(new MyPrinter("Salam", i));
       }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MINUTES);

        System.out.println("Counter: " + Counter.counter.get());
    }

}
