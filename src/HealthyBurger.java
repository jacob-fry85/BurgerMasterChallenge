public class HealthyBurger extends Hamburger{
    private Addition cheese;
    private Addition cocktail;

    public HealthyBurger(String breadRollType, int meat, double burgerPrice, String name) {
        super(breadRollType, meat, burgerPrice, name);
        setAddition();
    }

    public void setAddition() {
        cheese = new Addition("cheese", 8);
        cocktail = new Addition("cocktail", 10);
    }

    public Addition getCheese() {
        return cheese;
    }

    public Addition getCocktail() {
        return cocktail;
    }
}
