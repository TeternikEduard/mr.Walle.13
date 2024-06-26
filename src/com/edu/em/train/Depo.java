package com.edu.em.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Depo {

	private List<Train> train = new ArrayList<Train>();

	public Depo() {
	}

	public Depo(List<Train> train) {
		this.train = train;
	}

	public void add(Train t) {
		train.add(t);
	}


	public void printNumber(int x) {
		System.out.println("_____________________________________________________________________");
		System.out.println("\t\tПоиск нужного поезда с номером [" + x + "]:");
		boolean is = false;

		for (int i = 0; i < train.size(); i++) {

			if (train.get(i).getNumber() == x) {
				is = true;
				printI(i);
			}
		}
		if (!is) {
			System.out.println("Поезда с таким номером в списке нет!");
		}
	}

	public void sortNumber() {
		System.out.println("_____________________________________________________________________");
		System.out.println("\t\tОтсортированный список по номерам поездов:");

		for (int i = 0; i < train.size() - 1; i++) {
			for (int j = 0; j < train.size() - i - 1; j++) {

				if (train.get(j + 1).getNumber() < train.get(j).getNumber()) {
					Train buff = train.get(j);
					train.set(j, train.get(j + 1));
					train.set(j + 1, buff);
				}
			}
		}
	}

	public void sortStation() {

		System.out.println("_____________________________________________________________________");
		System.out.println("\t\tОтсортированный список по станциям:");
		sortTime();
		Comparator<Train> station = Comparator.comparing(Train::getStation);
		Collections.sort(train, station);
	}

	public void sortTime() {

		for (int i = 0; i < train.size() - 1; i++) {
			for (int j = 0; j < train.size() - i - 1; j++) {

				if (train.get(j + 1).getTime().getHour() < train.get(j).getTime().getHour()) {
					Train buff = train.get(j);
					train.set(j, train.get(j + 1));
					train.set(j + 1, buff);
				} else if (train.get(j + 1).getTime().getHour() == train.get(j).getTime().getHour()) {
					if (train.get(j + 1).getTime().getMinute() < train.get(j).getTime().getMinute()) {
						Train buff = train.get(j);
						train.set(j, train.get(j + 1));
						train.set(j + 1, buff);
					} else if (train.get(j + 1).getTime().getMinute() == train.get(j).getTime().getMinute()) {
						if (train.get(j + 1).getTime().getSecond() < train.get(j).getTime().getSecond()) {
							Train buff = train.get(j);
							train.set(j, train.get(j + 1));
							train.set(j + 1, buff);
						}
					}
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < train.size(); i++) {
			printI(i);
		}
	}

	public void printI(int i) {

		System.out.print("Станция: " + train.get(i).getStation());
		if (train.get(i).getNumber() < 10) {
			System.out.print("; номер поезда: 0" + train.get(i).getNumber());
		} else {
			System.out.print("; номер поезда: " + train.get(i).getNumber());
		}
		if (train.get(i).getTime().getHour() < 10) {
			System.out.print("; время отправления: 0" + train.get(i).getTime().getHour());
		} else {
			System.out.print("; время отправления: " + train.get(i).getTime().getHour());
		}
		if (train.get(i).getTime().getMinute() < 10) {
			System.out.print(":0" + train.get(i).getTime().getMinute());
		} else {
			System.out.print(":" + train.get(i).getTime().getMinute());
		}
		if (train.get(i).getTime().getSecond() < 10) {
			System.out.print(":0" + train.get(i).getTime().getSecond());
		} else {
			System.out.print(":" + train.get(i).getTime().getSecond());
		}
		System.out.println(".");
	}
}