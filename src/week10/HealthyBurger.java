package week10;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthyAddition1(String toppingName, double toppingPrice){
        this.healthyExtra1Name = toppingName;
        this.healthyExtra1Price =toppingPrice;
    }
    public void addHealthyAddition2(String toppingName, double toppingPrice){
        this.healthyExtra2Name = toppingName;
        this.healthyExtra2Price =toppingPrice;
    }

}