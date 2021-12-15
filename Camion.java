
//extends es para heredar los atributos de coche
public class Camion extends Coche {
//el constructor de camión
	public Camion(int ruedas, int puertas, float km, String matricula) {
		super(ruedas, puertas, km, matricula);
		// TODO Auto-generated constructor stub
		
}
	//sobreescritura, modifico un método heredado
	public void velocidad() {
		System.out.println("Voy a 50 km/h,soy un camión");
	}
}


