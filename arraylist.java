// implemented ArrayList
public class arraylist {
    private int arr[];
    private int capacity;
    private static int size;

    arraylist() {
        arr = new int[10];
        size = 0;
        capacity = 10;
    }

    void add(int num) {

        if (size == capacity) {
            int[] newArr = new int[2 * capacity];
            for (int i = 0; i < capacity; i++) {
                newArr[i] = arr[i];
            }
            this.arr = newArr;
            capacity = capacity * 2;
        }
        arr[size] = num;
        size++;

    }

    void remove() {
        if (size > 0) {
            this.arr[size - 1] = 0;
            size--;
        }
    }

    void set(int index, int num) {
        if (index >= 0 && index < size) {
            this.arr[index] = num;
        }
    }

    int get(int index) {
        if (index >= 0 && index < size) {
            return this.arr[index];
        }
        return -1;
    }

    int size() {
        return this.size;
    }

    int capacity() {
        return this.capacity;
    }

    public static void main(String[] args) {
        arraylist arr1 = new arraylist();
        for (int i = 0; i <= 45; i++) {
            System.out.println(arr1.size() + " - " + arr1.capacity());
            arr1.add(i);
        }

    }
}
