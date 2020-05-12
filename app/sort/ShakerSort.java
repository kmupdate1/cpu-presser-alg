package app.sort;

public class ShakerSort implements Sort {

	@Override
	public Integer[] start(Integer[] source) {
		int size_1 = source.lenght - 1;

		for (int i = 0; i < source.lenght; i++) {
			int j = i;
			int k = size_1 - i;
			for (j; j < k; j++) {
				if ( source[j] > source[j + 1]) {
					int tmp;
					tmp = resutl[j];
					resutl[j] = resutl[j + 1];
					resutl[j + 1] = resutl[j];
				}
			}
			for (k; k < j; k--) {
				if ( source[k + 1] < source[k] ) {
					int tmp;
					tmp = source[k + 1];
					source[k + 1] = source[k]
					source[k] = tmp;
				}
			}
		}

		return source;
	}
}
