package fp.daw.exprog20210602.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaAlumno {
	
	static DateTimeFormatter fechaEspana=DateTimeFormatter.ofPattern("dd/MM/yy");
	static LocalDate fechaEspA1=LocalDate.parse("21/05/1989", fechaEspana);
	static LocalDate fechaEspA2=LocalDate.parse("02/09/1999", fechaEspana);
	static LocalDate fechaEspA3=LocalDate.parse("10/12/1992", fechaEspana);
	static LocalDate fechaEspA4=LocalDate.parse("05/01/1994", fechaEspana);
	
	static Alumno a1=new Alumno("Pedro", "Garcia Fernandez",fechaEspA1 , "Daw", 2);
	static Alumno a2=new Alumno("Maria", "Perez Medina",fechaEspA2 , "Dam", 1);
	static Alumno a3=new Alumno("Amaro", "Rodriguez Prada",fechaEspA3 , "Dam", 2);
	static Alumno a4=new Alumno("Alicia", "Gonzalez Prieto",fechaEspA4 , "Daw", 1);
	
	

	public static void main(String[] args) {
		
		
		
		
		Set<Alumno>alumno=new TreeSet<Alumno>();
		alumno.add(a1);
		alumno.add(a2);
		alumno.add(a3);
		alumno.add(a4);
		
		

	}
	
class AlumnosComparador implements Comparator<Alumno>{

		
		public int compare(Alumno alu1, Alumno alu2) {
			
			if(alu1.getApellidos().compareTo(alu2.getApellidos())==0)
			return alu1.getNombre().compareTo(alu2.getNombre());
		else {
			return alu1.getApellidos().compareTo(alu2.getApellidos());
		}
	
	
	
		}
	}
}
	
		
		
	


