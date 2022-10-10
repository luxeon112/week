public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public BoundedCounter(int upperLimit, int value) {
        this.value=value;
        this.upperLimit=upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value >= this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        // 78.1 example: return this.name + ", age " + this.age + " years";

        if (this.value<10) {
            return "0" + this.value;
        } else
            return "" + this.value;
    }

    public int getValue() {
        // what does this do? implement how? return int value for comparisons?

        return this.value;
    }

    public void setValue(int value) {
        // set the value of parameter to counter unless parameter<zero or parameter>upperLimit. (no effect there)

        if (value<0 || value>this.upperLimit) {
            // do nothing
        } else {
            this.value = value;
        }

    }
}