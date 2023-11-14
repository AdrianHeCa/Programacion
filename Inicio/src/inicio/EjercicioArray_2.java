public class EjercicioArray_2 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i : nums) {
            if (i % 2 == 0) {
                i *= 2;
                System.out.println(i);
            }else {
                System.out.println(i);
            }
        }
    }
}
