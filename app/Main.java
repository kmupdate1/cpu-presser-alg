package app;

import app.sort.ShakerSort;

public class Main {
	public static void main(String[] args) {
		try {
			ShakerSortEntry.getInstance(new ShakerSort()).start(args[0], args[1]);
		} catch (NotIntException e) {
			System.out.println("数値ではありません。");
		}
	}
}
