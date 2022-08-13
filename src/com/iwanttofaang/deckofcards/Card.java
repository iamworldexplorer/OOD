package com.iwanttofaang.deckofcards;

public class Card {

	private int cardFace;
	private Suit suit;
	
	public Card(int cardFace, Suit suit) {
		this.cardFace = cardFace;
		this.suit = suit;
	}
	
	public int getCardFace() {
		return this.cardFace;
	}
	
	public Suit getSuit() {
		return this.suit;
	}
}
