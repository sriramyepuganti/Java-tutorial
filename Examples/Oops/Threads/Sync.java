class Counter {
    int count = 0;
    public synchronized void counter () {
        count++;
    }
}

class Sync {
    public static void main(String[] args) {
        Counter obj = new Counter();
        Runnable r1 = () -> {
            for(int i = 0; i< 1000; i++) {
                obj.counter();
            }
        };

        Runnable r2 = () -> {
            for(int i = 0; i< 1000; i++) {
                obj.counter();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        try {
            // Join method in Java allows one thread to wait until another thread completes its execution.
            t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(obj.count);

    }
}
