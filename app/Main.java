package app;

import app.sort.*;

public class Main {
	public static void main(String[] args) {
		try {
			switch ( Integer.parseInt(args[0]) ) {
				case 0:
					SortEntry.getInstance(new ShakerSort(args[1])).start(args[2], args[3]);
					break;

				case 1:
					SortEntry.getInstance(new BubbleSort(args[1])).start(args[2], args[3]);
					break;

				case 2:
					SortEntry.getInstance(new QuickSort(args[1])).start(args[2], args[3]);
					break;

				case 3:
					SortEntry.getInstance(new InsertionSort(args[1])).start(args[2], args[3]);
					break;

				default:
			}
		} catch (NotNumberException e) {
			System.out.println("数値ではありません。");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("入力が不十分です。");
		}
	}
}
