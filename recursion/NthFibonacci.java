package recursion;

public class NthFibonacci {
    static int nThFib(int n){
        if(n <= 1){
            return n;
        }
        int last = nThFib(n - 1);
        int secLast = nThFib(n - 2);
        return last + secLast;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(nThFib(n));
    }
}
