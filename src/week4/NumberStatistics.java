package week4;

public class NumberStatistics {
    private int amountOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
}