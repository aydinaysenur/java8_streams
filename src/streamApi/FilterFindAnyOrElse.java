package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterFindAnyOrElse 
{
	public static void main(String[] args) 
	{

		//alistirma 2
        Person result = getPersonByName();
        System.out.println(result);

    }

	/**
	 * Person listesi olusturup name'i "Aysenur" olan var mý diye bakan metoddur.
	 * 
	 * 1. stream olusturunuz
	 * 2. filter metodunu kullanarak name'i "Aysenur" olan var mi diye bakiniz.
	 * 3. orElse metoduyla yoksa null donecek sekilde duzenleyiniz.
	 * @return
	 */
    private static Person getPersonByName() 
    {
        Stream<Person> persons = Stream.of(
                new Person("Aysenur", 1),
                new Person("Emre", 2),
                new Person("Volkan", 3),
                new Person("Nazli", 4)
        );

        return persons.filter(person -> "Aysenur".equals(person.getName())).findAny().orElse(null);
    }

}
