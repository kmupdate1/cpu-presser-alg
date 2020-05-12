package app;

import app.sort.ShakerSort;

public class Main {
	public static void main(String[] args) {
		try {
			switch ( Integer.parseInt(args[0]) ) {
				case 0:
					ShakerSortEntry.getInstance(new ShakerSort()).start(args[1], args[2]);
					break;

				default:
			}
		} catch (NotIntException e) {
			System.out.println("数値ではありません。");
		}
	}
}
