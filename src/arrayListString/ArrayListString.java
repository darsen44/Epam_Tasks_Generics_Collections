package arrayListString;


import java.util.HashSet;

public class ArrayListString {
    private final static int DEFAULT_CAPACITY = 10;
    private String[] array;
    private int loadCapacity;
    private int capacity;


    public ArrayListString(String[] array) {
        this.array = array;
        this.capacity = this.loadCapacity = array.length;
    }

    public ArrayListString(int capacity) {
        this.capacity = capacity;
        array = new String[capacity];
        loadCapacity = 0;
    }

    public ArrayListString() {
        this(DEFAULT_CAPACITY);
    }

    void add(String s){
        if(loadCapacity == capacity){
            resize();
        }
        array[loadCapacity++] = s;
    }

    String get(int index){
        return array[index];
    }

    private void resize() {
        int newSize = (array.length *3)/2 +1;
        String[] temp = new String[newSize];
        for (int i = 0; i < array.length ; i++) {
            temp[i] = array[i];
        }
        array = temp;
        capacity = array.length;
    }
}
