package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndCollect 
{
	 public static void main(String[] args) 
	 {
       
	        //alistirma 1: filter ve collect metodunu kullanma
	        List<String> result = getFilterOutput();
	        
	        //forEach ile yazdiriniz.
	        for (String temp : result) {
	            System.out.println(temp); 
	        }

	 }

	 /**
	  * isim Listesi olusturup "E" ile baslayanlari cikarip yeniden baska bir listeye dolduran bir metoddur.
	  * 
	  * 1. stream olusturunuz
	  * 2. filter metodunu kullanarak "E" ile baslayanlari ayiklayiniz
	  * 3. collect metodunu kullanarak sonucu bir list haline getiriniz.
	  * @return
	  */
	 public static List<String> getFilterOutput() {
		 
	        
	        Stream<String> isimListesi = Stream.of("Aysenur", "Nazli", "Volkan", "Emre", "Erdal", "Binnaz", 
				"Hayrettin", "Ece", "Caglar");
	        
	        return isimListesi.filter(isim -> !isim.startsWith("E")).collect(Collectors.toList());

	 }

}
