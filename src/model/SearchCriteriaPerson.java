package model;

/**
 * @author JHONNY Esta clase permite representar el criterio de busqueda
 *         conformado por llave y valor
 */
public class SearchCriteriaPerson {
	private String key;
	private String value;

	/**
	 * Metodo constructor de la clase SearchCriteriaPerson que permite inicializar el objeto
	 * 
	 * @param key
	 * @param value
	 */
	public SearchCriteriaPerson(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	/*
	 * Metodos get y set
	 */
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}