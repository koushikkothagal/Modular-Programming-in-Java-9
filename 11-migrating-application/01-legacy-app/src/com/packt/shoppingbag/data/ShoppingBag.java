package com.packt.shoppingbag.data;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public class ShoppingBag  {
	
	public static String END_TOKEN = "end";
	private Bag<String> bag = new HashBag<>();
	
	public boolean addToBag(String itemName) {
		return (END_TOKEN.equals(itemName)) || this.bag.add(itemName); 
	}
	
	public void prettyPrintBag() {
		System.out.println();
		System.out.println("Shopping Bag Contents");
		System.out.println("------------------------");
		this.bag.uniqueSet()
		.forEach(item -> {
			System.out.println(item + "   " + bag.getCount(item));
			System.out.println("------------------------");
		});
		
	}

}
