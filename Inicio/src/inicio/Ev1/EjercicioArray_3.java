package Ev1;

public class EjercicioArray_3 {
    public static void main(String[] args) {
        int nums[][] = {{1,1,1}, {2,2,2}, {3,3,3}};

        for (int[] is : nums) {
            int suma = 0;
            for (int is2 : is) {
                suma += is2;
            }
            System.out.println(suma);
        }
    }
}
