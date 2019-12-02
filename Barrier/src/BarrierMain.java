import java.util.ArrayList;
import java.util.List;
/*
public class BarrierMain {
    public static void main(String[] args) {
        checkBarrier();
    }

    private static void checkBarrier() {
        Barrier barrier = new Barrier(3);
        BarrierRunner runner = new BarrierRunner(barrier);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            threads.add(new Thread(runner));
        }
        for (Thread thread : threads) {
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {

            }
        }
    }
}
 */
public class BarrierMain {
    private Barrier barrier = new Barrier(5);

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is waiting");
        barrier.barrierRun();
        System.out.println(Thread.currentThread().getName() + " passed through");
    }

    public static void main(String[] args) {
        BarrierMain main = new BarrierMain();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run(){
                    main.run();
                }
            });
            thread.setName("" + i);
            thread.start();
        }
    }
}

