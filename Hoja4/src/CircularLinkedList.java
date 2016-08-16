
import java.util.Iterator;

public class CircularLinkedList<E> extends List<E> {

	private Node<E> tail;
	
	/**
	 * Crea lista circularmente enlazada vacía
	 */
	public CircularLinkedList() {
		tail = null;
		count = 0;
	}

	/* (non-Javadoc)
	 * @see IList#addFirst(java.lang.Object)
	 */
	@Override
	public void addFirst(E value) {
		Node<E> temp = new Node<E>(value);
		if (tail == null) {
			tail = temp;
			tail.setNext(tail);
		} else {
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}

	/* (non-Javadoc)
	 * @see IList#getFirst()
	 */
	@Override
	public E getFirst() {
		return tail.next().value();
	}

	/* (non-Javadoc)
	 * @see IList#removeFirst()
	 */
	@Override
	public E removeFirst() {
		if (!isEmpty()) {
			Node<E> temp = tail.next();
			if (tail == tail.next()) {
				tail = null;
			} else {
				tail.setNext(temp.next());
				temp.setNext(null);
			}
			count--;
			return temp.value();
		}
		return null;
	}
}
