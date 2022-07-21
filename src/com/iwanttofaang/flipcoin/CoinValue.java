package com.iwanttofaang.flipcoin;

import java.util.HashMap;
import java.util.Map;

public enum CoinValue {
	Head(0),
	Tail(1);
	
	private int value;
	
	public static Map<Integer, CoinValue> NAME_VALUE = new HashMap<>();
	
	static {
		for(CoinValue coinValue: values()) {
			NAME_VALUE.put(coinValue.value, coinValue);
		}
	}
	
	private CoinValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}