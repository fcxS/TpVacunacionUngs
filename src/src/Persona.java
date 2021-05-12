import java.util.*;

public class Persona {

	
	
	public class persona extends SistemaDeVacunacion {
		private HashMap<String, Persona> personas;
		private int edad, fecha;
	//	static private int dni =0;
		boolean EstaVacunado, TrabajaEnSalud= false;
		private String Esencial;
		private ArrayList<SistemaDeVacunacion> grupos;
		
		persona (int edad, int dni, int fecha, boolean EstaVacunado, String Esencial, boolean TrabajaEnSalud){
			this.edad = edad;
			//this.dni = ++dni;
			++dni;
			this.fecha= fecha;
			this.EstaVacunado = EstaVacunado;
			this.Esencial = Esencial;
			this.TrabajaEnSalud= TrabajaEnSalud;
		}
		
		public boolean MayoresDe60 (int edad) {
			if (edad >= 60) {
				return true;
			}
			return false;
		}

		public void SistemaVacu (){
			personas = new HashMap <String, Persona>();
		}
		
		public boolean TrabajadoresEsenciales (String Esencial, int dni, String persona) {
			if (Esencial.contains(persona)) {
				return true;
			}
			return false;
		}
		
		public void TrajaEnSalud (int dni, String Esencial) {
			if (persona.super.hashCode(Esencial)) {
				
			}
		}
		
		@Override
		public String toString() {
			StringBuilder per = new StringBuilder(super.toString());
			return per.append("trbaja en sald :").append(TrabajaEnSalud).append("esta vacunado:").append(EstaVacunado).toString();
		}
		
	}
}
