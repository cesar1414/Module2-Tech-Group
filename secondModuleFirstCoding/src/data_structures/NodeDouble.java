package data_structures;

public class NodeDouble <T>{
    private NodeDouble<T> next;
    private NodeDouble<T> preview;
    private T value;

    public NodeDouble(T data) {
        this.next = null;
        this.preview = null;
        this.value = data;

    }


    public NodeDouble<T> getNext() {
        return next;
    }

    public void setNext(NodeDouble<T> next) {
        this.next = next;
    }

    public NodeDouble<T> getPreview() {
        return preview;
    }

    public void setPreview(NodeDouble<T> preview) {
        this.preview = preview;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
