package datastructures;

public class MyList {

	private int numberOfElements;
	private int nextIndex;
	private Comparable[] elements;
	private MyListUtils listUtils;

	public MyList(int listSize, MyListUtils myListUtils) {
		elements = new Comparable[listSize];
		this.listUtils = myListUtils;
		numberOfElements = 0;
		nextIndex = 0;
	}

	public int getSize() {
		return elements.length;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	/**
	 * @param element
	 * @return 0 if successful, -1 if unable to add elements because 
	 * list is full or list already contains element
	 */
	public int add(Comparable element) {
		if (isFull() || (notEmpty() && contains(element))) {
			return -1;
		}
		listUtils.add(element, elements, numberOfElements);
		numberOfElements++;
		return 0;
	}

	private boolean isEmpty() {
		return numberOfElements == 0;
	}
	private boolean notEmpty() {
		return ! isEmpty();
	}
	public boolean isFull() {
		return numberOfElements == getSize();
	}

	public boolean contains(Comparable element) {
		if (locate(element) == -1) {
			return false;
		} else {
			return true;
		}
	}
	private int locate(Comparable element) {
		return listUtils.locate(element, elements, numberOfElements);
	}
	
	public int remove(Comparable element) {
		int position = locate(element);
		if (position == -1) {
			return -1;
		}		
		bumpUp(position);
		elements[getNumberOfElements() - 1] = null;
		numberOfElements--;
		return 0;
	}

	private void bumpUp(int startPosition) {
		int index = startPosition;
		while(index < getNumberOfElements() - 1) {
			elements[index] = elements[index + 1];
			index++;
		}
	}
	
	public Comparable getNext() {
		if (isEmpty()) { return null;}
		
		int tempIndex = nextIndex;
		if (nextIndex == numberOfElements - 1) {
			nextIndex = 0;
		} else {
			nextIndex++;
		}
		return elements[tempIndex];		
	}
	
	public void reset() {
		nextIndex = 0;
	}
}

interface MyListUtils {
	int locate(Comparable element, Comparable[] elements, int numberOfElements);
	void add(Comparable element, Comparable[] elements, int numberOfElements);
}

class MyUnsortedListUtils implements MyListUtils {
	
	@Override
	public int locate(Comparable element, Comparable[] elements, int numberOfElements) {
		for (int i = 0; i < numberOfElements; i++) {
			if (elements[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void add(Comparable element, Comparable[] elements, int numberOfElements) {
		elements[numberOfElements] = element;
	}
}

class MySortedListUtils implements MyListUtils {
	
	@Override
	public int locate(Comparable element, Comparable[] elements, int numberOfElements) {
		if (numberOfElements == 0) {return -1;}
		if (numberOfElements == 1) {
			return elements[0].equals(element)? 0 : -1;
		}
		// binary search
		int start = 0;
		int end = numberOfElements - 1;
		
		while (end - start >= 0) {
			int mid = start + ((end - start) / 2);
			int compare = element.compareTo(elements[mid]);
			if (compare == 0) {
				return mid;
			} else if (compare < 0) {
				end = mid -1;
			} else {
				start = mid + 1;
			}		
		}
		return -1;
	}

	public int getAddPosition(Comparable element, Comparable[] elements, int numberOfElements) {
		for (int i = 0; i < numberOfElements; i++) {
			if (element.compareTo(elements[i]) < 0) {
				return i;
			}
		}
		return numberOfElements;
	}
	
	private void bumpDown(int startPosition, Comparable[] elements, int numberOfElements) {
		int index = numberOfElements - 1;
		while(index >= startPosition) {
			elements[index + 1] = elements[index];
			index--;
		}
	}

	@Override
	public void add(Comparable element, Comparable[] elements, int numberOfElements) {
		int index = getAddPosition(element, elements, numberOfElements);
		bumpDown(index, elements, numberOfElements);
		elements[index] = element;		
	}
	

}