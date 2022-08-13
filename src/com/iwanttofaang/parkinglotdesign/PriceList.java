package com.iwanttofaang.parkinglotdesign;

public class PriceList {

	private double hourPrice;
	private double nextHourPrice;
	private double dayPrice;
	
	public PriceList(double hourPrice, double nextHourPrice, double dayPrice) {
		this.hourPrice = hourPrice;
		this.nextHourPrice = nextHourPrice;
		this.dayPrice = dayPrice;
	}

	public double getHourPrice() {
		return hourPrice;
	}

	public void setHourPrice(double hourPrice) {
		this.hourPrice = hourPrice;
	}

	public double getNextHourPrice() {
		return nextHourPrice;
	}

	public void setNextHourPrice(double nextHourPrice) {
		this.nextHourPrice = nextHourPrice;
	}

	public double getDayPrice() {
		return dayPrice;
	}

	public void setDayPrice(double dayPrice) {
		this.dayPrice = dayPrice;
	}	
}
