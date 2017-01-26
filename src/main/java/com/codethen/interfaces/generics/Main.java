package com.codethen.interfaces.generics;

public class Main {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		System.out.println(box);

		box.setItem("Hello");
		System.out.println(box);

		Box<Integer> box2 = new Box<>();
		System.out.println(box2);

		box2.setItem(5);
		System.out.println(box2);
	}
}
