import java.util.Stack;

/**
 * @author Cam
 *
 */
public class MyStack<E> implements DataStructure<E> {

	private Stack<E> s;	
	
	/**
	 * 
	 */
	public MyStack() {
		// TODO Auto-generated constructor stub
		s = new Stack<E>();
	}

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		s.push(item);
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return s.pop();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return s.empty();
	}

}
