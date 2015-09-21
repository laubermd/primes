package com.prime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laubema on 9/21/15.
 */
public class Prime {

    /**
     * Returns the list of prime factor for n, excluding 1 and n
     * @param n
     * @return
     */
    public static List<Integer> getPrimes(int n) {
        List primes = new ArrayList<>();
        int ii = 2;
        while (n >= ii * ii) {
            if (n % ii == 0) {

                int jj = n/ii;

                if (getPrimes(ii).size() == 0)
                    primes.add(ii);

                if (jj != ii && getPrimes(jj).size() == 0) {
                    primes.add(jj);
                }
            }
            ii++;
        }

        return primes;
    }
}
