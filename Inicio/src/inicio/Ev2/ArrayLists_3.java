package Ev2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayLists_3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>(50);
        int numCount = 0;

        while (numCount < 50) {
            nums.add(random.nextInt(99));
            numCount++;
        }

        System.out.println("Lista: " + nums);
        Collections.sort(nums);
        Collections.reverse(nums);
        System.out.println("Lista ordenada descendientemente: " + nums);
    }
}
