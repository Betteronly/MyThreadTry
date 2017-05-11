import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPoolExecutor {
    public static void main(String[] args) {
        // 线程池：FixedThreadPool
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        // for (int i = 1; i < 10000; i++) {
        // final int index = i;
        // fixedThreadPool.execute(new Runnable() {
        // @Override
        // public void run() {
        // try {
        // System.out.println(index);
        // Thread.sleep(2000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // });
        // }

        // 线程池：自定义
        TestThreadPoolManage testThreadPool = new TestThreadPoolManage();
        for (int i = 1; i < 500; i++) {
            try {
                // Thread.currentThread();
                Thread.sleep(300);
            } catch (Exception e) {
                e.printStackTrace();
            }

            TestThreadTask myTask = new TestThreadTask(i);
            testThreadPool.myThreadPoolExecutor.execute(myTask);
            System.out.println("-----------------------线程池中线程数目：" + testThreadPool.myThreadPoolExecutor.getPoolSize()
                    + " ，队列中等待执行的任务数目：" + testThreadPool.myThreadPoolExecutor.getQueue().size() + " ，已执行完成的任务数目："
                    + testThreadPool.myThreadPoolExecutor.getCompletedTaskCount() + " ，任务活动数目："
                    + testThreadPool.myThreadPoolExecutor.getActiveCount() + " ， 任务数目："
                    + testThreadPool.myThreadPoolExecutor.getTaskCount());
        }
        testThreadPool.myThreadPoolExecutor.shutdown();
    }

}
