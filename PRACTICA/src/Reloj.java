import java.util.ArrayList;

public class Reloj {

	int hora;
	int minutos;
	int segundos;
	
	public Reloj() {
		
		hora = 12;
		minutos = 36;
		segundos = 52;
	}
	
	public void Print() {
		int numEquipos = 5;

		ArrayList<String> liga = new ArrayList<>();
		ArrayList<String> liga2 = new ArrayList<>();

		System.out.println();

		for(int i = 0; i < numEquipos; i++) {
			System.out.print("Dime el equipo n�mero " + (i + 1) + ": ");
			liga.add(Entrada.cadena());
		}

		liga2 =  liga;

		System.out.println("\n\tArrayList liga: " + liga);
		System.out.println("\tArrayList liga2: " + liga2);

		System.out.println("\n\tCantidad de valores del ArrayList liga: " + liga.size());

		liga.remove(4);
		System.out.println("\n\tPosici�n 4 del ArrayList liga borrado: " + liga);

		System.out.print("\nDime un nuevo equipo para la posici�n 2 del ArrayList: ");
		String posicion2 = Entrada.cadena();
		liga.set(2, posicion2);
		System.out.println("\n\tosic�n 2 del ArrayList liga sustituido: " + liga);

		System.out.print("\nDime el equipo que esta en la posicion 3 del Arralist: ");
		String posicion3 = Entrada.cadena();
		liga.remove(posicion3);
		System.out.println("\n\tArrayList liga con la posici�n 3 borrada: " + liga);

	}

	
	
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
}
