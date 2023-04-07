import java.util.Scanner;
public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPRice=200;
    private int bagPack=10;
    private int basePizzaPrice;
    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg)
        {
            this.price = 400;
        }
        else {
            this.price = 500;
        }
        basePizzaPrice=this.price;
    }

    public Pizza() {
    }

    public void addExtraCheese()
    {
        System.out.println("EXTRA CHEESE ADDED");
        this.price+=extraCheesePrice;
    }
    public void addExtraToppings()
    {
        System.out.println("EXTRA TOPPINGS ADDED");
        this.price+=extraToppingsPRice;
    }
    public void takeAway()
    {
        System.out.println("TAKEOUT CONFIRMED");
        this.price+=bagPack;
    }
    public void getBill()
    {
        System.out.println("PIZZA PRICE IS: "+basePizzaPrice);
        System.out.println("EXTRA CHEESE PRICE IS: "+extraCheesePrice);
        System.out.println("EXTRA TOPPING PRICE IS: "+extraToppingsPRice);
        System.out.println("BAGPACK PRICE IS: "+bagPack);
        System.out.println("THE TOTAL PRICE IS: "+this.price);
    }
}
