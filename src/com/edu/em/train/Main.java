package com.edu.em.train;

public class Main {

	public static void main(String[] args) {

		Depo depo = new Depo();

		depo.add(new Train("Партизанская", 03, new Time(12, 37, 05)));
		depo.add(new Train("Октябрьская ", 22, new Time(11, 05, 50)));
		depo.add(new Train("Первомайская", 17, new Time(12, 30, 00)));
		depo.add(new Train("Октябрьская ", 14, new Time(10, 35, 00)));
		depo.add(new Train("Октябрьская ", 06, new Time(19, 37, 25)));
		depo.add(new Train("Партизанская", 16, new Time(07, 33, 37)));
		depo.add(new Train("Первомайская", 11, new Time(12, 54, 30)));
		depo.add(new Train("Партизанская", 12, new Time(19, 03, 20)));

		System.out.println("\t\tСписок всех поездов:");
		depo.print();
		
		depo.printNumber(3);	
		
		depo.sortNumber();	
		depo.print();
		
		depo.sortStation();
		depo.print();

	}
}