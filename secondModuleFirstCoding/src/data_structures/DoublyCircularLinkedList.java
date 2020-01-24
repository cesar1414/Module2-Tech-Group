package data_structures;

public class DoublyCircularLinkedList <T> {
    private NodeDouble<T> first;
    private NodeDouble<T> last;
    private int size;

    public DoublyCircularLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public DoublyCircularLinkedList(NodeDouble<T> first, NodeDouble<T> last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    public int size() {

        return this.size;
    }


    public NodeDouble<T> add(T data) {
        NodeDouble<T> newNode = new NodeDouble<>(data);
        if (this.size == 0) {
            this.first = newNode;
        } else {
            this.last.setNext(newNode);
            newNode.setPreview(this.last);
        }
        this.last = newNode;
        this.size++;
        return newNode;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        NodeDouble<T> nodoAux = this.first;
        while (nodoAux != null) {
            result.append(nodoAux.getValue().toString());
            if (nodoAux != this.last) {
                result.append(", ");
            }
            nodoAux = nodoAux.getNext();
        }
        return result.append("]").toString();
    }

    public boolean contains(T value) {
        NodeDouble<T> nodoAux = first;
        while (nodoAux != null) {
            if (nodoAux.getValue().equals(value)) {
                return true;
            }
            nodoAux = nodoAux.getNext();
        }
        return false;
    }

    public T get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index does not exists in the list");
        }
        NodeDouble<T> nodoAux = this.first;
        for (int i = 0; i < index; i++) {
            nodoAux = nodoAux.getNext();
        }
        return nodoAux.getValue();
    }

    public void clear() {
        NodeDouble nodeAux = first;
        for (int i = 0; i < size; i++) {
            NodeDouble aux = nodeAux.getNext();
            nodeAux.setNext(null);
            nodeAux.setValue(null);
            nodeAux = aux;
        }
        size = 0;
        last = null;
        first = null;
    }

    public boolean remove(Object value) {
        NodeDouble node = new NodeDouble(value);
        NodeDouble current = first;
        NodeDouble latest = null;
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

    public NodeDouble<T> getFirst() {
        return first;
    }

    public NodeDouble<T> getLast() {
        return last;
    }
}
