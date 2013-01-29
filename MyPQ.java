import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Cam
 *
 */
public class MyPQ<E> implements DataStructure<E> {

	private PriorityQueue<E> pq;
	
	/**
	 * takes in a Comparator
	 */
	public MyPQ(Comparator<? super E> comparator) {
		// TODO Auto-generated constructor stub
		pq = new PriorityQueue<E>(10, comparator);
	}

	/* (non-Javadoc)
	 * @see DataStructure#add(java.lang.Object)
	 */
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		pq.add(item);
	}

	/* (non-Javadoc)
	 * @see DataStructure#remove()
	 */
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return pq.poll();
	}

	/* (non-Javadoc)
	 * @see DataStructure#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pq.isEmpty();
	}

}
