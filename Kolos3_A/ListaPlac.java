package Kolos3_A;

import java.util.ArrayList;
import java.util.List;

public class ListaPlac {
	protected List<Pracownicy> pr = new ArrayList<>();
	
	public ListaPlac(List pr) {
		this.pr = pr;
	}
	
	public int SumaPlac() {
		int suma = 0;
		for(Pracownicy p: pr) {
			suma += p.getPensja();
		}
		return suma;
	}
}
