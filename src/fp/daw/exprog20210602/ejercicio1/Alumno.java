package fp.daw.exprog20210602.ejercicio1;

import java.time.LocalDate;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private Integer curso;
	
	public Alumno() {
	
	}

	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String ciclo, Integer curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciclo=" + ciclo + ", curso=" + curso + "]";
	}
	
	
	
	

}
