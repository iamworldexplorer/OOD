package com.iwanttofaang.deckofcards;

public class DeckOfCardsSystem {

	public static void main(String[] args) {
		Deck deck = new Deck();
		for(Card card: deck.getDeck()) {
			System.out.println(card.getCardFace() + " " + card.getSuit());
		}
	}
}