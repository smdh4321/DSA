package recursion;

public class OneToNAndNToOneBT {
    static void oneToNAndNToOne(int n){
        if(n == 0){
            return;
        }
        oneToNAndNToOne(n - 1);
        System.out.print(n + " ");
    }
    static void oneToNAndNToOne1(int n){
        if(n == 6){
            return;
        }
        oneToNAndNToOne1(n + 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        int n2 = 1;
        oneToNAndNToOne(n);
        System.out.println();
        oneToNAndNToOne1(n2);
    }
}
