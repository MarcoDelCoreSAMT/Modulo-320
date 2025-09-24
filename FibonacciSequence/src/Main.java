// FibonacciSequence
// Autore: Marco Del Core

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int max = 1000;
        BigInteger[] fibo = new BigInteger[max];
        fibo[0] = BigInteger.ZERO; fibo[1] = BigInteger.ONE;


        for (int i = 2; i < max; i++){
            fibo[i] = fibo[i-1].add(fibo[i-2]);
        }

        for (int i = 0; i < max; i++){
            System.out.println("F(" + i + ") = " + fibo[i]);
        }

    }
}