
import java.util.*;

class Anagarams {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        HashMap<String, Integer> anagram = new HashMap<>(); 
        int numberOfDeletion = 0;

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while(t > 0) {
            numberOfDeletion = 0;
            str1 = input.next();
            str2 = input.next();

            for(String c : str1.split("")) {
                if(anagram.get(c) == null)
                    anagram.put(c, 0);
                else
                    numberOfDeletion += 1;
            }
    
            for(String c : str2.split("")) {
                if(anagram.get(c) == null) 
                    numberOfDeletion += 1;
                else {
                    if(anagram.get(c) <=1)
                        anagram.put(c,  anagram.get(c) + 1);
                    else
                        numberOfDeletion += 1;
                }
            }
    
            for(Map.Entry<String, Integer> entry : anagram.entrySet()) {
                if(entry.getValue() == 0)
                    numberOfDeletion += 1;
            }
    
            System.out.println(numberOfDeletion);
            t--;
        }
    }
}