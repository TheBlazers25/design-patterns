import java.util.Observable;
import java.util.Observer;



public class Imena implements Observer{
	
private String ime;

public Imena() {
	ime="Banani";
	System.out.println("Ime suzdadeno: " + ime);
}

@Override
public void update(Observable obj, Object arg) {
	if (arg instanceof String) {
		ime=(String) arg;
		System.out.println("Ime promeneno na: " + ime);
	}else {
		System.out.println("ImenaObs: Promeni koito na sa po imeto" );
	}
	
}
}

