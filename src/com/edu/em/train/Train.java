package com.edu.em.train;

import java.util.Objects;

public class Train {

	private String station;
	private int number;
	private Time time = new Time();
	
	public Train() {
	}
	
	public Train(String station, int number, Time time) {
		this.station = station;
		this.number = number;
		this.time = time;
	}
	
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, station, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number && Objects.equals(station, other.station) && Objects.equals(time, other.time);
	}
	
}
