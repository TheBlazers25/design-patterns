import java.util.Observable;
import java.util.Observer;



public class Durjava implements Observer{
	
private String durjava;

public Durjava() {
	durjava="Bulgaria";
	System.out.println("Vnos ot: " + durjava);
}

@Override
public void update(Observable obj, Object arg) {
	if (arg instanceof String) {
		durjava=(String) arg;
		System.out.println("Vnos promenen na: " + durjava);
	}else {
		System.out.println("DurjavaObs: Promeni koito ne sa po vnos-a" );
	}
	
}
}
