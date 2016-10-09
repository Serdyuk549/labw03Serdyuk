/**
 * Created by Максим on 09.10.2016.
 */
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Максим on 19.09.2016.
 */
interface var07 {
    public double logika(double d1, double d2, double d3);
    public void poka(int N);
    public void massivy(double[] A);
    public void zadan(int[] A, int [] B);
}

public class labw03 implements var07 {
    public double logika(double d1, double d2, double d3) {
        if (d1 == d2 || d2 == d3 || d1 == d3)
            return 1;
        else return 0;
    }

    public void poka(int N) {
        if (N < 0)
            System.out.println("The number N is negative!");
        else {
            if (N%10 == 2 || (N%100>=20 && N%100<=29) || (N%1000>=200 && N%1000<=299) || (N%10000>=2000 && N%10000<=2999)) System.out.println("true");
            else System.out.println("false");
        }
    }
    public void massivy(double [] A){
        int k=0;
        System.out.println("The numbers of elements that are bigger than the next ones:");
        for (int i=0; i<A.length-1; i++) {
            if (A[i]>A[i+1]) {
                System.out.print(i+" ");
                k++;
            }
        }
        System.out.println("\nThe number of those elements is "+k);
    }
    public void zadan(int[] A, int [] B) {
        Integer []C=new Integer[A.length];
        if (A.length!=B.length) return;
        for (int i=0; i<A.length; i++)
            C[i]=A[i]-B[i];
        /*int max=C[0], temp;
        for (int i=0; i<C.length; i++) {
            if (C[i]>max) {
                temp = max;
                max=C[i];
                C[i]=temp;
            }
        }*/
        Arrays.sort(C, Collections.reverseOrder());
        for (int i=0; i<C.length; i++)
            System.out.println(C[i]);
    }
}
