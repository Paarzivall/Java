package Kolos3_A;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Pracownicy> pracownik = new ArrayList<>();
		
		pracownik.add(new Pracownicy("Jan Kowalski", 2000));
		pracownik.add(new Pracownicy("Halina Nowak", 3000));
		pracownik.add(new Pracownicy("Jan KK", 4000));
		
		ListaPlac ob1 = new ListaPlac(pracownik);
		System.out.println("Suma wynagrodzeñ: " + ob1.SumaPlac());
	}

}
