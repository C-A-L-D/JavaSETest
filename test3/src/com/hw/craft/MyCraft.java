package com.hw.craft;

/**
 * 
 * @author pengjun
 *模压工艺
 */
public class MyCraft implements ShoesCraftInterface {

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		System.out.println("采用模压工艺！");
		return "moya";
	}

}
