
public class Egg extends BaseIngredients {

    public Egg(Burger burgerToDecorate) {
        super(burgerToDecorate);
        this.price = 2.0;
    }

    public String getDescription() {
    	 return "Egg and " +burger.getDescription();
    }

}