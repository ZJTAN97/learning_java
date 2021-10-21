package Heaps;

// Implementation of Heap using Array

public class Heap {
    private Integer[] heapData;
    private int currentPosition = -1;

    // Constructor to set size of heap
    public Heap(int size) {
        this.heapData = new Integer[size];
    }

    public void insert(int item) {
        if(isFull())
            throw new RuntimeException("Heap is full");
        this.heapData[++currentPosition] = item;
        System.out.print(item);
        System.out.println(" is inserted into Heap.");
        fixUp(currentPosition);
    }

    private boolean isFull() {
        return currentPosition == heapData.length -1;
    }

    private void fixUp(int index) {
        int i = (index-1)/2; // parent index
        while (i >= 0 && heapData[i] < heapData[index]) {
            int tmp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = tmp;
            index = i;
            i = (index-1)/2;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(13);
    }

}
