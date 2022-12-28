package SevenLecture;
//-----variable--------

public class OurThread extends Thread {

    private String threadName;
    private int startPoint;
    private int counter;
    private int adder;
    private int timeOfDifferenece;
    private boolean threadAliveFlag;

    //--------constructor-----------
    public OurThread(String threadName, int startPoint, int adder, int timeOfDifferenece, boolean threadAliveFlag) {
        this.threadName = threadName;
        this.startPoint = startPoint;

        this.adder = adder;
        this.timeOfDifferenece = timeOfDifferenece;
        this.threadAliveFlag = threadAliveFlag;
    }

    OurThread(String child_1, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //-----run mathod ----
    @Override
    public void run() {
        counter = startPoint;
        while (threadAliveFlag) {
            counter+=adder;
           
            try {
                sleep(timeOfDifferenece);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public void stopThread(){
        threadAliveFlag=false;
    }
    
    
    
    //---------------Getters and setters -----------
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(int startPoint) {
        this.startPoint = startPoint;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeOfDifferenece() {
        return timeOfDifferenece;
    }

    public void setTimeOfDifferenece(int timeOfDifferenece) {
        this.timeOfDifferenece = timeOfDifferenece;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }

}
