package com.hw.craft;

/**
 * 
 * @author pengjun
 *注塑工艺
 */
public class ZsCraft implements ShoesCraftInterface {

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		System.out.println("采用注塑工艺！");
		return "zhusu";
	}

}
