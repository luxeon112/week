package week10;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;
    private int toppingCount;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.toppingCount =0;
    }
    public void addHamburgerAddition1(String addTopping, double addPrice){
        addition1Price = addPrice;
        addition1Name = addTopping;
        toppingCount++;
    }
    public void addHamburgerAddition2(String addTopping, double addPrice){
        addition2Price = addPrice;
        addition2Name = addTopping;
        toppingCount++;
    }
    public void addHamburgerAddition3(String addTopping, double addPrice){
        addition3Price = addPrice;
        addition3Name = addTopping;
        toppingCount++;
    }
    public void addHamburgerAddition4(String addTopping, double addPrice){
        addition4Price = addPrice;
        addition4Name = addTopping;
        toppingCount++;
    }
    public double itemizeHamburger(){
        System.out.println(this.name + " hamburger on a " +this.breadRollType+ " roll with "+this.meat+", price is " +this.price);
        double runningTotal = 0;
        if(this.toppingCount > 0) {
            System.out.println("Added " + addition1Name +" for an extra "+ addition1Price);
            runningTotal += addition1Price;
        }if(this.toppingCount > 1) {
            System.out.println("Added " + addition2Name +" for an extra "+ addition2Price);
            runningTotal += addition2Price;
        }if(this.toppingCount > 2) {
            System.out.println("Added " + addition3Name +" for an extra "+ addition3Price);
            runningTotal += addition3Price;
        }if(this.toppingCount > 3) {
            System.out.println("Added " + addition4Name +" for an extra "+ addition4Price);
            runningTotal += addition4Price;
        }
        return this.price + runningTotal;
    }
}