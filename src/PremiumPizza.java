public class PremiumPizza extends Pizza {
    public PremiumPizza(boolean veg)
    {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
        super.getBill();
        super.takeAway();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }
}
