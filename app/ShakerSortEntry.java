package app;

import app.sort.Sort;

import java.util.Random;

class ShakerSortEntry {

	// Initialize singleton instance.
	private static ShakerSortEntry entry = new ShakerSortEntry();
	private ShakerSortEntry() {}

	// Get singleton instance.
	static ShakerSortEntry getInstance(Sort sort) {
		entry.sort = sort;
		return entry;
	}
	
	// Instance properties.
	private Sort sort;

	void start(String rangeInput, String sizeInput) throws NotIntException {

		System.out.println("Hello World.");
		Integer range = Integer.parseInt(rangeInput);
		Integer size  = Integer.parseInt(sizeInput);

		System.out.println(createResource(range, size));

	}

	private Integer[] createResource(Integer range, Integer size) {
		Random rd = new Random();
		Integer[] source = new Integer[size];

		for (int i = 0; i < size ; i++) {
			source[i] = rd.nextInt(range);
		}

		Integer[] result = sort.start(source);
	}
}
