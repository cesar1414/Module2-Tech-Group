package data_structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private Integer size;

    MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public int size() {

        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        Node node = first;
        while (node != null) {
            if (node.getValue().equals(value)) {
                return true;
            }
            node = node.getNext();
        }
        return false;

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(T data) {
        Node node = new Node(data);
        if (first == null) {
            first = node;
            last = node;
            size++;
        } else {
            this.last.setNext(node);
            last = node;
            size++;
        }

        return false;
    }

    @Override
    public boolean remove(Object value) {
        Node node = new Node(value);
        Node current = first;
        Node latest = null;
        boolean res = false;
        while (current != null){
            if (current.getValue().equals(node.getValue())){
                if(latest == null){
                    first = first.getNext() == null ? null : first.getNext();
                    last = null;
                    size = size -1;
                    res = true;
                } else {
                    latest.setNext(current.getNext());
                    current = latest;
                    if(latest.getNext() == null){
                        last = latest;
                        res = true;
                    }
                    size = size -1;
                    res = true;
                }
            }
            latest = current;
            current = current.getNext();
        }
        return res;
    }


    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        Node nodeAux = first;
        for (int i = 0; i < size; i++) {
            Node aux = nodeAux.getNext();
            nodeAux.setNext(null);
            nodeAux.setValue(null);
            nodeAux = aux;
        }
        size = 0;
        last = null;
        first = null;
    }

    @Override
    public String toString() {
        String value = "[";
        Node nodeAux = first;
        while (nodeAux != null) {
            if (nodeAux == last) {
                value = value + nodeAux.getValue().toString();
            } else {
                value = value + nodeAux.getValue().toString() + ", ";

            }

            nodeAux = nodeAux.getNext();
        }
        return value + "]";
    }

    @Override
    public T get(int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> auxNode = first;

        for (int i = 0; i < index; i++) {
            auxNode = auxNode.getNext();
        }

        return auxNode.getValue();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
