package com.iwanttofaang.flipcoin;
/*
 * Design a Flip Coin Game
 * 
 * Use Case Description:
 * 
 * There are two players in the game. One player chooses one of two coin options.
 * Another player takes option that left. The coin is flipped.
 * The winner is the player who guessed the coin option.
 * 
 * Actors:
 * 
 * 1. Players 1 and Player 2
 * 2. Coin
 * 3. Coin Game
 * 
 * Triggers:
 * 
 * 1. The player for choosing the prediction is randomly selected
 * 
 * Precondition:
 * 
 * 1. Player 1 and player 2 are available
 * 2. Coin is available
 * 
 * Goals:
 * 
 * 1. One player wins, the other player loses
 * 
 * Steps of execution:
 * 
 * 1. The game selects player randomly to chose the coin option
 * 2. Selected player makes a prediction for coin option
 * 3. The other player gets remained coin option
 * 4. Coin is flipped and results are provided
 * 5. Player with correct option is a winner, the other is a loser
 * 6. The game offers to try again
 * 
 * Object Model:
 * 
 * Player:	2			 1	Coin:
 *  name	--------------	 coinOption
 *  coinOption				   1|
 *    |2						|
 *    |includes					|
 *    |1						|
 * CoinGame		1   includes	|
 *  players  --------------------
 *  coin
 *  
 *  
 */
public class CoinGame {
	
	public Player[] players;
	public Coin coin;
	
	public CoinGame() {}
	
	public CoinGame(String player1Name, String player2Name) {
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		players = new Player[]{player1, player2};
		this.coin = new Coin();
	}
	
	public void startTheGame() {
		
		int playerValue = Math.random() < 0.5 ? 0 : 1;
		CoinValue opponentOption = players[playerValue].getRandomCoinOption();
		players[players.length - 1 - playerValue].setCoinOption(opponentOption);
		
		CoinValue winningCoin = coin.getWinningOption();
		System.out.println("Winning Coin Option is: " + winningCoin);
		Player winner = null;
		for(Player player: players) {
			if(player.isPlayerAWinner(winningCoin)) {
				winner = player;
				break;
			}
		}
		System.out.println("The winner is: " + winner.getName());
	}
	
}