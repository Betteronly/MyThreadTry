import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class TestThreadPoolManage {
    public static int corePoolSize = 1;
    public static int maximumPoolSize = 10;
    public static long keepAliveTime = 1L;
    public static TimeUnit unit = TimeUnit.SECONDS;
    public static int queueSize = 10;
    public BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(queueSize);
    public RejectedExecutionHandler handler = new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            // TODO Auto-generated method stub
            System.out.println("-----------------------# # # # # # # 线 程 异 常 # # # # # # # 线 程 异 常 # # # # # # # \n\n");
        }
    };

    public ThreadPoolExecutor myThreadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize,
            keepAliveTime, unit, workQueue, handler);

}
