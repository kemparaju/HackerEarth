/* 
You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000 */

import java.util.Scanner;

class PrimeNumber {
    public static void main(String args[]) {
        int number = new Scanner(System.in).nextInt();
        int i,j;

        for (i=2; i<=number; i++) {
            for(j=2; j<i; j++) {
                if(i%j == 0)
                    break;
            }
            if(i==j)
                System.out.print(i+" ");
        }
    }
}