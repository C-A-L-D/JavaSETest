package com.hw.craft;

/**
 * 
 * @author pengjun
 *策略模式：使用某种制作工艺生产鞋子
 */
public class CraftTactics {

	private ShoesCraftInterface shoesCraftInterface;

	public CraftTactics(ShoesCraftInterface shoesCraftInterface) {
		super();
		this.shoesCraftInterface = shoesCraftInterface;
	}
	
	//选用一种工艺
	public String chooesShoesCraft() {
		return this.shoesCraftInterface.shoesCraft();
	}
	
}
