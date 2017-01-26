package com.codethen.interfaces.transform;

public class StringLength implements Transformer<String, Integer> {

	@Override
	public Integer transform(String x) {
		return x.length();
	}
}
