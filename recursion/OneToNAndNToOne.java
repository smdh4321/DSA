package recursion;

public class OneToNAndNToOne {
        static void oneToN(int count){
        if(count > 5){
            return;
        }
        System.out.print(count+ " ");
        count++;
        oneToN(count);
    }
    static void nToOne(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(count+ " ");
        count--;
        nToOne(count);
    }

    public static void main(String[] args) {
        int count = 1;
        int count2 = 5;
        oneToN(count);
        System.out.println();
        nToOne(count2);
    }
}
