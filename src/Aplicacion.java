package src;

public class Aplicacion {
	
	public Aplicacion() {
		Ivan ivan = new Ivan();
     	Alumno lucas1 =new Lucas();
     	Alumno guillermo = new Guillermo();
     	
		lucas1.saludar();
		guillermo.saludar();		
		System.out.println("Conflicto");
		ivan.saludar();
		System.out.println("Conflicto");
	}

	public static void main(String args[]) {
		Aplicacion MyApplicacion = new Aplicacion();
	}
	
}
