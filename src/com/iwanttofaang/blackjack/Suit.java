package com.iwanttofaang.blackjack;

public enum Suit {
	Club(0),
	Diamond(1),
	Heart(2),
	Spade(3);
	
	private int value;
	
	private Suit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static Suit getSuitFromValue(int value) {
		for(Suit suit: values()) {
			if(suit.value == value) {
				return suit;
			}
		}
		return null;
	}
}