package net.projecteuler.problem10;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {

    public static void main(String[] args) {

        int sum = 0;

        for (int index = 1; index < 100; index++) {
            if (index != 1) {
                if (!(index != 2 && index % 2 == 0)) {
                    if (!(index != 3 && index % 3 == 0)) {
                        if (!(index != 5 && index % 5 == 0)) {
                            if (!(index != 7 && index % 7 == 0)) {
                                if (!(index != 11 && index % 11 == 0)) {
                                    sum += index;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
