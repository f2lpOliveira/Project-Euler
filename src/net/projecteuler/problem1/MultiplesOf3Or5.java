package net.projecteuler.problem1;
/*
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
* The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/
public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        int multiples = 1000;
        int index = 1;
        int sum = 0;

        while(index < multiples){
            if (index % 3 == 0 || index % 5 == 0){
                sum += index;
            }
            index++;
        }
        System.out.println(sum);
    }
}
