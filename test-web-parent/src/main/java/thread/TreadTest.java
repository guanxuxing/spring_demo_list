package thread;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/12/9.
 */
public class TreadTest {
   public static ExecutorService threadPool = Executors.newFixedThreadPool(3);
    public static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws Exception{
        ThreadPoolExecutor poolExecutor = null;
        for (int i =0 ; i<5; i++) {
            thread(String.valueOf(i) + ": info" );
        }
        threadPool.shutdown();
        System.out.println("线程池关闭后运行其他信息");
    }


    public static void thread(final String result) throws Exception{
       // ExecutorService threadPool = Executors.newFixedThreadPool(3);
        Future<String> ret = threadPool.submit(new Callable<String>() {
            public String call() throws Exception {
                return get(result);
            }
        });
        System.out.println("ret: " + ret.isDone());
    }

    public static String get(String result){
        return result;
    }
}
