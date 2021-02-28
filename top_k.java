// Java code similiar to
// https://github.com/xinwangus/CPPExcercise/blob/master/top_k/top_x_3.cc
// Given an int array, print out the top K values in terms of how
// many times they appear.

import java.util.HashMap;

public class top_k
{
	public static void main(String[] args) {
		// small differences from C++, "int[] arr",
		// not "int arr[]"
		// also can not use POT type, must use Integer class
		Integer[] arr = {1, 2, 4, 5, 2, 3, 5, 5, 6, 3, 1, 1, 1, 7};

		// put into a Hashmap
		// differ from C++, have to use new
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		// differ from C++, not use sizeof()/sizeof()
		for (int i = 0; i < arr.length; i++) {
			Integer v = hm.get(arr[i]);
			if (v == null) {
				hm.put(arr[i], 1);
			} else {
				// use v++ is wrong, as v is an object
				hm.put(arr[i], v + 1);
			}
		}
		// interesting, this prints out everything in the
		// hash map.
		System.out.println(hm);

		// Java does not allow overloading < operator like in C++,
		// and it seems we can use a "TreeSet" with a Comparator, that
		// can sort the pairs with "value".
	}
}
