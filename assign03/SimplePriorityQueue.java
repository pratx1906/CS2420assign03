package assign03;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.NoSuchElementException;

public class SimplePriorityQueue<E> implements PriorityQueue {
	
	private Array [] data;
	
	public SimplePriorityQueue()
	{
		this.data = null;
	}
	
	public SimplePriorityQueue( Comparator<? super E>)
	{
		E[] array = (E[]) new Object[16];
		
	}

	@Override
	public Object findMin() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteMin() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAll(Collection coll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
