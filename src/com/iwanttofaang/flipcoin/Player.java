package com.iwanttofaang.flipcoin;

public class Player {

	private String name;
	private CoinValue coinOption;
	
	
	public Player() {}
	
	public Player(String name) {
		this.name = name;
	}
	
	public CoinValue getRandomCoinOption() {
		int optionValue = Math.random() < 0.5 ? 0 : 1;
		this.coinOption = CoinValue.NAME_VALUE.get(optionValue);
		System.out.println("The player " + this.name + " chose the option " + this.coinOption);
		return this.coinOption;
	}
	
	public boolean isPlayerAWinner(CoinValue winningOption) {
		if(winningOption != null && winningOption.equals(this.coinOption)) {
			return true;
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CoinValue getCoinOption() {
		return coinOption;
	}
	
	public void setCoinOption(CoinValue opponentCoinOption) {
		this.coinOption = opponentCoinOption.equals(CoinValue.Head) ? CoinValue.Tail
				: CoinValue.Head;
		
		System.out.println("The Option " + this.coinOption + " has been assigned to the Player " + this.name);
	}
}