package exercise2;

public class MathOp {

    public static void main(String[] args) {

        int n = 365;
        int s = n / 100;
        int d = n / 10 % 10;
        int e = n % 10;
        System.out.println(s);
        System.out.println(d);
        System.out.println(e);
    }
}
