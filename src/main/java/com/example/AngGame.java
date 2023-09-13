package com.example;

import java.util.ArrayList;
import java.util.List;

public class AngGame extends AbstractGame {

	@Override
	protected List<String> generateCharList() {
		List<String> list = new ArrayList<String>();
		for (int i = 'a'; i <= 'z'; i++) {
			list.add(String.valueOf((char) i));
		}
		return list;
	}

}
