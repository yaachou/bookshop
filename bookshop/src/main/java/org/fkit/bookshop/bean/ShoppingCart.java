package org.fkit.bookshop.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	
	private ArrayList<CartItem> cart;

	public ShoppingCart() {
		cart = new ArrayList<CartItem>();
	}

	public ArrayList<CartItem> getCart() {
		return cart;
	}

	public void addCartItem(CartItem item) {
		CartItem oldItem = null;
		if (item != null) {
			for (int i = 0; i < cart.size(); i++) {
				oldItem = cart.get(i);
				if (oldItem.getId()==(item.getId())) {
					oldItem.setQuantity(oldItem.getQuantity() + item.getQuantity());
				}
			}
			cart.add(item);
		}
	}

	public boolean removeCartItem(int id) {
		CartItem item = null;
		for (int i = 0; i < cart.size(); i++) {
			item = cart.get(i);
			if (item.getId()==id) {
				cart.remove(i);
				return true;
			}
		}
		return false;
	}

	public float getTotal() {
		Iterator<CartItem> it = cart.iterator();
		float sum = 0;
		CartItem item = null;
		while (it.hasNext()) {
			item = it.next();
			sum = sum + item.getSum();
		}
		return sum;
	}
}