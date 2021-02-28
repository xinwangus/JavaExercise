
import java.util.*;

public class Topk
{
	public static void main(String[] args) {
		Integer[] arr = {1, 2, 4, 5, 2, 3, 5, 5, 6, 3, 1, 1, 1, 7};
	
		// put into a Hash map
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	
		for (int i = 0; i < arr.length; i++) {
			Integer v = hm.get(arr[i]);
			if (v == null) {
				hm.put(arr[i], 1);
			} else {
				// use v++ is wrong, as v is an object
				hm.put(arr[i], v + 1);
			}
		}
		// System.out.println(hm);
	
		// Just put all entry into
		// a linked list, then sort it.
		LinkedList<Entry> ll = new LinkedList<Entry>();		
		hm.forEach((k, v) -> ll.add(new Entry(k, v)));
		
		// Java does not allow overloading < operator like in C++,
		// The Entry can be sorted by implementing the 
		// Comparable Interface.
		// https://www.javatpoint.com/difference-between-comparable-and-comparator
		Collections.sort(ll);
		for (Entry e : ll) {
			System.out.println(e.v + "->" + e.count);
		}	
	}
}
