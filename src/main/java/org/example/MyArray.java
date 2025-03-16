package org.example;

public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capasity){
        this.array = new int[capasity];
        this.size = 0;
    }

    public void insert(int el){
            array[size] = el;
            size++;
    }

    public int find(int el) {
        for (int i = 0; i < size; i++){
            if(array[i] == el){
                return i;
            }
        }
        return -1;
    }

    public void remove(int el){
        int indexArray = find(el);
        for(int i = indexArray; i<size-1; i++){
            array[i] = array[i + 1];
        }
        size--;
    }

    public int getSize(){
        return size;
    }

}
