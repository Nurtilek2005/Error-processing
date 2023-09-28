import java.io.IOException;

public class Counter extends Exception implements AutoCloseable {
    private int count = 0;
    private boolean isWorking = false;

    public Counter() {
        this.isWorking = true;
    }

    public void add() throws IOException {
        if (!isWorking) {
            throw new IOException("Counter is not working!");
        }
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public void reset() {
        this.count = 0;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public void close() throws IOException {
        this.count = 0;
        this.isWorking = false;
    }
}