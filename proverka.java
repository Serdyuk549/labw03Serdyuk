/**
 * Created by Максим on 09.10.2016.
 */
public class proverka {
    public static void main(String[] args) {
        labw03 l=new labw03();
        System.out.println(l.logika(1,2,2));
        l.poka(12103);
        double [] d=new double[]{25.53,46.2,2.45,1.888,7.45,90.1,50.23,55.55,43.44,20.0};
        l.massivy(d);
        int [] D=new int[] {3,7,5,4,5};
        int [] DD=new int[] {5,6,8,0,-1};
        l.zadan(D,DD);
    }
}
