package com.hw.product;

import com.hw.craft.CraftTactics;
import com.hw.craft.ZsCraft;

/**
 * 
 * @author pengjun
 *品牌：Nike
 */
public class Nike implements Shoes {

	@Override
	public String shoesSize() {
		// TODO Auto-generated method stub
		System.out.println("Nike shoesSize：40");
		return "Nike shoesSize：40";
	}

	@Override
	public String shoesColor() {
		// TODO Auto-generated method stub
		System.out.println("Nike color：white");
		return "Nike color：white";
	}

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		CraftTactics gy = new CraftTactics(new ZsCraft());
		return gy.chooesShoesCraft();
	}

	@Override
	public String toString() {
		return "Nike [shoesSize()=" + shoesSize() + ", \tshoesColor()=" + shoesColor() + ", \tshoesCraft()=" + shoesCraft()
				+ "]\n";
	}

}
