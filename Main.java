
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se crean nuevos objetos
		Coche citroen= new Coche(4, 4, 100000, "PACOELVELOZ");
		Coche ferrari=new Coche(4,4,3000,"ROJOFERRARI");
		Camion renault=new Camion(6, 2, 200000,"TUPRIMALAGORDA");
		//Se crea un array con coche y camión
		Coche vehiculo[]= {citroen,ferrari,renault};
		//se coge valor deseado del array
		vehiculo[2].velocidad();
	}

}
