package bai_tap.baitap2;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
    }
    private Node head;
    private int numNodes=0;

    public MyLinkedList() {
    }
    public void addFrist(E element){
        Node temp= head;
        head=new Node(element);
        head.next=temp;
        numNodes++;

    }
    public void addLast(E element){
        Node temp=head;

    }
}
