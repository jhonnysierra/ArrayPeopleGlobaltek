package main;

import java.util.ArrayList;

import model.Person;
import utilities.PersonUtilities;

/**
 * @author JHONNY 
 * Este clase permite ejecutar la aplicacion
 */
public class PersonApplication {
	private static PersonUtilities person_utilities = new PersonUtilities();
	private static String value_find;
	private static ArrayList<Person> result_find;
	
	
	public static void main(String[] args) {
		//Array inicial sobre el cual se realiza la busqueda de valor
		Person arrayInitial[] = { new Person("1", "jhonny", "sierra"),
				new Person("2", "mirian", "parra"), new Person("3", "carlos", "sierra")};
		//Valor a buscar en array
		value_find = "sierra";
		
		//person_utilities.findMatch(arrayInitial, value_find);
		result_find = person_utilities.findMatch(arrayInitial, value_find);
		System.out.println(result_find);
	}

}
