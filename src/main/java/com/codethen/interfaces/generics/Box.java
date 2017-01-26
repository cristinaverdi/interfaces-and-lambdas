package com.codethen.interfaces.generics;

/** T is a type parameter */
public class Box<T> {

	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		if (item != null) {
			return "Box with " + item;
		} else {
			return "Box is empty";
		}
	}
}
