public class Tile {
    private int sum = 0;
    private boolean added = false;
    
    private int score = 0;

    public void setSum(int newSum) {
        sum = newSum;
    }
    public int getSum() {
        return sum;
    }
    public void setAdded(boolean bool){
        added = bool;
    }
    public boolean getAdded(){
        return added;
    }
}