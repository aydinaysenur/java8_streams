package optional;

import java.util.Optional;

public class OptionalTester {

	public static void main(String[] args) 
	{
		OptionalTester optionalTester = new OptionalTester();
		Integer value1 = null;
	    Integer value2 = new Integer(10);
			
	    Optional<Integer> a = Optional.ofNullable(value1);
			
	    Optional<Integer> b = Optional.of(value2);
	    System.out.println(optionalTester.topla(a,b));

	}
	
	 public Integer topla(Optional<Integer> a, Optional<Integer> b) {
			
	      System.out.println("First parameter is present: " + a.isPresent());
	      System.out.println("Second parameter is present: " + b.isPresent());
			
	      return a.orElse(new Integer(0)) + b.get();
	   }

}
