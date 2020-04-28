import java.util.Observable;


public class Predmet extends Observable {
private String ime;
private float cena;
public String durjava;

public Predmet(String ime, float cena, String durjava) {
	this.ime=ime;
	this.cena=cena;
	this.durjava=durjava;
	System.out.println("Suzdadeni plodove: " + ime +  ". Vnos ot: " +durjava + ", na cena: "  + cena + " lv.");
}

public String getIme() {
	return ime;
}


public float getCena() {
	return cena;
}

public String getDurjava() {
	return durjava;
}

public void setCena(float cena) {
	this.cena=cena;
	setChanged();
	notifyObservers(new Float(cena));
}

public void setIme(String ime) {
	this.ime = ime;
	setChanged();
	notifyObservers(ime);
}

public void setDurjava(String durjava) {
	this.durjava = durjava;
	setChanged();
	notifyObservers(durjava);
}

}
