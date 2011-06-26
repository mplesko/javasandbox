package datastructures;

public class MyComparable implements Comparable<MyComparable> {

	String value;
	
	public MyComparable(String value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(MyComparable in) {
		return this.value.compareTo(in.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyComparable) {
			// cool
		} else {
			return false;
		}
		MyComparable that = (MyComparable)obj;
		return this.value.equals(that.value);
	}
}
