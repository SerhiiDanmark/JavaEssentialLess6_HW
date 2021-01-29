package methods;

import java.util.Arrays;

public class MyArraylist {

    int[] arr = new int[15];
    private int size;

    public void add (int element) {
        if (size == arr.length) {
            int[] newArr = new int [size * 3 /2 + 1];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    public void remove (int index) {
        arr[index] = 0;
        size--;
    }

    public void clear () {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
            size = 0;
        }
    }

    public int get (int index) {
        return arr[index];
    }

    public int set (int index, int element) {
        return arr[index] = element;
    }

    public int size () {
        return size;
    }

    public boolean contains (int element) {
        for (int i : arr) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return (Arrays.toString(arr));
    }
}
