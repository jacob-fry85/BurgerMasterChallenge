public class Hamburger {
    private String breadRollType;
    private int meat;
    private double burgerPrice;
    private String name;
    private Addition Lettuce;
    private Addition Tomato;
    private Addition Carrot;
    private Addition Cucumber;

    public Hamburger(String breadRollType, int meat, double burgerPrice, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.burgerPrice = burgerPrice;
        this.name = name;
       setAddition();
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getMeat() {
        return meat;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public String getName() {
        return name;
    }

    public Addition getLettuce() {
        return Lettuce;
    }

    public Addition getTomato() {
        return Tomato;
    }

    public Addition getCarrot() {
        return Carrot;
    }

    public Addition getCucumber() {
        return Cucumber;
    }

    public void setAddition() {
        Lettuce = new Addition("lettuce", 5);
        Tomato = new Addition("Tomato", 4);
        Carrot = new Addition("Carrot", 3);
        Cucumber = new Addition("Cucumber", 2);
    }
}
