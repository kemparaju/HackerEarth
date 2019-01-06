
import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean isPalin = true;

        String str = in.next();

        int i = 0;
        int j = str.length()-1;

        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                isPalin = false;
                break;
            }
            i++;
            j--;
        }
        if(isPalin) 
            System.out.println("YES");
        else
            System.out.println("NO");

        in.close();
    }
}