package Ev2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayLists_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>(5);
        int numCount = 0;

        while (numCount < 5) {
            System.out.println("Introduce un número");
            nums.add(input.nextInt());
            numCount++;
        }

        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);
        
        System.out.println("El máximo es " + max + " que se encuentra en la posición " + nums.indexOf(max));
        System.out.println("El minimo es " + min + " que se encuentra en la posición " + nums.indexOf(min));

        input.close();
    }
}
