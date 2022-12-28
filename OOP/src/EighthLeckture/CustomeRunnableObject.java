package EighthLeckture;

public class CustomeRunnableObject implements Runnable {

    private String name;
    private int counter;

    public CustomeRunnableObject(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            counter++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
