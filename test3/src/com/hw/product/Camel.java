package com.hw.product;

import com.hw.craft.CraftTactics;
import com.hw.craft.XxjzCraft;

/**
 * 
 * @author pengjun
 *品牌：Camel
 */
public class Camel implements Shoes {

	@Override
	public String shoesSize() {
		// TODO Auto-generated method stub
		System.out.println("CamelЬ shoesSize：41");
		return "CamelЬ shoesSize：41";
	}

	@Override
	public String shoesColor() {
		// TODO Auto-generated method stub
		System.out.println("Camel color：black");
		return "Camel color：black";
	}

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		CraftTactics gy = new CraftTactics(new XxjzCraft());
		return gy.chooesShoesCraft();
	}

	@Override
	public String toString() {
		return "Camel [shoesSize()=" + shoesSize() + ", \tshoesColor()=" + shoesColor() + ", \tshoesCraft()=" + shoesCraft()
				+ "]\n";
	}

}
