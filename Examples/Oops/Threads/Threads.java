

class RunnableClass implements Runnable {
    public void run () {
        for (int index = 0; index <= 100; index++) {
            try {
                // The sleep() method is used to stop the execution of the current thread
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("run in RunnableClass:" + index);
        }
    }
}

class ThreadClass extends Thread {
    public void run () {
        for (int index = 0; index <= 100; index++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("run in ThreadClass:" + index);
        }
    }
}

class Threads {
    /*
     * Threads allows a program to operate more efficiently by doing multiple things at the same time.
     * Threads can be used to perform complicated tasks in the background without interrupting the main program.
     ** Concurrency Problems
     * threads run at the same time as other parts of the program, there is no way to know in which order the code will run. 
     * When the threads and main program are reading and writing the same variables, 
     * the values are unpredictable. The problems that result from this are called concurrency problems.
     */
    public static void main(String[] args) {
        ThreadClass obj = new ThreadClass();
        RunnableClass obj1 = new RunnableClass();
        Thread t1 = new Thread(obj1);
        // Getting the priority
        System.out.println(obj.getPriority());
        // setting the priority
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        t1.start();
    }   
}
