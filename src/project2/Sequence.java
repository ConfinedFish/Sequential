package project2;
@SuppressWarnings("unchecked")
public class Sequence<E> {
    private int size;
    private Object[] data;
    
    public Sequence(){
        this.size = 10;
        this.data = new Object[size];
    }
    public Sequence(int size){
        this.size = size;
        this.data = new Object[size];
    }
    
    int size(){
        return size;
    }
    void append(E element){
        if (!(getLastPosition() < size)){
            data [getLastPosition() + 1] = element;
        }
    }
    void set(int index, E value){
        data[index] = value;
    }

    E get(int index){
        return (E) data[index];
    }
    int getLastPosition(){
        for (int i = size - 1; i >= 0; i--){
            if (data[i] != null){
                return i;
            }
        }
        return 0;
    }
}
