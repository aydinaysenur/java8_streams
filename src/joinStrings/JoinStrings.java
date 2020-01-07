package joinStrings;

import java.util.Arrays;
import java.util.List;

import streamApi.Person;

public class JoinStrings {
	
	public static void main(String[] args) 
	{
		JoinStrings joinStrings = new JoinStrings();

		joinStrings.getPersonListAsString();
		
    }

	/**
	 * 1. String class'indaki join static metodunu kullanarak 
	 * 	  persons listesindeki isimleri araya "ve" yazdirarak birlestirin.
	 * 
	 * 2. StringJoiner kullanarak 
	 *    persons listesindeki isimleri araya "ve" , basina "[" ve sonuna "]" karakteri 
	 *    koyarak birlestirin.
	 * 
	 * 3. Collectors class'inin joining statik metodunu kullanarak 
	 *    persons listesindeki isimleri araya "ve" , basina "[" ve sonuna "]" karakteri 
	 *    koyarak birlestirin.
	 */
	private void getPersonListAsString() 
	{
        List<Person> persons = Arrays.asList(
                new Person("Aysenur", 1),
                new Person("Emre", 2),
                new Person("Volkan", 3),
                new Person("Nazli", 4),
                new Person("Erdal", 5),
                new Person("Binnaz", 6),
                new Person("Hayrettin", 7),
                new Person("Ece", 8),
                new Person("Caglar", 9)
        );
        
		
	}


}
