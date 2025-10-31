package src;

public class Aplicacion {
	
	public Aplicacion() {
		Alumno ivan = new Ivan();
     	Alumno lucas1 =new Lucas();
     	Alumno guillermo = new Guillermo();
     	
		lucas1.saludar();
		ivan.saludar();
		guillermo.saludar();		
		System.out.println("Este cambio lo ha hecho Iván");
		System.out.println("Este cambio lo ha hecho Guillermo");
	}

	public static void main(String args[]) {
		Aplicacion app = new Aplicacion();
	}
	
}
