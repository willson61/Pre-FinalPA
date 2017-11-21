package Problema3;


public class LinkedPositionalList<E> implements PositionalList<E>{
	public static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
        public E getElement() throws IllegalStateException{
            if(next == null){
                throw new IllegalStateException("Posicion no valida");
            }
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
        
    }
    private Node<E> header = null;
    private Node<E> trailer = null;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    private Node<E> validar(Position<E> p) throws IllegalArgumentException{
        if (!(p instanceof Node)){
            throw new IllegalArgumentException("P invalido");
        }
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null){
            throw new IllegalArgumentException("p ya no se encuentra en la lista");
        }
        return node;
    }
    private Position<E> posicion(Node<E> nodo){
        if (nodo == header || nodo == trailer){
            return null;
        }
        return nodo;
    }
    public int size( ){
        return size;
    }
    public boolean isEmpty( ){
        return size == 0;
    }
    public Position<E> first( ){
        return posicion(header.getNext());
    }
    public Position<E> last( ){
        return posicion(trailer.getPrev());
    }
    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ){
        Node<E> newest = new Node<>(e, pred, succ);
        succ.setPrev(newest);
        pred.setNext(newest);
	size++;
	return newest;
    }
    public Position<E> addFirst(E e){
        return addBetween(e, header, header.getNext());
    }
    public Position<E> addLast(E e){
        return addBetween(e, trailer.getPrev(), trailer);
    }
    public Position<E> before(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validar(p);
        return posicion(node.getPrev());
    }
    public Position<E> after(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validar(p);
        return posicion(node.getNext());
    }
    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
         Node<E> node = validar(p);
         return addBetween(e, node.getPrev(), node);
    }
    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException{
         Node<E> node = validar(p);
         return addBetween(e, node, node.getNext());
    }
    public E set(Position<E> p, E e) throws IllegalArgumentException{
        Node<E> node = validar(p);
	E answer = node.getElement();
	node.setElement(e);
	return answer;
    }
    public E remove(Position<E> p) throws IllegalArgumentException{
        Node<E> node = validar(p);
	Node<E> predecessor = node.getPrev();
	Node<E> successor = node.getNext();
	predecessor.setNext(successor);
	successor.setPrev(predecessor);
	size--;
	E answer = node.getElement();
	node.setElement(null);
	node.setNext(null);
	node.setPrev(null);
	return answer;
    }
    public E removeFirst() {
	if (isEmpty())
		return null;
	return remove(header.getNext());
    }
    public Position<E> search(E value){
    	Node<E> temp = header.next;
    	Position<E> p = null;
    	while(temp != header) {
       		if(temp.getElement() == value) {
       			p = posicion(temp);
       		}
       		temp = temp.next;
       	}
    	return p;
    }
}
