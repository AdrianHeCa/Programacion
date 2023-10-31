package inicio;

import java.util.Scanner;

public class Practica_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCount = 0;
        int nums[] = new int[10];
        int pos = 0;
        int neg = 0;
        
        while (numCount < 10) {
            System.out.println("Inserte un número: ");
            int num = Integer.parseInt(input.nextLine());
            nums[numCount] = num;
            numCount++;
        }

        for (int i = 0; i < numCount; i++) {
            if (nums[i] > 0) {
                pos++;
            }else {
                neg++;
            }
        }
        System.out.println("Cantidad de números positivos: " + pos);
        System.out.println("Cantidad de números negativos: " + neg);
        input.close();
    }
}
