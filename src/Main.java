import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Hamburger burgerKing = new Hamburger("thick", 2, 3, "Whooper");
        HealthyBurger healthyBurger = new HealthyBurger("thick", 1,5,"Healthy Burger");
        DeluxeBurger deluxeBurger = new DeluxeBurger("thick", 3,8,"Deluxe Burger");

        System.out.println("Welcome to Burger King Store!");
        System.out.println("*****************************");
        System.out.println("Which burger do you want?");
        System.out.println("1. Basic Burger. Price : " + burgerKing.getBurgerPrice());
        System.out.println("2. Healthy Burger. Price : " + healthyBurger.getBurgerPrice());
        System.out.println("3. Deluxe Burger. Price : " + deluxeBurger.getBurgerPrice());
        System.out.print("Your options? ");

        double totalCost = 0;
        double totalAdditionCost = 0;
        double additionCost = 0;
        double additionAmount = 0;
        int chooseAdd = 0;
        char additionAnswer;

        boolean hasIntNext = keyboard.hasNextInt();

        if (hasIntNext) {
            int chooseBurger = keyboard.nextInt();
            System.out.println(chooseBurger);
            if (chooseBurger == 1) {
                System.out.println("Burger name : " + burgerKing.getName() + "\n" +
                        "Meat : " + burgerKing.getMeat() + "\n" +
                        "Breadroll type : " + burgerKing.getBreadRollType() + "\n" +
                        "Burger price $" + burgerKing.getBurgerPrice());

                do {
                    System.out.print("Want Some Addition? Your answer(y/n) : ");
                    additionAnswer = keyboard.next().charAt(0);
                    if (additionAnswer == 'y') {
                        System.out.println("Basic Burger Addition : ");
                        System.out.println("1. " + burgerKing.getCarrot().getName() + " price : $" + burgerKing.getCarrot().getPrice());
                        System.out.println("2. " + burgerKing.getCucumber().getName() + " price : $" + burgerKing.getCucumber().getPrice());
                        System.out.println("3. " + burgerKing.getLettuce().getName() + " price : $" + burgerKing.getLettuce().getPrice());
                        System.out.println("4. " + burgerKing.getTomato().getName() + " price : $" + burgerKing.getTomato().getPrice());
                        System.out.println("Which number do you want? : ");
                        chooseAdd = keyboard.nextInt();

                        System.out.println("How many? : ");
                        additionAmount = keyboard.nextDouble();

                        System.out.println("chooseAdd : " + chooseAdd);
                        switch (chooseAdd) {
                            case 1:
                                additionCost = additionAmount * burgerKing.getCarrot().getPrice();
                                break;
                            case 2:
                                additionCost = additionAmount * burgerKing.getCucumber().getPrice();
                                break;
                            case 3:
                                additionCost = additionAmount * burgerKing.getLettuce().getPrice();
                                break;
                            case 4:
                                additionCost = additionAmount * burgerKing.getTomato().getPrice();
                                break;
                        }
                        System.out.println("add cost : " + additionCost);
                        totalAdditionCost += additionCost;
                        System.out.println("Total Addition Cost : " + totalAdditionCost);
                    }
                } while (additionAnswer == 'y');
                totalCost = totalAdditionCost + burgerKing.getBurgerPrice();
            } if (chooseBurger == 2) {
                System.out.println("Burger name : " + healthyBurger.getName() + "\n" +
                        "Meat : " + healthyBurger.getMeat() + "\n" +
                        "Breadroll type : " + healthyBurger.getBreadRollType() + "\n" +
                        "Burger price $" + healthyBurger.getBurgerPrice());
                do {
                    System.out.print("Want Some Addition? Your answer(y/n) : ");
                    additionAnswer = keyboard.next().charAt(0);
                    if (additionAnswer == 'y') {
                        System.out.println("Basic Burger Addition : ");
                        System.out.println("1. " + burgerKing.getCarrot().getName() + " price : $" + burgerKing.getCarrot().getPrice());
                        System.out.println("2. " + burgerKing.getCucumber().getName() + " price : $" + burgerKing.getCucumber().getPrice());
                        System.out.println("3. " + burgerKing.getLettuce().getName() + " price : $" + burgerKing.getLettuce().getPrice());
                        System.out.println("4. " + burgerKing.getTomato().getName() + " price : $" + burgerKing.getTomato().getPrice());
                        System.out.println("5. " + healthyBurger.getCheese().getName() + " price : $" + healthyBurger.getCheese().getPrice());
                        System.out.println("6. " + healthyBurger.getCocktail().getName() + " price : $" + healthyBurger.getCocktail().getPrice());

                        System.out.println("Which number do you want? : ");
                        chooseAdd = keyboard.nextInt();

                        System.out.println("How many? : ");
                        additionAmount = keyboard.nextDouble();

                        System.out.println("chooseAdd : " + chooseAdd);
                        switch (chooseAdd) {
                            case 1:
                                additionCost = additionAmount * burgerKing.getCarrot().getPrice();
                                break;
                            case 2:
                                additionCost = additionAmount * burgerKing.getCucumber().getPrice();
                                break;
                            case 3:
                                additionCost = additionAmount * burgerKing.getLettuce().getPrice();
                                break;
                            case 4:
                                additionCost = additionAmount * burgerKing.getTomato().getPrice();
                                break;
                            case 5:
                                additionCost = additionAmount * healthyBurger.getCheese().getPrice();
                                break;
                            case 6:
                                additionCost = additionAmount * healthyBurger.getCocktail().getPrice();
                                break;
                        }
                        System.out.println("add cost : " + additionCost);
                        totalAdditionCost += additionCost;
                        System.out.println("Total Addition Cost : " + totalAdditionCost);
                    }
                } while (additionAnswer == 'y');
                totalCost = totalAdditionCost + healthyBurger.getBurgerPrice();
            } if (chooseBurger == 3) {
                System.out.println("Burger name : " + deluxeBurger.getName() + "\n" +
                        "Meat : " + deluxeBurger.getMeat() + "\n" +
                        "Breadroll type : " + deluxeBurger.getBreadRollType() + "\n" +
                        "Burger price $" + deluxeBurger.getBurgerPrice());
                do {
                    System.out.print("Want Some Addition? Your answer(y/n) : ");
                    additionAnswer = keyboard.next().charAt(0);
                    if (additionAnswer == 'y') {
                        System.out.println("Basic Burger Addition : ");
                        System.out.println("1. " + deluxeBurger.getChips().getName() + " price : $" + deluxeBurger.getChips().getPrice());
                        System.out.println("2. " + deluxeBurger.getDrinks().getName() + " price : $" + deluxeBurger.getDrinks().getPrice());

                        System.out.println("Which number do you want? : ");
                        chooseAdd = keyboard.nextInt();

                        System.out.println("How many? : ");
                        additionAmount = keyboard.nextDouble();

                        System.out.println("chooseAdd : " + chooseAdd);
                        switch (chooseAdd) {
                            case 1:
                                additionCost = additionAmount * deluxeBurger.getChips().getPrice();
                                break;
                            case 2:
                                additionCost = additionAmount * deluxeBurger.getDrinks().getPrice();
                                break;
                        }
                        System.out.println("add cost : " + additionCost);
                        totalAdditionCost += additionCost;
                        System.out.println("Total Addition Cost : " + totalAdditionCost);
                    }
                } while (additionAnswer == 'y');
                totalCost = totalAdditionCost + deluxeBurger.getBurgerPrice();
            }
        }

        System.out.println("The total amount is :" + totalCost);
    }
}
