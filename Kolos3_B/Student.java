package Kolos3_B;

public class Student implements Personalia, Administracja, Comparable<Student>{
	protected String Imie, Nazwisko;
	protected int NrGrupy;
	
	public Student(String Imie, String Nazwisko, int NrGrupy) {
		this.Imie = Imie;
		this.Nazwisko = Nazwisko;
		this.NrGrupy = NrGrupy;
	}
	
	@Override
	public int getNrGrupy() {
		return this.NrGrupy;
	}

	@Override
	public String getImie() {
		return this.Imie;
	}

	@Override
	public String getNazwisko() {
		return this.Nazwisko;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.valueOf(this.getNrGrupy()).compareTo(o.getNrGrupy());
	}

}
