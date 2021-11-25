package model;


/**
 * @author JHONNY
 * Esta clase permite almacenar los datos de una persona
 *
 */
public class Person {
	
	private String id;
	private String first_name;
	private String last_name;
	
	
	/**
	 * Metodo constructor de la clase Person que permite inicializar el objeto
	 * 
	 * @param id
	 * @param first_name
	 * @param last_name
	 */
	public Person(String id, String first_name, String last_name) {	
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	/*
	 * Metodos get y set para los atributos de la clase 
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	/*
	 * Metodo para convertir la clase a un string
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Person [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
}
