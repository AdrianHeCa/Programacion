package Ev2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayLists_2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>(20);
        List<Integer> numsPares = new ArrayList<>();
        List<Integer> numsImpares = new ArrayList<>();
        int numCount = 0;

        while (numCount < 20) {
            int randNum = random.nextInt(99);
            nums.add(randNum);
            if (randNum%2 == 0) {
                numsPares.add(randNum);
            } else {
                numsImpares.add(randNum);
            }
            numCount++;
        }


        System.out.println("Números: " + nums);
        System.out.println("Números pares: " + numsPares);
        System.out.println("Números impares: " + numsImpares);
    }
}
