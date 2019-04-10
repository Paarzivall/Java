package Kolos3_A;

public class Pracownicy implements Wynagrodzenia{
	protected String ImieNazwisko;
	protected int Pensja;
	
	public Pracownicy(String ImieNazwisko, int Pensja) {
		this.ImieNazwisko = ImieNazwisko;
		this.Pensja = Pensja;
	}
	
	@Override
	public double getPensja() {
		return this.Pensja;
	}

}
