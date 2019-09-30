package Maths;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + factorial(n));
    }

    /**
     * Calculate factorial
     *
     * @param n the number
     * @return the factorial of {@code n}
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new ArithmeticException("n < 0");
        }
        
        long fac = 1;
        if(n==0)
            fac=1;
        else
        {
        for (int i = 1; i <= n; ++i) {
            fac *= i;
        }
        }
        return fac;
    }
}
