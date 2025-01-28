public class Controller {

    private Thread myThread;
    private Thread myThread2;
    int valor =0;

    private void startMyThread() {
        // Check if the thread is already running
        if (myThread == null || !myThread.isAlive()) {
            myThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Your thread's code goes here
                    for (int i = 0; i < 10; i++) {
                        valor = valor + 1;
                        System.out.println("Thread running y valor vale: " + valor);
                        try {
                            Thread.sleep(10); // Sleep for 1 second
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt(); // Restore interrupted status
                        }
                    }
                }
            });

            if (myThread2 == null || !myThread2.isAlive()) {
                myThread2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // Your thread's code goes here
                        for (int i = 10; i > 0; i--) {
                            valor = valor - 1;
                            System.out.println("Thread 2 running y valor vale: " + valor);
                            try {
                                Thread.sleep(10); // Sleep for 1 second
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt(); // Restore interrupted status
                            }
                        }
                    }
                });

                myThread.start();// Start the thread
                myThread2.start();


            } else {
                System.out.println("Thread is already running.");
            }
        }
    }



    public void getModelInfo() {}

    public void play(){}

    public void stop(){}



}
