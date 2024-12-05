package OOP;

public class Counter {
    
    private int count;

    public void Zero() {
        this.count = 0;
    }

    public void click(){
        count++;
    }

    public int getCount(){
        return count;
    }

    public void reset() {
        count = 0;
    }


}
