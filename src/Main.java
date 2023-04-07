public class Main {
    public static void main(String[] args)
    {
       // Pizza basePizza = new Pizza(false);
       // basePizza.addExtraCheese();
       // basePizza.addExtraToppings();
       // basePizza.takeAway();
        //basePizza.getBill();
        PremiumPizza pp = new PremiumPizza(false);
        pp.addExtraCheese();
        pp.addExtraToppings();
        pp.getBill();
    }
}