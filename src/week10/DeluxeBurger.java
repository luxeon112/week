package week10;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.10, "White");
        super.addHamburgerAddition1("Chips", 2.50);
        super.addHamburgerAddition2("Drinks", 2.50);
    }
    @Override
    public void addHamburgerAddition1(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addTopping, double addPrice) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}