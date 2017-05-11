
public class TestThreadTask implements Runnable {
    private int taskNum;

    public TestThreadTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("task " + taskNum + " 正在执行>>>>>>");
        try {
            // Thread.currentThread();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task " + taskNum + " 执行完毕<<<<<<");
    }

}
