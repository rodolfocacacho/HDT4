public abstract class List<E> implements IList<E> {

	protected int count; // list size
	
	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

	@Override
	public void clear() {
	}

	@Override
	public void add(E value) {
	}

	@Override
	public E remove() {
		return null;
	}

	
	
}