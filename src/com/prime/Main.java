package com.prime;

import java.util.List;

/**
 * Created by laubema on 9/21/15.
 */
public class Main {
    public static void main(String[] args) {
        testPrimes(1);
        testPrimes(5);
        testPrimes(100);
        testPrimes(99999);
        testPrimes(777777);
        testPrimes(456435416);
        testPrimes(1562456);
    }

    public static void testPrimes(int n) {
        System.out.println("---"+n+"---");

        List<Integer> primes = Prime.getPrimes(n);

        for (Integer prime : primes) {
            System.out.println(prime);
        }
        System.out.println("");
    }
}
