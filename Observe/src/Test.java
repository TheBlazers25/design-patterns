
public class Test {

	
	public static void main(String[] args) {
		Predmet s = new Predmet("Bananas", 3f, "Bulgaria");
		Predmet g = new Predmet("Orange", 2f, "Spain");
		Imena imeObs = new Imena();
		Cena cenaObs = new Cena();
		Durjava durjavaObs = new Durjava();
		

		s.addObserver(imeObs);
		s.addObserver(cenaObs);
		g.addObserver(durjavaObs);

		s.setIme("Mango ");
		s.setCena(5.99f);
		g.setDurjava("Philippines ");
		
		s.setIme("Watermelon ");
		s.setCena(2.99f);
		g.setDurjava("Greece ");
		
	}
}
