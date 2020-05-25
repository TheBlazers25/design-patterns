
public class BaseIngredients extends Ingredients {

    public Burger burger;

    public BaseIngredients(Burger burgerToDecorate){
        this.burger = burgerToDecorate;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return (this.burger.getPrice() + this.price);
    }
}