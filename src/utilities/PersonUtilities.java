package utilities;

import java.util.ArrayList;

import model.Person;
import model.SearchCriteriaPerson;

/**
 * @author JHONNY Esta clase permite gestionar los metodos que operan sobre la
 *         clase Person
 *
 */
public class PersonUtilities {
	private ArrayList<Person> person_found;
	private static final String KEY_VALUE_1 = "id", KEY_VALUE_2 = "first_name", KEY_VALUE_3 = "last_name";

	/**
	 * Este metodo permite buscar un valor en un arreglo de tipo Person
	 * 
	 * @param arrayPerson arreglo inicial que en el que se va a buscar un valor
	 * @param value       valor a buscar en el arreglo
	 * @return arreglo con los elementos que coinciden con el valor de busqueda
	 */
	public ArrayList<Person> findMatch(Person arrayPerson[], SearchCriteriaPerson searchCriteria) {
		person_found = new ArrayList<Person>();
		/*
		 * Ciclo que permite recorre el arreglo de objetos tipo Person
		 */
		for (Person person : arrayPerson) {
			// condicion para validar si el criterio de busqueda y el valor de la llave
			// existen. Si existen ambos se agrega al arreglo de personas
			switch (searchCriteria.getKey()) {
			case KEY_VALUE_1:
				if (person.getId().equals(searchCriteria.getValue())) {
					person_found.add(person);
				}
				break;
			case KEY_VALUE_2:
				if (person.getFirst_name().equals(searchCriteria.getValue())) {
					person_found.add(person);
				}
				break;
			case KEY_VALUE_3:
				if (person.getLast_name().equals(searchCriteria.getValue())) {
					person_found.add(person);
				}
				break;
			default:
				break;
			}
		}
		return person_found;
	}
}