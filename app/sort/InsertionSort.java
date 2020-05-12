package app.sort;

/**
* Strategy area has not already modified.
*/
public class InsertionSort implements Sort {
	private static final int UP = 0;
	private static final int DOWN = 1;

	private Integer upORdown;

	public InsertionSort(String upORdown) throws NumberFormatException {
		this.upORdown = Integer.parseInt(upORdown);
	}

	@Override
	public Integer[] start(Integer[] source) {
		Integer[] tmp = null;

		switch ( this.upORdown ) {
			case UP:
				tmp = null; //upSort(source);
				break;

			case DOWN:
				tmp = null; //downSort(source);
				break;
		}
		return tmp;
	}

	@Override
	public Integer[] upSort(Integer[] source) {
		for (int i = 0; i < source.length / 2; i++) {
			boolean swapped = false;
			for (int j = i; j < source.length - i - 1; j++) {
				if (source[j] > source[j + 1]) {
					int tmp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = tmp;
					swapped = true;
				}
			}
			for (int j = source.length - 2 - i; j > i; j--) {
				if (source[j] < source[j - 1]) {
					int tmp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = tmp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		return source;
	}

	@Override
	public Integer[] downSort(Integer[] source) {
		for (int i = 0; i < source.length / 2; i++) {
			boolean swapped = false;
			for (int j = i; j < source.length - i - 1; j++) {
				if (source[j] < source[j + 1]) {
					int tmp = source[j];
					source[j] = source[j + 1];
					source[j + 1] = tmp;
					swapped = true;
				}
			}
			for (int j = source.length - 2 - i; j > i; j--) {
				if (source[j] > source[j - 1]) {
					int tmp = source[j];
					source[j] = source[j - 1];
					source[j - 1] = tmp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		return source;
	}

}
