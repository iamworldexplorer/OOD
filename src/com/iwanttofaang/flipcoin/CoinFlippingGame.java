package com.iwanttofaang.flipcoin;

import java.util.Scanner;

public class CoinFlippingGame {
	public static void main(String[] args) {
		CoinGame game = new CoinGame("player1", "player2");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String answer = null;
			do {
				game.startTheGame();
				System.out.println("Do you want play again? (Yes/No)");
				if(scanner.hasNext()) {
					answer = scanner.next();
				}
			} while(answer.equals("Yes"));
		}
		System.out.println("Bye Bye");
	}
}