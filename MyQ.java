import java.util.ArrayDeque;

/**
 * @author Cam
 *
 */
public class MyQ<E> implements DataStructure<E> {
	
	private ArrayDeque<E> q;
	
	/**
	 * 
	 */
	public MyQ() {
		// TODO Auto-generated constructor stub
		q = new ArrayDeque<E>();
	}

	/* (non-Javadoc)
	 * @see DataStructure#add(java.lang.Object)
	 */
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		q.add(item);
	}

	/* (non-Javadoc)
	 * @see DataStructure#remove()
	 */
	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return q.poll();
	}

	/* (non-Javadoc)
	 * @see DataStructure#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return q.isEmpty();
	}

}
