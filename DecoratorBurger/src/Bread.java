
public class Bread extends BaseIngredients {

    public Bread(Burger burgerToDecorate) {
        super(burgerToDecorate);
        this.price = 2.0;
    }

    public String getDescription() {
    	 return "Bread and " +burger.getDescription();
    }

}
