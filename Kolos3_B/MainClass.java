package Kolos3_B;

import java.util.Arrays;
import java.util.Comparator;

public class MainClass {

	public static void main(String[] args) {
		Student[] st = new Student[4];
		
		st[0] = new Student("Jan", "Nowak", 4);
		st[1] = new Student("Halina", "Kowalska", 2);
		st[2] = new Student("Kazik", "Pieroñski", 1);
		st[3] = new Student("Hermenegilda", "Kot", 3);
	
		System.out.println("\nPrzed posortowaniem\n");
		for(Student s: st) {
			System.out.println(s.getImie() + " " + s.getNazwisko() + " Nr Grupy: " + s.getNrGrupy());
		}
		System.out.println("\nPo posortowaniu wg nr\n");
		Arrays.sort(st);
		
		for(Student s: st) {
			System.out.println(s.getImie() + " " + s.getNazwisko() + " Nr Grupy: " + s.getNrGrupy());
		}
		
		System.out.println("\nPo posortowaniu wg nazwiska\n");

		Arrays.sort(st, new Comparator<Student>() {

			@Override
			public int compare(Student st1, Student st2) {
				return st1.getNazwisko().compareTo(st2.getNazwisko());
			}
		});
		for(Student s: st) {
			System.out.println(s.getImie() + " " + s.getNazwisko() + " Nr Grupy: " + s.getNrGrupy());
		}
	}
}
