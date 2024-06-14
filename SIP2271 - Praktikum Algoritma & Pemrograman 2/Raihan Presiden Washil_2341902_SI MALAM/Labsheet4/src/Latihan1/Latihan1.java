package Latihan1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Latihan1 {

    public static void main(String[] args) {
        // Array awal
        Integer[] array = {8, 9, 4, 7, 6, 1, 5, 3};

        // Membalik urutan array
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        array = list.toArray(array);

        // Menampilkan array yang dibalik
        System.out.println("Array yang telah dibalik: " + Arrays.toString(array));
    }
}
