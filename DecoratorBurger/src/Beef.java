
public class Beef extends BaseIngredients {

    public Beef(Burger burgerToDecorate) {
        super(burgerToDecorate);
    }

    public String getDescription() {
        return "Beef to " +burger.getDescription();
    }

}