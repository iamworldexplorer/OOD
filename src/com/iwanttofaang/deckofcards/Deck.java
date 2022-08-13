package com.iwanttofaang.deckofcards;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> deck;
	public static final int ONE_SUIT_COUNT = 13;
	
	public Deck() {
		deck = new ArrayList<>();
		
		for(int i = 1; i <= ONE_SUIT_COUNT; i++) {
			for(Suit suit: Suit.values()) {
				deck.add(new Card(i, suit));
			}
		}
		
	}
	
	
	public List<Card> getDeck() {
		return this.deck;
	}
}
