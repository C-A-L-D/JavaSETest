package com.hw.product;

import com.hw.craft.CraftTactics;
import com.hw.craft.FzCraft;

/**
 * 
 * @author pengjun
 *品牌：Xtebu
 */
public class Xtebu implements Shoes {

	@Override
	public String shoesSize() {
		// TODO Auto-generated method stub
		System.out.println("XtebuЬ shoesSize：38");
		return "XtebuЬ shoesSize：38";
	}

	@Override
	public String shoesColor() {
		// TODO Auto-generated method stub
		System.out.println("Xtebu corlor：yellow");
		return "Xtebu corlor：yellow";
	}

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		CraftTactics gy = new CraftTactics(new FzCraft());
		return gy.chooesShoesCraft();
	}

	@Override
	public String toString() {
		return "Xtebu [shoesSize()=" + shoesSize() + ", \tshoesColor()=" + shoesColor() + ", \tshoesCraft()=" + shoesCraft()
				+ "]\n";
	}

}
