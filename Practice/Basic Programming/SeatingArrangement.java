/* Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one day and they got interested 
in the seating arrangement of their compartment. The compartment looked something like 


So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as follows : 

Window Seat : WS
Middle Seat : MS
Aisle Seat : AS

You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

INPUT
First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a single integer N denoting the seat-number.

OUTPUT
For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.

CONSTRAINTS
1<=T<=105
1<=N<=108 */

import java.util.*;

class SeatingArrangement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int seatingRow, t, extra;
        int[] evenRowSeatDiff = new int[]{1,3,5,7,9,11};
        int[] oddRowSeatDiff = new int[]{11,9,7,5,3,1};

        t = in.nextInt();
        int[] input = new int[t];

        for(int i=0; i<t; i++) {
            input[i] = in.nextInt();
        }

        for(int n : input) {
            seatingRow = n/6;
            extra = n%6;

            if(extra > 0) {
                seatingRow += 1;

                if(seatingRow % 2 == 0)
                    System.out.print(n - evenRowSeatDiff[extra-1]);
                else 
                    System.out.print(n + oddRowSeatDiff[extra -1]);

                switch(extra) {
                    case 1: System.out.println(" WS");  break;
                    case 5:
                    case 2: System.out.println(" MS");  break;
                    case 3:
                    case 4: System.out.println(" AS");  break;
                }

            } else {
                if(seatingRow%2 == 0)
                    System.out.print(n-11);
                else 
                    System.out.print(n+1);

                System.out.println(" WS");
            }
        }

        in.close();
    }
}