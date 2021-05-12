import java.util.ArrayList;
import java.util.TreeSet;

public class SistemaDeVacunacion {
	private ArrayList<SistemaDeVacunacion> vacunas;
	private TreeSet <Persona> vacunnas;
	private String Vacunes;
	private int dni, fecha, Cantvacunas; 
	
	public SistemaDeVacunacion (int dni, int fecha) {
		this.fecha = fecha;
		this.dni = dni;
		this.Cantvacunas=Cantvacunas;
		this.vacunnas = new TreeSet <Persona>();
		this.vacunas = new ArrayList<SistemaDeVacunacion>();
	}
	
	public void RegistrarPersona (Persona nueva) {
		if (!vacunnas.contains(nueva)) {
			vacunnas.add(nueva);
		}
	}
	
	public boolean MaxVacunasDiarias (int Cantvacunas) {
		if (this.Cantvacunas <= 500) { //ej
			return true;
	
		}
		return false;
	}
	
	public void darTurno (int Cantvacunas, int fecha) {
		if (!MaxVacunasDiarias(fecha)== true) { // y que la persona no este vacunada, y persona que se le dio turno y no asistio
			
		}
	}
	public void ListaDeEspera () {
		
	}
}
