public class Entry implements Comparable<Entry> {
	Entry() {
		v = 0;
		count = 0;
	}
	Entry(Integer v_i, Integer count_i) {
		v = v_i;
		count = count_i;
	}
	public Integer v;
	public Integer count;
	// Overriding the compareTo method
	public int compareTo(Entry e) {
		return e.count - this.count;
	}
}
