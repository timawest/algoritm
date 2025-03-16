package org.example;

public class MyOrderedArray {
    private int[] array;
    private int size;

    public MyOrderedArray(int max) {
        this.array = new int[max];
        this.size = 0;
    }

    public void put(int el) {
        int i;
        for (i = 0; i < size; i++) {
            if (array[i] > el) break;
        }
        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = el;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
