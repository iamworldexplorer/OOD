package com.iwanttofaang.parkinglot;

public class PriceList {
	
	private static PriceList priceList;
	private double hourPrice;
	private double nextHourPrice;
	private double dayPrice;
	
	private PriceList(double hourPrice, double nextOurPrice, double dayPrice) {
		this.hourPrice = hourPrice;
		this.nextHourPrice = nextHourPrice;
		this.dayPrice = dayPrice;
	}
	
	public static PriceList getPriceList(double hourPrice, double nextOurPrice,
			double eightHourPrice) {
		if(priceList == null) {
			priceList = new PriceList(hourPrice, nextOurPrice, eightHourPrice);
		}
		return priceList;
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
	
	public void updatePriceList(double hourPrice, double nextOurPrice, double dayPrice) {
		this.hourPrice = hourPrice;
		this.nextHourPrice = nextHourPrice;
		this.dayPrice = dayPrice;
	}
	
	public String print() {
		return this.toString();
	}
}