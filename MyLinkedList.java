package Task5;

public class MyLinkedList<E> {
    E[] arr;

    public boolean contains(E e){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                return true;
            }
        }
        return false;
    }

    public E get(int index){
        return (E) arr[index];
    }

    public int indexOf(E e){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] == e) {
                return i;
            }
        }
        return -1;
    }
    public void set(int index, E e) {
        arr[index] = e;
    }
}

