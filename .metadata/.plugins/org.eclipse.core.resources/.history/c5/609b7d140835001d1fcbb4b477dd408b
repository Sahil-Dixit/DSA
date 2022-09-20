package SinglyLinkedList;

class SimpleLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		SimpleLinkedList ll = new SimpleLinkedList();
		Node node1 = new Node(5);
		ll.head = node1;
		Node node2 = new Node(10);
		Node node3 = new Node(15);
		node1.next = node2;
		node2.next = node3;
		display(ll.head);
	}

}
