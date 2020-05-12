package app.sort;

public class ShakerSort implements Sort {

	@Override
	public Integer[] start(Integer[] source) {
		/*
		int size_1 = source.length - 1;

		for (int i = 0; i < source.length / 2; i++) {
			for (j = j; j < k; j++) {
				if ( source[j] > source[j + 1]) {
					int tmp;
					tmp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = source[j];
				}
			}
			for (k = k; k < j - 1; k--) {
				if ( source[k + 1] < source[k] ) {
					int tmp;
					tmp = source[k + 1];
					source[k + 1] = source[k];
					source[k] = tmp;
				}
			}
		}
		*/

		for (int i = 0; i < source.length / 2; i++) {
			boolean swapped = false;
			for (int j = i; j < source.length - i - 1; j++) {
				if (source[j] < source[j+1]) {
					int tmp = source[j];
					source[j] = source[j+1];
					source[j+1] = tmp;
					swapped = true;
				}
			}
			for (int j = source.length - 2 - i; j > i; j--) {
				if (source[j] > source[j-1]) {
					int tmp = source[j];
					source[j] = source[j-1];
					source[j-1] = tmp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		return source;
	}
}
