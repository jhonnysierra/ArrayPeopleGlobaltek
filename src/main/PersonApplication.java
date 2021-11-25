package main;

import java.util.ArrayList;

import model.Person;
import model.SearchCriteriaPerson;
import utilities.PersonUtilities;

/**
 * @author JHONNY Este clase permite ejecutar la aplicacion
 */
public class PersonApplication {
	private static PersonUtilities person_utilities;
	private static SearchCriteriaPerson search_criteria_person;
	private static ArrayList<Person> result_find;

	public static void main(String[] args) {
		// Array inicial sobre el cual se realiza la busqueda de valor
		Person arrayInitial[] = { new Person("1", "jhonny", "sierra"), new Person("2", "mirian", "parra"),
				new Person("3", "carlos", "sierra") };
		/*
		 * Person arrayInitial[] = { new Person("1", "John", "Doe"), new Person("2",
		 * "Jane", null), new Person("3", "Jose", "Doe") };
		 */

		// Se instancia la clase
		person_utilities = new PersonUtilities();
		search_criteria_person = new SearchCriteriaPerson("last_name", "sierra");

		result_find = person_utilities.findMatch(arrayInitial, search_criteria_person);

		if (!result_find.isEmpty()) {
			System.out.println(result_find);
		} else {
			System.out.println("Parece que no se encontraron datos :(");
		}
	}
}
