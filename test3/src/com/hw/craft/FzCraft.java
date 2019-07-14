package com.hw.craft;

/**
 * 
 * @author pengjun
 *缝制工艺
 */
public class FzCraft implements ShoesCraftInterface {

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		System.out.println("采用缝制工艺！");
		return "fengzhi";
	}

}
