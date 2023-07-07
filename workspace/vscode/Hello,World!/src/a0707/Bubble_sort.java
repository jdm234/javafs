package a0707;

public class Bubble_sort {
    public static void Bubble_sort(int[] a) {
        Bubble_sort(a, a.length);
    }

    private static void Bubble_sort(int[] a, int size) {
        for(int i = 1; i < size; i++) {
            for(int j = 0; j < size - i; j++) {
                if(a[j] > a [j + 1]) {
                    swap(a, j, j +1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
