public class DeluxeBurger extends Hamburger{
    private Addition chips;
    private Addition drinks;

    public DeluxeBurger(String breadRollType, int meat, double burgerPrice, String name) {
        super(breadRollType, meat, burgerPrice, name);
        setAddition();
    }

    public void setAddition() {
        chips = new Addition("chips", 8);
        drinks = new Addition("drinks", 10);
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrinks() {
        return drinks;
    }
}
