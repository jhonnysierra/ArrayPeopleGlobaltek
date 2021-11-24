package utilities;

import java.util.ArrayList;

import model.Person;

/**
 * @author JHONNY
 * Esta clase permite gestionar los metodos que operan sobre la clase Person
 *
 */
public class PersonUtilities {
	private ArrayList<Person> person_found;

	/**
	 * Este metodo permite buscar un valor en un arreglo de tipo Person
	 * 
	 * @param arrayPerson arreglo inicial que en el que se va a buscar un valor
	 * @param value valor a buscar en el arreglo
	 * @return arreglo con los elementos que coinciden con el valor de busqueda
	 */
	public ArrayList<Person> findMatch(Person arrayPerson[], String value) {
		person_found = new ArrayList<Person>();
		/*
		 * Ciclo que permite recorre el arreglo de objetos tipo Person
		 */
		
		
		for (Person person : arrayPerson) {			
			if (person.getLast_name().equals(value)) {
				person_found.add(person);
			}
		}
		
		return person_found;
	}
}
