package app;

import app.sort.Sort;

import java.util.Random;

class SortEntry {

	// Initialize singleton instance.
	private static SortEntry entry = new SortEntry();
	private SortEntry() {}

	// Get singleton instance.
	static SortEntry getInstance(Sort sort) {
		entry.sort = sort;
		return entry;
	}
	
	// Instance properties.
	private Sort sort;

	void start(String rangeInput, String sizeInput) throws NumberFormatException {

		Integer range = Integer.parseInt(rangeInput);
		Integer size  = Integer.parseInt(sizeInput);

		Integer[] result = createResource(range, size);

		for (int i = 0; i < result.length; i++) {
			if ( i == result.length - 1 ) {
				System.out.println(result[i]);				
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}

	private Integer[] createResource(Integer range, Integer size) {
		Random rd = new Random();
		Integer[] source = new Integer[size];

		for (int i = 0; i < size ; i++) {
			source[i] = rd.nextInt(range);
		}

		return sort.start(source);
	}
}
