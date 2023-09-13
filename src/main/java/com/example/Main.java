package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Game game = new AngGame();
		game.start(6, 10);
		ArrayList<String> logList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in, "UTF-8");
		while (!game.getGameStatus().equals(GameStatus.WIN)
				&& !game.getGameStatus().equals(GameStatus.LOSE)) {
			String userValue = scanner.nextLine();
			Answer answer = game.inputValue(userValue);
			String BullAndCows = ("answer = " + answer);
			System.out.println(BullAndCows);
			logList.add(userValue);
			logList.add(BullAndCows);
			game.inputValue(userValue);
		}
		scanner.close();
		System.out.println(game.getGameStatus());
		System.out.println(logList);

	}
}
