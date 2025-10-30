package src;

public class Aplicacion {
	
	public Aplicacion() {
		Alumno ivan = new Ivan();
     	Alumno lucas1 =new Lucas();
     	Alumno guillermo = new Guillermo();
     	
		lucas1.saludar();
		ivan.saludar();
		guillermo.saludar();
		System.out.println("Hola voy a causar un conflicto de merges");
	}

	public static void main(String args[]) {
		Aplicacion app = new Aplicacion();
	}
	
}
