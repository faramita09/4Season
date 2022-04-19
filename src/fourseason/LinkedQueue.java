package fourseason;

public class LinkedQueue implements QueueADT {

	private SLLNode<Course> headNode;
	private SLLNode<Course> currentNode;
	private int size;
	
	public LinkedQueue() {
		headNode = null;
		currentNode = null;
		size = 0;
	}
	
	@Override
	public void enqueue(Object e) throws Exception {
		// TODO Auto-generated method stub
		SLLNode<Course> NewNode = new SLLNode<Course>((Course)e);
		if (isEmpty()) {
			headNode = NewNode;
		} else {
			currentNode = headNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(NewNode);
		}
		size++;
	}

	@Override
	public Object dequeue() throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new Exception("Queue is empty.");
		}
		Object result = headNode.getData();
		headNode = headNode.getNextNode();
		size--;
		return result;
	}

	@Override
	public Object front() throws Exception {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new Exception("Queue is empty.");
		}
		return headNode.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0 || headNode == null) ? true : false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.headNode = null;
		size = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
