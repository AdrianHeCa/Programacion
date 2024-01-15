package Ev2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioLista_2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for (int i : nums) {
            if (i % 2 == 0) {
                i *= 2;
                System.out.println(i);
            } else {
                System.out.println(i);
            }
        }
    }
}
