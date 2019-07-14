package com.hw.product;

import com.hw.craft.CraftTactics;
import com.hw.craft.MyCraft;

/**
 * 
 * @author pengjun
 *品牌：Adidas
 */
public class Adidas implements Shoes {

	@Override
	public String shoesSize() {
		// TODO Auto-generated method stub
		System.out.println("Adidas shoeSize：42");
		return "Adidas shoeSize：42";
	}

	@Override
	public String shoesColor() {
		// TODO Auto-generated method stub
		System.out.println("Adidas shoesSize：red");
		return "Adidas shoesSize：red";
	}

	@Override
	public String shoesCraft() {
		// TODO Auto-generated method stub
		CraftTactics gy = new CraftTactics(new MyCraft());
		return gy.chooesShoesCraft();
	}

	@Override
	public String toString() {
		return "Adidas [shoesSize()=" + shoesSize() + ", \tshoesColor()=" + shoesColor() + ", \tshoesCraft()="
				+ shoesCraft() + "]\n";
	}
	
}
