package fp.daw.exprog20210602.ejercicio2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PruebaFrecuencia {

	public static void main(String[] args) {
		
		File ruta1=new File("C:\\Users\\alumno\\prueba\\El Quijote ISO-8859-1.txt");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca una palabra por teclado:");
		String palabraConsultada=sc.nextLine();
		
		try {
			Frecuencia f1=new Frecuencia(ruta1);
			System.out.println(f1.frecuenciaPalabras(palabraConsultada));
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
		
	

	}

}
