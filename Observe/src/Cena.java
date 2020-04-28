
import java.util.Observable;
import java.util.Observer;


public class Cena implements Observer {
	private float cena;

	public Cena() {
		cena = 3;
		System.out.println("Cenata e: " + cena + " lv.");
	}


	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof Float) {
			cena = ((Float) arg).floatValue();
			System.out.println("Cenate e promenena na: " + cena + " lv.");
		} else {
			System.out.println("CenaObs: Promeni koito ne sa po cenata");
		}
	}
}


