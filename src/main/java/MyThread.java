public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                sleep(2500);
                System.out.printf("Я поток %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException e) {

        }finally {
            System.out.printf("%s звершён\n", getName());
        }
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }
}
