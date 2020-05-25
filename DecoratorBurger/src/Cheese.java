
public class Cheese extends BaseIngredients {

    public Cheese(Burger burgerToDecorate) {
        super(burgerToDecorate);
        this.price = 2.0;
    }

    public String getDescription() {
        return "Cheese and " +burger.getDescription();
    }

}