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
		System.out.println("Este cambio lo ha hecho Iván");
		System.out.println("Cambio para conflicto pero en su rama");
		System.out.println("Este cambio lo ha hecho Lucas");
	}

	public static void main(String args[]) {
		Aplicacion MyApp = new Aplicacion();
	}
	
}
