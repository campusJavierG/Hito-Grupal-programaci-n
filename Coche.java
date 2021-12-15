//se crea clase coche
public class Coche {
	//se le dan los atributos a coche
	int ruedas;
	int puertas;
	float km;
	String matricula;
	//Se crea el constructor
	public Coche(int ruedas, int puertas, float km, String matricula) {
		super();
		this.ruedas = ruedas;
		this.puertas = puertas;
		this.km = km;
		this.matricula = matricula;
	}
	//se crea el método
	//void no retorna valores
public void velocidad() {
	System.out.println("Voy a 100 km/h, soy un coche");
}
}
