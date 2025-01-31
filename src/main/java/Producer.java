import java.util.ArrayList;

public class Producer extends Model implements Runnable {

    public enum State {Running, Ended}
    private double delay, StopTime, StartTime;
    private String producerName;
    final ArrayList<Producer> producers;


    public Producer(double delay, double StopTime, double StartTime, String producerName, ArrayList<Producer> producers) {

        this.delay = delay;
        this.StopTime = StopTime;
        this.StartTime = StartTime;
        this.producerName = producerName;

        this.producers = producers;
    }


    String[] names = new String[] {
            "Anna", "Liam", "Emma", "Noah", "Mia", "Eve", "Leo", "Ivy", "Zoe", "Max",
            "Ella", "Lucas", "Sophia", "Mason", "Aria", "Jack", "Luna", "Ethan", "Ava", "James",
            "Elena", "Oliver", "Isla", "Henry", "Chloe", "Oscar", "Grace", "Thea", "Finn", "Ellie",
            "Hugo", "Lily", "Jacob", "Nora", "Caleb", "Ruby", "Leo", "Hazel", "Eli", "Stella",
            "Jude", "Scarlett", "Owen", "Violet", "Ryan", "Layla", "Zane", "Clara", "Reid", "Aurora"
    };


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



    public void produce () {

    }

    @Override
    public void run () {


    }

    public void stop () {
        //State.Ended;
    }

}
