//
public class Chef {
	
		private Shop _shop = new Shop();
		private RegionCheck _regioncheck= new RegionCheck();
		private IngredientsCheck _ingredientscheck= new IngredientsCheck();
	 
	    public boolean IsEligible(Customer cust, Burger b,  Ingredient i, Ingredient f, Ingredient g, Burger c,Burger e, Region reg)
	    {
	    	System.out.println(cust.Name()+" is from " +reg.Regions()+" and is hungry and wants to buy every single type of burger!\n");
	 
	      boolean eligible = true;
	      
	         if (!_regioncheck.IsInRegion(reg))
	      {
	        eligible = false;
	      }
	         
	         
	         
	      // Check if we have the required ingredients
	      if (!_shop.HasSufficientReagents(b, c,e))
	      {
	        eligible = false;
	      }
	      
	        if (!_ingredientscheck.IsInStock(i, f, g))
	      {
	        eligible = false;
	      }
	      
	      System.out.println("Add " +i.Ingredients() +" for " +b.Burgers());
	      System.out.println("Add " +f.Ingredients() +" for " +c.Burgers());
	      System.out.println("Add " +g.Ingredients() +" for " +e.Burgers());
	           
	      return eligible;
	    }

}
