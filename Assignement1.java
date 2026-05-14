record LCFState(int callNumber, int n, int m, int remainder) {
    public String toString() {
        return "Call " + callNumber + ": n=" + n + ", m=" + m + ", remainder=" + remainder;
    }
}

public class Assignement1 {

    public static void main(String[] args) {
        System.out.println("Names: Hadi Al Kourdi and Arun \nStudent ID: 40306479\n");
        int n = 48;
        int m = 18;
        int result = lcfRecursive(n, m, 1);
    }

    public static int lcfRecursive(int n, int m, int callNumber) {
        int remainder = n % m;
        LCFState state = new LCFState(callNumber, n, m, remainder);
        System.out.println(state);

        if (remainder == 0) {
            System.out.println("Base case reached where remainder is 0 and LCF = " + m);
            return m;
        } else {
            return lcfRecursive(m, remainder, callNumber + 1);
        }
    }
}
