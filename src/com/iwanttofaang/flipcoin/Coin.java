package com.iwanttofaang.flipcoin;

public class Coin {
	
	private CoinValue coinOption;
	
	public CoinValue getWinningOption() {
		int optionValue = Math.random() < 0.5 ? 0 : 1;
		this.coinOption = CoinValue.NAME_VALUE.get(optionValue);
		return this.coinOption;
	}
	
	public CoinValue getCoinOption() {
		return this.coinOption;
	}
	
	public void setCoinOption(CoinValue coinOption) {
		this.coinOption = coinOption;
	}
}
