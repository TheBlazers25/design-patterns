
public class Main {
	public static void main(String[] args) {
		
	      Chef chef = new Chef();

	 
	      Customer customer = new Customer("Radostin");
	      Region region = new Region("Bulgaria");
	      Burger burger = new Burger("Beef Burger");
	      Ingredient ingredient = new Ingredient ("Beef patty");
	      Ingredient ingredient1 = new Ingredient ("Cheese");
	      Ingredient ingredient2 = new Ingredient ("Eggs");
	      Burger burger1 = new Burger("Burger with cheese");
	      Burger burger2 = new Burger("Burger with egg");
	      boolean eligible = chef.IsEligible(customer, burger,ingredient,ingredient1, ingredient2, burger1,burger2, region);
	 
	      System.out.println("\n" + customer.Name() +" can buy every burger and is" + (eligible ? " happy!" : " sad!"));
	 
	      
	     
	}

}
