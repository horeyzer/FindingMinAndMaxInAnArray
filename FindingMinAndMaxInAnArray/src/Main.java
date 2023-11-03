import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        int min = 100, max = 0;

        Random r = new Random();

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = Math.round((r.nextInt(100) + 1));
            System.out.print(num[i] + ", ");
            if (num[i] < min) min = num[i];
            if (num[i] > max) max = num[i];
        }
        System.out.println();
        System.out.println("The smallest value is: " + min);
        System.out.println("The biggest value is: " + max);
    }
}
