package arapiraca.ufal.gti;

public class Main {

    public static void main(String[] args) {
        int n = 20;
        long result = Main.fatorial(n);
        System.out.println("fatorial: " + result);
    }

    public static long fatorial (int n) {
        if (n == 0) return 1;
        return n * fatorial(n - 1);
    }
}