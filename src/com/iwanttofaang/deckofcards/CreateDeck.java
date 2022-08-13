package com.iwanttofaang.deckofcards;

public class CreateDeck {

	public static void main(String[] args) {
		Deck deck = new Deck();
		for(Card card: deck.getDeck()) {
			System.out.println(card.getCardFace() + " " + card.getSuit());
		}
	}
}