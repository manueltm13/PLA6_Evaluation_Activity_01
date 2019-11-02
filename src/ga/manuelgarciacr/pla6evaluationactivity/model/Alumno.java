package ga.manuelgarciacr.pla6evaluationactivity.model;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ga.manuelgarciacr.pla6evaluationactivity.validators.DniValidation;
import ga.manuelgarciacr.pla6evaluationactivity.validators.EmailValidation;

public class Alumno {
	// Como valida el tamaño @NotBlank no es necesario
	@Size(min = 3, message = "Mínimo tres caracteres")
	private String nombre;
	@DniValidation(canBeBlank = true)
	private String dni;
	// Por defecto puede estar vacío. Se le puede añadir @NotBlank 
	@EmailValidation
	private String email;
	private String becado;
	private String[] asignaturas;
	private Map<String, String> listaAsignaturas;
	private Map<String, String> siNo = new LinkedHashMap<String, String>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{put("S", "Sí"); put("N", "No");}};

	public Alumno() {
		super();
		setBecado("N");
		listaAsignaturas = new LinkedHashMap<String, String>();
		listaAsignaturas.put("PHP", "PHP");
		listaAsignaturas.put("JAVA", "JAVA");
		listaAsignaturas.put("JS", "JS");
		listaAsignaturas.put(".NET", ".NET");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.trim();
	}

	public String getBecado() {
		return becado;
	}

	public void setBecado(String becado) {
		this.becado = becado.trim();
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Map<String, String> getListaAsignaturas() {
		return listaAsignaturas;
	}

	/**
	 * @return the siNo
	 */
	public Map<String, String> getSiNo() {
		return siNo;
	}

}
