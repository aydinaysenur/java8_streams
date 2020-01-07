package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMap 
{
	public static void main(String[] args) 
	{
		FilterAndMap filterAndMap = new FilterAndMap();

		//alistirma 3
		filterAndMap.getPersonByName();
    }

	/**
	 * 
	 * 1. Person listesinin name'i "E" ile baslayanlarin isimlerinden bir liste olusturup yazdiriniz.
	 * 2. Person listesinin name'i "E" ile baslayanlarin id'lerinin toplamini yazdiriniz.
	 * 3. Person listesinin name'i "E" ile baslayanlari id'lerine gore siralayin.
	 * 
	 * @return
	 */
    private void getPersonByName() 
    {
        Stream<Person> persons = Stream.of(
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
        
//        List<String> names = persons
//        	 .peek(System.out::println)
//             .filter(person -> person.getName().startsWith("E"))
//             .peek(System.out::println)
//             .map(person -> person.getName())
//             .peek(System.out::println)
//             .collect(Collectors.toList());
        
        persons.sorted((p1, p2) -> p1.getId() - p2.getId()).forEach(System.out::println);
        
        
        
        


    }

}
