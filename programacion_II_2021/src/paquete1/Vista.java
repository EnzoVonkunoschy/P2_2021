package paquete1;

import java.util.Scanner;

public class Vista {
	
	public static void mostrarPersona(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
	}
	
	public static Persona entregarPersona() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre:");
		String nom = scanner.next();
		System.out.println("Ingrese apellido");
		String ape = scanner.next();
		
		Persona nnPersona = new Persona(nom,ape);
		
		return nnPersona;
	}

}
