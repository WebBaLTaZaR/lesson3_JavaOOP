package com.example;

import java.util.ArrayList;
import java.util.List;

public class RUGame extends AbstractGame {

	@Override
	protected List<String> generateCharList() {
		List<String> list = new ArrayList<String>();
		for (int i = 'а'; i <= 'я'; i++) {
			list.add(String.valueOf((char)i));
		}	list.add("ё");
		return list;
	}
// TODO я не понимаю почему, кодировка русских букв пляшет и вообще не понятно, как она кодируется
}
