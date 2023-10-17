import java.util.Random;
import java.util.Arrays;
public class RandomNumShuffle
{
    static void randomize( int a[], int n)
    {
        Random r = new Random();
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i+1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
         public static void main(String[] args) 
    {
         
         int[] a = {1, 2, 3, 4, 5, 6, 7};
         int n = a.length;
         randomize (a, n);
    }
}
