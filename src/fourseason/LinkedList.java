package fourseason;

public class LinkedList implements ListADT {
	
	private SLLNode<Result> headNode;
	private SLLNode<Result> currentNode;
	private int size;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
		headNode = null;
		currentNode = headNode;
		size = 0;
	}

	@Override
	public void insert(Object e) throws Exception {
		// TODO Auto-generated method stub
		SLLNode<Result> newNode = new SLLNode<Result>((Result)e);
		if (isEmpty()) {
			headNode = newNode;
			currentNode = headNode;
		} else {
			SLLNode<Result> nextNode = currentNode.getNextNode();
			newNode.setNextNode(nextNode);
			
			currentNode.setNextNode(newNode);
			currentNode = newNode;
		}
		size++;
	}

	@Override
	public Object retrieve() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("No Data Found.");
		}
		return currentNode.getData();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (headNode == null || size <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("No Data.");
		} 
		if (headNode.getNextNode() == null) {
			headNode = null;
			currentNode = headNode;
		} else {
			SLLNode<Result> runningNode = headNode;
			while(runningNode.getNextNode() != currentNode) {
				runningNode = runningNode.getNextNode();
			}
			runningNode.setNextNode(currentNode.getNextNode());
			currentNode = runningNode;
		}
		size--;
	}

	@Override
	public void update(Object e) throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("No Data.");
		}
		currentNode.setData((Result)e);
	}

	@Override
	public void findFirst() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("No Data.");
		}
		currentNode = headNode;
	}

	@Override
	public void findNext() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("No Data.");
		}
		if (currentNode.getNextNode() == null) {
			throw new Exception("No More Data.");
		}
		currentNode = currentNode.getNextNode();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object findKey(String key) throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new Exception("List is empty.");
		}
		Object result = null;
		SLLNode<Result> runningNode = headNode;
		while(runningNode != null) {
			if(runningNode.getData().getChoice().equalsIgnoreCase(key)) {
				result = runningNode.getData();
				break;
			}
			runningNode = runningNode.getNextNode();
		}
		return result;
	}

}
