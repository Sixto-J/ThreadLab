public class Consumer implements Runnable {


    public Consumer() {



    }

    public void run() {
        while (true) {
            consume();
        }
    }


    double delay, stopTime, startTime;

    public enum State {Running, Ended}

    public void consume(){


    }


    public void stop() {
        // State.Ended;
    }


}
