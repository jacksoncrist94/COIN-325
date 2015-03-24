package lab12;

public class SLinkedList implements List{

	Node head, tail;
	
	@Override
	public Object get(int index) {
		Node here = new Node();
		here = head;
		for(int i = 1; i < index; i++){	
			here = here.next;
		}
		return here.value;
	}

	@Override
	public void add(Object obj) {
		Node node = new Node();
			node.value = obj;
		
		if (head == null && tail == null){
			node.next = null;
			head = tail = node;
		} else {
			// We assume both head and tail are not null.
			if (head != null && tail != null){
				node.next = null;
				tail.next = node;
				tail = node;
			} else {
				System.err.println("Invalid state only one is null: head, tail");
			}
		}
		
	}

	@Override
	public int size() {
		Node here = new Node();
		here = head;
		int size = 1;
		while(here.next != null){
			size++;
			here = here.next;
		}
		return size;
	}
	
	
	class Node{
		Object value;
		Node next;
	}
}