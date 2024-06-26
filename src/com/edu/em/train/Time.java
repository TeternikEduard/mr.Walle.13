package com.edu.em.train;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

}