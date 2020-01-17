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

    public NodeDouble<T> getFirst() {
        return first;
    }

    public void setFirst(NodeDouble<T> first) {
        this.first = first;
    }

    public NodeDouble<T> getLast() {
        return last;
    }

    public void setLast(NodeDouble<T> last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean add(T data) {
        NodeDouble<T> node = new NodeDouble<>(data);
        if (first == null) {
            first = node;
            last = null;
            size++;

        } else {
            last = node;
            this.last.setNext(last);
            this.last.setPreview(last.getPreview());
            size++;
        }
        return false;
    }

}
