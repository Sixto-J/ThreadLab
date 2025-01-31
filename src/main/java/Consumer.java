import java.util.ArrayList;

public class Consumer extends Model implements Runnable {

    double delay, stopTime, startTime;
    public enum State {Running, Ended}
    final ArrayList<Consumer> consumers;


    String[] names = new String[] {
            "Anna", "Liam", "Emma", "Noah", "Mia", "Eve", "LeZo", "Ivy", "Zoe", "Max",
            "Ella", "Lucas", "Sophia", "Mason", "Aria", "Jack", "Luna", "Ethan", "Ava", "James",
            "Elena", "Oliver", "Isla", "Henry", "Chloe", "Oscar", "Grace", "Thea", "Finn", "Ellie",
            "Hugo", "Lily", "Jacob", "Nora", "Caleb", "Ruby", "Leo", "Hazel", "Eli", "Stella",
            "Jude", "Scarlett", "Owen", "Violet", "Ryan", "Layla", "Zane", "Clara", "Reid", "Aurora"
    };




    public Consumer(double stopTime, double startTime, double delay, ArrayList<Consumer> consumers) {
        this.stopTime = stopTime;
        this.startTime = startTime;
        this.delay = delay;
        this.consumers = consumers;

    }

    public void run() {
        while (true) {
            consume();
        }
    }

    public void consume(){


    }


    public void stop() {
        // State.Ended;
    }








    private String[] removeName(int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove >= this.names.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        String[] result = new String[this.names.length - 1];
        int currentIndex = 0;

        for (int i = 0; i < this.names.length; i++) {
            if (i != indexToRemove) {
                result[currentIndex++] = this.names[i];
            }
        }

        return result;
    }


}
