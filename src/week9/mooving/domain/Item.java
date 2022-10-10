package week9.mooving.domain;

public class Item implements Thing {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }
}