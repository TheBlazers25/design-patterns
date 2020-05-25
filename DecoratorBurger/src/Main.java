
public class Main {

	 public static void main(String[] args) {
		 
		 //Menu
		 Burger burger1 = new Burgerwcheese();
		 Burger burger2 = new Beefburger();
		 Burger burger4 = new Beefburger();
		 Burger burger5 = new Beefburger();
		 Burger burger3 = new Burgerwegg();
		 System.out.println("	*Menu*");
		 System.out.println( burger2.getDescription() + " $" + burger2.getPrice());
		 System.out.println( burger1.getDescription() + " $" + burger1.getPrice());
		 System.out.println( burger3.getDescription() + " $" + burger3.getPrice() +"\n");
 
	     //Creation
		 System.out.println("	*Creation process*");
		 burger2 = new Beef(burger2);
		 burger2 = new Bread(burger2);
		 System.out.println("Add "+ burger2.getDescription());		 
		 
		 burger4 = new Beef(burger4);
		 burger4 = new Cheese(burger4);
		 burger4 = new Bread(burger4);
	     System.out.println("Add "+ burger4.getDescription());
	     
	     burger5 = new Beef(burger5);
	     burger5 = new Egg(burger5);
	     burger5 = new Bread(burger5);
	     System.out.println("Add "+ burger5.getDescription() +"\n");

	     //Delivery
	     System.out.println("	*Delivery*");
	     Region region1 = new Plovdiv();
	     System.out.println("We can deliver to: " +region1.getDescription());

		 
	 }
	
}
